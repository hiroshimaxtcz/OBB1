public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int unidades;

    public Producto(String nombre, String categoria, double precio, int unidades) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    private void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public void descontar(int cant){
        this.setUnidades(this.getUnidades()-cant);
    }
    public boolean cumple(int cant){
        if(this.unidades>= cant){
            this.descontar(cant);
            return true;
        }
        return false;

    }
    public double getMonto(int cant){
        return cant*this.getPrecio();
    }


}
