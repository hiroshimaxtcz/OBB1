public class Pedido {
    private  FormaPago fp;
    private FormaEnvio fe;
    private Producto p;
    private int cantidadVendida;
    public Pedido(FormaEnvio fe, FormaPago fp,Producto p,int cantidadVendida) {
        this.fe = fe;
        this.fp = fp;
        this.p=p;
        this.cantidadVendida=cantidadVendida;
    }

    public Producto getP() {
        return p;
    }

    public double calcularMontoTotal(){
        return fp.costoTotal(this.getP().getMonto(cantidadVendida)) + fe.calcularEnvio();

    }
}
