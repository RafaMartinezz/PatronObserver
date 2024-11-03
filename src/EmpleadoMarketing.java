/**
 * Represents a marketing employee who observes product price changes.
 * Implements the Observador interface to receive notifications about price
 * drops.
 */
public class EmpleadoMarketing implements Observador {
    private String idEmpleadoMarketing; // Unique identifier for the marketing employee
    private String puesto; // Position or job title of the employee

    /**
     * Constructs an EmpleadoMarketing with a specified ID and position.
     *
     * @param idEmpleadoMarketing The unique identifier of the marketing employee.
     * @param puesto              The position or job title of the employee.
     */
    public EmpleadoMarketing(String idEmpleadoMarketing, String puesto) {
        this.idEmpleadoMarketing = idEmpleadoMarketing;
        this.puesto = puesto;
    }

    /**
     * Receives a notification of a price drop and displays a message for the
     * marketing employee.
     * This method is called when the observed product's price changes.
     *
     * @param aviso The notification containing details of the price drop.
     */
    @Override
    public void update(Aviso aviso) {
        System.out.println(
                "El empleado de marketing " + this.idEmpleadoMarketing + " ha recibido el aviso: " + aviso.toString());
    }

    /**
     * Generates a hash code for the EmpleadoMarketing instance based on its
     * attributes.
     *
     * @return A hash code value for the employee, useful for hashing in data
     *         structures.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEmpleadoMarketing == null) ? 0 : idEmpleadoMarketing.hashCode());
        result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
        return result;
    }

    /**
     * Checks if this EmpleadoMarketing is equal to another object.
     * Two EmpleadoMarketing instances are considered equal if they have the same ID
     * and position.
     *
     * @param obj The object to compare with.
     * @return true if the specified object is equal to this EmpleadoMarketing,
     *         false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmpleadoMarketing other = (EmpleadoMarketing) obj;
        if (idEmpleadoMarketing == null) {
            if (other.idEmpleadoMarketing != null)
                return false;
        } else if (!idEmpleadoMarketing.equals(other.idEmpleadoMarketing))
            return false;
        if (puesto == null) {
            if (other.puesto != null)
                return false;
        } else if (!puesto.equals(other.puesto))
            return false;
        return true;
    }
}
