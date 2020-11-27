public class PizzaFactoryStrasbourg extends PizzaFactory{

    private static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();
    private PizzaFactoryStrasbourg() {}

    public Pizza creerPizza(String type) {
        Pizza pizza;
        if (type.equals("fromage")) {
            pizza = new PizzaFromageStyleStrasbourg();
        } else if (type.equals("grecque")) {
            pizza = new PizzaGrecqueStyleStrasbourg();
        } else {
            pizza = new PizzaPoivronsStyleStrasbourg();
        }
        return pizza;
    }
    public static PizzaFactoryStrasbourg getInstance(){
        return instance;
    }


}
