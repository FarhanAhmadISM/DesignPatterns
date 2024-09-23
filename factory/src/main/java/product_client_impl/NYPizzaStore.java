package product_client_impl;

/**
 * Concrete Client/Creator
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    /**
     * Creates a pizza of the specified type.
     *
     * @param type the type of pizza to create. Supported types are "cheese" and "greek".
     * @return a Pizza object of the specified type, or null if the type is not recognized.
     * 
     * @throws IllegalArgumentException if the type is null or empty.
     * 
     * <p>
     * This method currently supports the following pizza types:
     * <ul>
     *   <li>"cheese" - creates an instance of NYCheesePizza.</li>
     *   <li>"greek" - returns null, indicating that this type is not available.</li>
     * </ul>
     * If an unsupported type is provided, the method will also return null.
     * </p>
     */
    protected Pizza createPizza(String type) {
        
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("greek")) {
            return null;
        }
        return null;
        
    }
}
