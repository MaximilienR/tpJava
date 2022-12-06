package com.example.tp1jee;

import com.example.tp1jee.entities.Produit;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.List;

@WebServlet(name = "produitServlet",value = "/produit")
public class ProduitServlet extends HttpServlet {
    private List<Produit> produits;

    public void test(HttpServletRequest request, HttpResponse response) throws IOException{
    response.setContentType("text/html");
    PrintWriter writer=response.getWriter();
    writer.println("<html><body>");

        for(Produit produit : produits){
            writer.println("<div>");
            writer.println(produit.getReference());
            writer.println("</div>");
    }
            writer.println("</body><html>")
    }
}
