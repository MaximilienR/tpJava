package com.example.tphotelspring.interfaces.impl;

import com.example.tphotelspring.entity.Client;
import com.example.tphotelspring.interfaces.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository implements BaseRepository <Client> {

    @Override
    public boolean create(Client o) {
        return false;
    }

    @Override
    public boolean update(Client o) {
        return false;
    }

    @Override
    public boolean delete(Client o) {
        return false;
    }

    @Override
    public Client findById(int id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }
}
