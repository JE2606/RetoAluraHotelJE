package alurahotel.logica;

/**
 *
 * @author bjimenez
 */
public class FormaPago {
    private int id;
    private String formaPago;

    public FormaPago() {
    }

    
    
    
    public FormaPago(int id, String formaPago) {
        this.id = id;
        this.formaPago = formaPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
}
