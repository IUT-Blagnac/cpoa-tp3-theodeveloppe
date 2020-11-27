public class PizzeriaFactory {
    Pizzeria pizzeria;
    private static PizzeriaFactory instance = new PizzeriaFactory();

    private PizzeriaFactory() {}


    public Pizzeria creer(String type){
        if(type.equals("Brest")){
            pizzeria = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
        }else if(type.equals("Strasbourg")){
            pizzeria = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
        }else{
            pizzeria = null;
        }
        return pizzeria;
    }

    public static PizzeriaFactory getInstance(){
        return instance;
    }
}