
package graficofactura;

public class Fac {
    public String numeroPieza;
    public String descripcionPieza;
    public int cantidadArticulos;
    public double precioArticulo;

    public Fac(String numeroPieza, String descripcionPieza, int cantidadArticulos, double precioArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidadArticulos = cantidadArticulos;
        this.precioArticulo = precioArticulo;
    }

    public Fac() {
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }
    
    public double obtenerMontoFactura(){
        double monto=0;
        monto= cantidadArticulos*precioArticulo;
        return monto;
    }
}
