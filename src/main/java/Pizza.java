import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnitures = new ArrayList<>();

	public void preparer() {
		System.out.println("Etalage de la pâte ...");
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	public void ajoutGarn(){
		System.out.println("Ajout des garnitures...");
		for( int i = 0; i < garnitures.size() ; i++){
			System.out.println("  "+garnitures.get(i));
		}
	}

	abstract void couper();

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}

	public String getNom(){
		return this.name;
	}

}
