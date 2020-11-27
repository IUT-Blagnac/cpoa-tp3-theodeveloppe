import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;

public class TestPizzeriaFactory  extends TestCase {

    @Test
    public void testBrest() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        assertEquals(new PizzeriaBrest(PizzaFactoryBrest.getInstance()).fabrique, boutiqueBrest.fabrique);
    }

    @Test
    public void testStrasbourg() {
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");
        assertEquals(new PizzeriaBrest(PizzaFactoryStrasbourg.getInstance()).fabrique, boutiqueStrasbourg.fabrique);
    }

    @Test
    public void testNull() {
        Pizzeria boutiqueNull = PizzeriaFactory.getInstance().creer("Toulouse");
        assertEquals(null, boutiqueNull);
    }

    @Test
    public void testNotEquals() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueBrest2 = PizzeriaFactory.getInstance().creer("Brest");
        assertNotEquals(boutiqueBrest, boutiqueBrest2);
    }



}
