import product_client_impl.NYPizzaStore;
import product_client_impl.PizzaStore;

/**
 * Created by Sunil on 29/04/16.
 */
public class FactoryPattern {
    /**
     * The entry point of the application that demonstrates the functionality of the PizzaStore.
     *
     * <p>This method creates an instance of a New York style pizza store and orders a cheese pizza.</p>
     *
     * @param args Command line arguments passed to the program. This parameter is not used in this implementation.
     *
     * @throws IllegalArgumentException if the pizza type is not recognized by the pizza store.
     * @throws NullPointerException if the pizza type is null.
     */
    public static void main(String args[]) {
        
        PizzaStore pizzaStore =  new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        
    }
}
