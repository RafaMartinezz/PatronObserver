/**
 * Represents a client who observes product price changes.
 * Implements the Observador interface to receive notifications about price
 * drops.
 */
public class Cliente implements Observador {
    private String idCliente; // Unique identifier for the client

    /**
     * Constructs a Cliente with a specified ID.
     *
     * @param idCliente The unique identifier of the client.
     */
    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Receives a notification of a price drop and displays a message for the
     * client.
     * This method is called when the observed product's price changes.
     *
     * @param aviso The notification containing details of the price drop.
     */
    @Override
    public void update(Aviso aviso) {
        System.out.println("El cliente " + this.idCliente + " ha recibido el aviso: " + aviso.toString());
    }
}
