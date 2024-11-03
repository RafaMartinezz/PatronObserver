/**
 * Interface for an observable subject in the observer pattern.
 * Allows observers to be added or removed, and notifies all observers of
 * changes.
 */
public interface Observable {

    /**
     * Adds an observer to the list of observers.
     *
     * @param o The observer to be added.
     */
    void addObservador(Observador o);

    /**
     * Removes an observer from the list of observers.
     *
     * @param o The observer to be removed.
     */
    void removeObservador(Observador o);

    /**
     * Notifies all registered observers of a change.
     * This method should be called when the state of the observable changes.
     */
    void avisarObservadores();
}
