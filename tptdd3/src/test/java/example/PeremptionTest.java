package example;

import example.example.Perremption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PeremptionTest {
    private Peremption peremption;

    @BeforeEach
    void foo(){}
    @Test
    void  testSiProduitConsommable() throws Exception {
        Perremption perremption=new Perremption();
        boolean resulta = perremption.compareDate(10-12-2022,12-12-2022);
        Assertions.assertFalse(true,resulta);
    }
    @Test

    @Test

    @Test

    @Test
}
