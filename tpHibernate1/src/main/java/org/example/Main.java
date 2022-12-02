package org.example;

import org.example.entities.Produit;
import org.example.service.ProduitService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //ec 1

        //create des produits
        ProduitService ps=new ProduitService();
        ps.create(new  Produit("TOSHIBA","zzaa123",new Date("2016/01/08"),51004,));
        ps.create(new  Produit("HP","gefvf",new Date("2016/01/08"),51004,));
        ps.create(new  Produit("Sony","azrt13",new Date("2016/01/08"),51004,));
        ps.create(new  Produit("DELL","qwerty2",new Date("2016/01/08"),51004,));
        ps.create(new  Produit("HP","errgtg6",new Date("2016/01/08"),51004,));

        //information produit id = 2
        Produit p = ps.findById(2);
        System.out.println(p.getId()+","+p.getManque()+","+p.getReference());

        //supprimer le produit dont id = 3
        session.delete(ps.findBy(3));
        //modifier
        p=ps.findById(1);
        if(p !=null){
            p.setManque("hp");
            p.setDateAchat(new Date("2015/09/08"));
            p.setPrix(50000);
            ps.update(p);
        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}