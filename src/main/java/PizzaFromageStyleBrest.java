/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromageStyleBrest extends Pizza {

    public PizzaFromageStyleBrest(){
        this.name = "Pizza fromage style Brest";
        this.garnitures.add("Parmigiano reggiano rapé");
    }

    @Override
    void couper() {
        System.out.println("Découpage en parts triangles");
    }
}
