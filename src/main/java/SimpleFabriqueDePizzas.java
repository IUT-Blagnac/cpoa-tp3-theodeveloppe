public abstract class SimpleFabriqueDePizzas extends Pizza {

    public Pizza creerPizza(String type) {
        Pizza pizza;

        if (type.equals("fromage")) {
            pizza = new PizzeriaStyleBrest();
        } else if (type.equals("poivron")) {
            pizza = new PizzeriaStyleStrasbourg();
        } else  {
            pizza = new PizzaGrecque();
        }

        return pizza;
    }


}
