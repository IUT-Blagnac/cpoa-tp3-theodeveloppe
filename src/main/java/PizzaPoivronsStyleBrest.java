public class PizzaPoivronsStyleBrest extends Pizza{

    public PizzaPoivronsStyleBrest(){
        this.name = "Pizza poivrons style Brest";
        this.garnitures.add("Des poivrons multicolores");
    }

    @Override
    void couper() {
        System.out.println("Découpage en parts triangles");
    }

}
