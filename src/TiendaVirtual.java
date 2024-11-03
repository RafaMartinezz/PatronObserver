/**
 * Main class for the virtual store application. Demonstrates the observer
 * pattern by creating a product
 * with observers, updating the product's price, and observing notifications to
 * registered observers.
 */
class TiendaVirtual {
    public static void main(String[] args) {
        // Create a product with an initial price
        Producto p1 = new Producto("p1", 100);

        // Create a client and a marketing employee to observe the product
        Cliente c1 = new Cliente("Ana");
        EmpleadoMarketing e1 = new EmpleadoMarketing("111", "ofertas");

        // Add observers to the product
        p1.addObservador(c1);
        p1.addObservador(e1);
        p1.addObservador(new Cliente("Juan")); // Adds another client observer

        // Update the product's price, triggering notifications to observers if the
        // price drops
        p1.setPrecio(90); // Should notify all observers of a price drop to 90
        System.out.println("");

        // Remove a specific observer (e1) and test notifications again with a new price
        // drop
        EmpleadoMarketing quieroBorrar = new EmpleadoMarketing("111", "ofertas");
        p1.removeObservador(quieroBorrar);
        p1.setPrecio(80); // Should notify remaining observers of a price drop to 80

        // Display a message indicating each remaining observer in the product's
        // observer list
        p1.observadores.forEach(o -> System.out.println("Observador"));
    }
}
