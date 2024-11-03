/**
 * Interface for an observer in the observer pattern.
 * Defines the method to receive updates from an observable subject when a
 * change occurs.
 */
public interface Observador {

    /**
     * Called by the observable subject to update the observer with a notification.
     *
     * @param aviso The notification containing details of the change, such as a
     *              price drop.
     */
    void update(Aviso aviso);
}
