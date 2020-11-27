import junit.framework.TestCase;
import org.junit.Test;

public class TestPizza extends TestCase {
    @Test
    public void testPizzaTypesBrest() {
        Pizzeria boutiqueBrest = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
        Pizza cheese = boutiqueBrest.commanderPizza("fromage");
        assertEquals(new PizzaFromageStyleBrest().name, cheese.name);
        Pizza grecque = boutiqueBrest.commanderPizza("grecque");
        assertEquals(new PizzaGrecqueStyleBrest().name, grecque.name);
        Pizza poivrons = boutiqueBrest.commanderPizza("poivrons");
        assertEquals(new PizzaPoivronsStyleBrest().name, poivrons.name);
    }

    @Test
    public void testPizzaTypesStrasbourg() {
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
        Pizza cheese = boutiqueStrasbourg.commanderPizza("fromage");
        assertEquals(new PizzaFromageStyleStrasbourg().name, cheese.name);
        Pizza grecque = boutiqueStrasbourg.commanderPizza("grecque");
        assertEquals(new PizzaGrecqueStyleStrasbourg().name, grecque.name);
        Pizza poivrons = boutiqueStrasbourg.commanderPizza("poivrons");
        assertEquals(new PizzaPoivronsStyleStrasbourg().name, poivrons.name);
    }

    @Test
    public void testPizzaTest() {
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
        Pizza cheese = boutiqueStrasbourg.commanderPizza("test");
        assertEquals(new PizzaPoivronsStyleStrasbourg().name, cheese.name);
        Pizzeria boutiqueBrest = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
        Pizza cheeseBrest = boutiqueBrest.commanderPizza("test");
        assertEquals(new PizzaPoivronsStyleBrest().name, cheeseBrest.name);
    }

}
