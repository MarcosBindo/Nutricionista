import java.util.ArrayList;

public class Administrador {
    private static final Administrador INSTANCIA = new Administrador();

    private Administrador(){
    }

    public static Administrador getInstancia() {
        return INSTANCIA;
    }    
}
