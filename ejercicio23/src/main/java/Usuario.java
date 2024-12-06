import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    //producto es de vendedos
    private List<Producto> misProductos;
    //pedidos es de cliente
    private List<Pedido> misPedidos;

    public Usuario(String nombre,String direccion) {
        this.nombre = nombre;
        this.direccion=direccion;
        misPedidos= new LinkedList<Pedido>();
        misProductos= new LinkedList<Producto>();
    }

    public void CrearPedido(FormaPago F, FormaEnvio E, Producto P, int cant){
        /*Producto p= misProductos.stream()
                .filter(aux ->aux.cumple(cant))
                .findFirst().orElse(null);
        */
        if(P.cumple(cant)){
            Pedido pe= new Pedido(E,F,P,cant);
            misPedidos.add(pe);
        }
    }

    /*
    * public BagImpl<String> cantCategoria() {
		BagImpl<String> bag = new BagImpl<String>();
		this.pedidos.stream().forEach(p -> bag.add(p.getCategoria()));
		return bag;
	}
	*
    *
    * */







}
