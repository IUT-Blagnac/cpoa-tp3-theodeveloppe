public class PizzaGrecqueStyleBrest extends Pizza{

    public PizzaGrecqueStyleBrest(){
        this.name = "Pizza grecque style Brest";
        this.garnitures.add("Olives grecques");
    }
    @Override
    void couper() {
        System.out.println("Découpage en parts triangles");
    }
}
