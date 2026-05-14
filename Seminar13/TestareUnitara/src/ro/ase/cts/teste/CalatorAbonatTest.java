package ro.ase.cts.teste;

import org.junit.Assert;
import ro.ase.cts.clase.CalatorAbonat;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testPlatesteBilet() {
        CalatorAbonat c1 = new CalatorAbonat("Dasu");
        c1.setSold(15);
        c1.platesteBilet(5);
        Assert.assertEquals(4.5, c1.getSold(), 0.0001);

    }

    @org.junit.Test
    public void testPlatesteBilet2() {
        CalatorAbonat c1 = new CalatorAbonat("Dasu");
        c1.setSold(15);
        c1.platesteBilet(15);
        Assert.assertEquals(5.5, c1.getSold(), 0.0001);

    }
}