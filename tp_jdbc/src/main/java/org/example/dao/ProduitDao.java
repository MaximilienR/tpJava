package org.example.dao;

import org.example.domain.Produit;
import org.example.utils.ConnexionBdd;

import java.sql.Connection;
import java.util.List;
import java.sql.*;

public class ProduitDao implements  IDeoProduit{
    @Override
    public Produit getProduit(Integer id) {
        Produit p =null;
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet rs=null;

        try {
            connection = ConnexionBdd.getMySQLConnection();
            String sql = "SELECT * FROM produit WHERE id_prod=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            rs = statement.executeQuery();

            if (rs.next()) {
                p = new Produit(
                        rs.getInt("id_prod"));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return p;
    }

    @Override
    public List<Produit> getAllProduit() {
        return null;
    }

    @Override
    public void deleteProduit(Produit produit) {

    }

    @Override
    public void update(Produit produit) {

    }

    @Override
    public void updateProduit(Produit produit) {

    }
}
