package Negocio;
import java.util.List;
import Modelo.Producto;
import Persistencia.ProductoDAO;


public class ProductoBO {
   
    // Instancia de ProductoDAO para manejar operaciones de base de datos
    private ProductoDAO productoDAO;

    public ProductoBO() {
        this.productoDAO = new ProductoDAO();
    }

    // Método para obtener el inventario completo
    public List<Producto> obtenerInventario() {
        return productoDAO.obtenerTodosLosProductos();
    }

    // Método para agregar un producto
    public boolean agregarProducto(Producto producto) {
        // Aquí podrías agregar validaciones antes de guardar el producto
        return productoDAO.insertarProducto(producto);
    }

    // Método para editar un producto existente
    public boolean editarProducto(Producto producto) {
        return productoDAO.actualizarProducto(producto);
    }

    // Método para eliminar un producto por ID
    public boolean eliminarProducto(int productoId) {
        return productoDAO.eliminarProducto(productoId);
    }

    public List<Producto> obtenerTodosLosProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
} 

