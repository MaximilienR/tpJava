package com.example.microserviceproduit.tool;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@Service
public class RestProduit<T,V> {

    private String server ="http://localhost:8082/";
    private RestTemplate template;
    private HttpHeaders  headers;

    public RestProduit(){
        template=new RestTemplate();
        headers=new HttpHeaders();
        headers.add("Accept","*/*");
        headers.add("content-type", "application/json");
    }  public T get(String uri, Class<T> type) {
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);

        ResponseEntity<T> responseEntity = template.exchange(server + uri, HttpMethod.GET, requestEntity, type);
        //ResponseEntity<T> responseEntity = template.getForEntity(server + uri, type);
        status = responseEntity.getStatusCode();
        return responseEntity.getBody();
    }

    public T Post(String uri,V data, Class<T> type) {
        HttpEntity<V> requestEntity = new HttpEntity<>(data, headers);
        ResponseEntity<T> responseEntity = template.exchange(server + uri, HttpMethod.POST, requestEntity,type);
        status = responseEntity.getStatusCode();
        return responseEntity.getBody();
    }
}
