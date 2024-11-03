import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a product with a price that can be observed by other entities.
 * Implements the Observable interface to notify observers when its price drops.
 */
public class Producto implements Observable {
    private String idProducto; // Unique identifier for the product
    private int precio; // Current price of the product
    List<Observador> observadores = new ArrayList<>(); // List of observers interested in price changes

    /**
     * Constructs a Producto with a specified ID and initial price.
     *
     * @param idProducto The unique identifier of the product.
     * @param precio     The initial price of the product.
     */
    public Producto(String idProducto, int precio) {
        this.idProducto = idProducto;
        this.precio = precio;
    }

    /**
     * Sets a new price for the product. If the new price is lower than the previous
     * price,
     * all registered observers are notified of the price drop.
     *
     * @param precio The new price to set for the product.
     */
    public void setPrecio(int precio) {
        int precioViejo = this.precio;
        this.precio = precio;

        // Notify observers only if the price has dropped
        if (precio < precioViejo) {
            this.avisarObservadores();
        }
    }

    /**
     * Adds an observer to the list of observers interested in this product's price
     * changes.
     *
     * @param o The observer to add.
     */
    @Override
    public void addObservador(Observador o) {
        this.observadores.add(o);
    }

    /**
     * Removes an observer from the list of observers, stopping notifications for
     * this observer.
     *
     * @param o The observer to remove.
     */
    @Override
    public void removeObservador(Observador o) {
        this.observadores.remove(o);
    }

    /**
     * Notifies all registered observers of a price drop by sending an Aviso with
     * the product ID, new price, and date of the price change.
     */
    @Override
    public void avisarObservadores() {
        for (Observador o : this.observadores) {
            o.update(new Aviso(this.idProducto, this.precio, new Date()));
        }
    }
}
