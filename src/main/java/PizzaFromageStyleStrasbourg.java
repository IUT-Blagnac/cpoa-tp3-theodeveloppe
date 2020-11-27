import java.util.ArrayList;

public class PizzaFromageStyleStrasbourg extends Pizza{

    public PizzaFromageStyleStrasbourg(){
        this.name = "Pizza fromage style Strasbourg";
        this.garnitures.add("Mozzarella en lamelles");
    }

    @Override
    void couper() {
        System.out.println("Découpage en parts carrés");
    }
}
