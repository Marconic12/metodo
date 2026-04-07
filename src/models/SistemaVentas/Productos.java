package models.SistemaVentas;

public class Productos
{
        private String nombreProducto;
        private double precio;
        private int stock;

        public Productos(String nombreProducto,double precio, int stock)
        {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.stock = stock;
        }

        public void ActualizarStock(int unidad)
        {
            this.stock -= unidad;
        }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock += stock;
    }
}
