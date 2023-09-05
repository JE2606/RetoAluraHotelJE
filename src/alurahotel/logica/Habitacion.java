package alurahotel.logica;

/**
 *
 * @author bjimenez
 */
public class Habitacion {
    private int id;
    private String tipo;
    private int precio;

    public Habitacion() {
    }
    
//Habitaciones
    public Habitacion(int id, String tipo, int precio) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
