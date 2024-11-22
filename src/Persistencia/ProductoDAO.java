package Persistencia;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    // Simula una lista como si fuera la base de datos
    private List<Producto> productos = new ArrayList<>();

    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }

    public boolean insertarProducto(Producto producto) {
        return productos.add(producto);
    }

    public boolean actualizarProducto(Producto producto) {
        // Simula actualización; en una base de datos real harías una consulta UPDATE
        for (Producto p : productos) {
            if (p.getId() == producto.getId()) {
                p.setNombre(producto.getNombre());
                p.setPrecio(producto.getPrecio());
                p.setCantidad(producto.getCantidad());
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(int productoId) {
        return productos.removeIf(p -> p.getId() == productoId);
    }
}
