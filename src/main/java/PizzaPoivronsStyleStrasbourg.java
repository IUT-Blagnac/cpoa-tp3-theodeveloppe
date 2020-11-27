/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaPoivronsStyleStrasbourg extends Pizza {


    public PizzaPoivronsStyleStrasbourg(){
        this.name = "Pizza poivrons style Strasbourg";
        this.garnitures.add("Des poivrons multicolores");
    }

    @Override
    void couper() {
        System.out.println("Découpage en parts carrés");
    }
}
