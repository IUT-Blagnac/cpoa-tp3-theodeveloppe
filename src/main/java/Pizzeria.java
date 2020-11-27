/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
abstract class Pizzeria {


	PizzaFactory fabrique ;
	PizzeriaFactory fect;

	/**
	 * Constructeur
	 * @param fabrique
	 */
	public Pizzeria(PizzaFactory fabrique) {
		this.fabrique = fabrique ;
	}

	/**
         * @param type
         * @return a Pizza object according to the type
         */
		public Pizza commanderPizza(String type) {

		Pizza pizza;

		pizza = fabrique.creerPizza(type);

		pizza.preparer();
		pizza.cuire();
		pizza.ajoutGarn();
		pizza.couper();
		pizza.emballer();

		return pizza;
		}
}