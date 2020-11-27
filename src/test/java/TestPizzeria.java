import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;


public class TestPizzeria extends TestCase {

    @Test
    public void testPizzaNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
        Pizza miam = boutiqueBrest.commanderPizza("fromage");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void testDeuxPizzaDifferent() {
        Pizzeria boutiqueBrest = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
        Pizza miam1 = boutiqueBrest.commanderPizza("fromage");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("grecque");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}
