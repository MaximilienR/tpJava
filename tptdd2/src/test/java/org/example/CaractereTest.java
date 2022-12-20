/*package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public class CaractereTest {

     private Character characterControle;

     @BeforeEach
     void setUp(){
         characterControle = new CharacterControle();
         characterControle.setcharacters(Arrays.asList("Lille","Lyon","Lens"));
     }

     @Test
    void  methodeTestCaractere() throws Exception{
        Assertions.assertTrue(character.result);
    }
}



import org.junit.jupiter.api.Test;

@BeforeEach
    void setUp() {
        rechercheVille = new RechercheVille();
        rechercheVille.setVilles(Arrays.asList("Valence", "Vancouver","Amsterdam"));
    }

    //Q1
    @Test
    void rechercherShouldRaiseExceptionWhenMotIslessThen2chars() {
        Assertions.assertThrowsExactly(NotFoundException.class, () -> {
            rechercheVille.rechercher("a");
        });

    }

    //Q2
    @Test
    void recheregalosup2chars(){
    Assertions.asser
            }

package org.example;

import org.example.exception.NotFoundException;

import java.util.List;

public class CaractereTestt {
    private List<String> villes;

    public List<String> getVilles() {
        return villes;
    }

    public void setVilles(List<String> villes) {
        this.villes = villes;
    }

    public List<String> rechercher(String mot) throws Exception {
        if(mot.length() < 2) {
            throw new NotFoundException();
        }
        throw new Exception();
    }
    //test
    public  List<String> recherche(String text ) throws Exception{
        if (text.length() >= 2){
            System.out.println(villes);
        }
        throw  new Exception();
    }
}*/