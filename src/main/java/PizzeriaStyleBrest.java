public class PizzeriaStyleBrest extends SimpleFabriqueDePizzas {


    @Override
    public Pizza creerPizza(String typePizza) {
        Pizza pizza = new PizzaGrecque();
        return pizza;
    }

}
