import java.util.ArrayList;

public class Profesional extends Usuario{
    private String especialidad;
    private int nMatricula;
    private ArrayList<Plan> planes;

    public Profesional(String nombre, String apellido, String especialidad){
        super(nombre, apellido);
        this.especialidad = especialidad;
        this.nMatricula = nMatricula;
        this.inicializar();
    }

    public Profesional(String nombre, String apellido, String especialidad, int nMatricula) {
        super(nombre, apellido);
        this.especialidad = especialidad;
        this.nMatricula = nMatricula;
        this.inicializar();
    }

    private void inicializar(){
        planes = new ArrayList<Plan>();
    }
   
    public Plan diseñarPlan(int edad, double pesoInicial, double cinturaInicial, int duracion, String necesidad,Paciente paciente){
        Plan plan = new Plan( edad,  pesoInicial,  cinturaInicial, duracion, necesidad);
        this.añadirPlan(plan);
        paciente.vincularPlan(plan);
        return plan;
    }
    public void añadirPlan(Plan plan){
       this.planes.add(plan);
    }

    public void calificar(Plan plan,String calificacion, String observaciones){
        int indexPlan = planes.indexOf(plan);
        this.planes.get(indexPlan).calificar(calificacion);
        
        if(plan.getCalificacion()!= null){
            System.out.println("Calificacion del plan: "+plan.getCalificacion());
        }else{
            System.out.println("No se ingreso calificacion");;
        }

        System.out.println("\nObservaciones: " + observaciones);
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public int getnMatricula() {
        return nMatricula;
    }
    public ArrayList<Plan> getPlanes() {
        return planes;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    

}
