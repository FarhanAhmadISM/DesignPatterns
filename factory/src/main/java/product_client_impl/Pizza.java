package product_client_impl;

import java.util.ArrayList;

/**
 * product
 */
abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<String>();

    /**
     * Prepares a pizza by performing a series of steps including 
     * preparing the name, tossing the dough, adding sauce, and 
     * adding toppings.
     *
     * <p>This method prints out the preparation steps for the pizza 
     * to the console. It assumes that the instance variables 
     * {@code name}, {@code dough}, {@code sauce}, and {@code toppings} 
     * are properly initialized before this method is called.</p>
     *
     * @throws NullPointerException if any of the instance variables 
     *         {@code name}, {@code dough}, {@code sauce}, or 
     *         {@code toppings} is null.
     * @throws IllegalArgumentException if {@code toppings} is an empty 
     *         array or contains null elements.
     */
    void Pizza() {
        
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
        
    }

    protected abstract void prepare();

    /**
     * Bakes the item for a specified duration and temperature.
     * <p>
     * This method simulates the baking process by printing a message indicating
     * the baking time and temperature. It does not return any value.
     * </p>
     *
     * @throws IllegalStateException if the baking process cannot be initiated
     *         due to an invalid state (e.g., if the oven is not preheated).
     */
    protected void bake() {
        
        System.out.println("Bake for 25 minutes at 350");
        
    }

    /**
     * Cuts the pizza into diagonal slices.
     * <p>
     * This method is responsible for simulating the action of cutting a pizza.
     * It outputs a message indicating that the pizza is being cut into diagonal slices.
     * </p>
     *
     * @throws UnsupportedOperationException if the cutting operation is not supported.
     */
    protected void cut() {
        
        System.out.println("Cutting the pizza into diagonal slices");
        
    }

    /**
     * Places the pizza in the official pizza store box.
     * 
     * <p>This method is responsible for handling the packaging of the pizza
     * into the designated box. It outputs a message indicating that the pizza
     * has been placed in the box.</p>
     * 
     * @throws IllegalStateException if the pizza is not ready to be boxed.
     *         This exception may be thrown if the method is called when the
     *         pizza is still being prepared or has not been completed.
     */
    protected void box() {
        
        System.out.println("Place pizza in official pizzastore box");
        
    }

    /**
     * Retrieves the name associated with this instance.
     *
     * @return the name as a {@code String}.
     * 
     * @throws IllegalStateException if the name has not been initialized.
     */
    protected String getName() {
        
        return name;
        
    }
}
