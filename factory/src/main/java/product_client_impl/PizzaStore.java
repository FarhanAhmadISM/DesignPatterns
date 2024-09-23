package product_client_impl;

/**
 * Client/Creator
 */
public abstract class PizzaStore {

    /**
     * Orders a pizza of the specified type.
     *
     * This method creates a pizza based on the provided type, prepares it, bakes it,
     * cuts it, and finally boxes it for delivery. The type of pizza must be a valid
     * type recognized by the pizza creation process.
     *
     * @param type the type of pizza to order (e.g., "cheese", "pepperoni", "veggie").
     * @return the ordered Pizza object that has been prepared, baked, cut, and boxed.
     * @throws IllegalArgumentException if the specified type is not recognized or is invalid.
     * @throws PizzaCreationException if there is an error during the pizza creation process.
     */
    public Pizza orderPizza(String type) {
        
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
        
    }

    protected abstract Pizza createPizza(String type);
}
