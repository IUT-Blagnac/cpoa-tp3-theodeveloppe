/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaGrecqueStyleStrasbourg extends Pizza {


    public PizzaGrecqueStyleStrasbourg(){
        this.name = "Pizza grecque style Strasbourg";
        this.garnitures.add("Olives grecques");
    }
    @Override
    void couper() {
        System.out.println("Découpage en parts carrés");
    }
}
