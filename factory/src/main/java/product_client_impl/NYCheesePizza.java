package product_client_impl;

/**
 * concrete Product
 */
class NYCheesePizza extends Pizza {

    @Override
    /**
     * Prepares the necessary components for the operation.
     * <p>
     * This method currently outputs an empty line to the console.
     * It is intended to be overridden in subclasses to provide
     * specific preparation logic.
     * </p>
     *
     * @throws IllegalStateException if the preparation cannot be completed
     *         due to an invalid state.
     */
    protected void prepare() {
        
        System.out.println("");
        
    }
}
