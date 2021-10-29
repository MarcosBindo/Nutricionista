//clase madre para bebida y colacion
//sirve para desayuno y merienda
public class Consumible {
    private String descripcion;

    public Consumible(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

