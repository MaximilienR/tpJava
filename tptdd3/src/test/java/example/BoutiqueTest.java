package org.example;

import example.example.Boutique;
import example.example.Produit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoutiqueTest {
    private Boutique boutique;
    private Produit produit;

    @BeforeEach
    void setUp() {
        boutique= new Boutique();
    }

    @Test
    void testUpdateShouldDecreaseQuality() throws Exception {
        //A
        produit = new Produit("cat 1", "test", 10, 10);
        //Act
        Boutique.update(produit);
        //Assert
        Assertions.assertEquals(9, produit.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseSellIn() throws Exception {
        //A
        produit = new Produit("cat 1", "test", 10, 10);
        //Act
        boutique.update(produit);
        //Assert
        Assertions.assertEquals(9, produit.getSellIn());
    }

    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenSellInIs0() throws Exception {
        //A
        produit = new Produit("cat 1", "test", 0, 9);
        //Act
        boutique.update(produit);
        //Assert
        Assertions.assertEquals(4.5, produit.getQuality());
    }

    @Test
    void testUpdateShouldRaiseExceptionWhenQualityIsNegative() throws Exception {
        //A
        produit = new Produit("cat 1", "test", 0, -9);
        Assertions.assertThrowsExactly(QualityException.class, () -> {
            boutique.update(produit);
        });
    }
}