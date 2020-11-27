public class PizzaFactoryBrest extends PizzaFactory{


    private static PizzaFactoryBrest instance = new PizzaFactoryBrest();
    private PizzaFactoryBrest() {}

    public Pizza creerPizza(String type) {
        Pizza pizza;
        if (type.equals("fromage")) {
            pizza = new PizzaFromageStyleBrest();
        } else if (type.equals("grecque")) {
            pizza = new PizzaGrecqueStyleBrest();
        } else {
            pizza = new PizzaPoivronsStyleBrest();
        }
        return pizza;
    }
    public static PizzaFactoryBrest getInstance(){
        return instance;
    }

}
