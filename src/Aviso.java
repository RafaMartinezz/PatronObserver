import java.util.Date;

/**
 * Represents a price drop notification for a specific product.
 * Each notification includes a product ID, the new price, and the date of the
 * price change.
 */
public class Aviso {
    private String idProducto; // Unique identifier for the product
    private int precio; // New price of the product after the price drop
    private Date fecha; // Date of the price change

    /**
     * Constructs a price drop notification (Aviso) for a product with a specified
     * ID, price, and date.
     *
     * @param idProducto The unique identifier of the product.
     * @param precio     The updated price of the product.
     * @param fecha      The date when the price drop occurred.
     */
    public Aviso(String idProducto, int precio, Date fecha) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.fecha = fecha;
    }

    /**
     * Provides a string representation of the price drop notification, detailing
     * the product ID,
     * the new price, and the date of the price change.
     *
     * @return A formatted string describing the price drop.
     */
    @Override
    public String toString() {
        return "Bajada de precio del producto " + this.idProducto + " a " + this.precio + "€ el día " + this.fecha
                + ".";
    }
}
