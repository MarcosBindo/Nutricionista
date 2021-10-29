
public class Paciente extends Usuario {
    private String disciplina, sexo;
    private double pesoActual, cinturaActual;
    private int edad;
    private Plan plan; //conecta el plan activo
    private RutinaDiaria rutinaDiaria;


    public Paciente(String nombre, String apellido, int edad, String disciplina, String sexo, double pesoActual, double cinturaActual) {
        super(nombre, apellido);
        this.disciplina = disciplina;
        this.sexo = sexo;
        this.pesoActual = pesoActual;
        this.cinturaActual = cinturaActual;
        this.edad = edad;
        this.plan = plan;
    }


    public void agregarRutinaDelDia(Consumible desayuno, AC almuerzo, Consumible merienda, AC cena){
        System.out.println("Paciente: " + getNombre() +" "+ getApellido());
        this.plan.agregarRutina(desayuno, almuerzo, merienda, cena);
    }

    public void agregarColacion(String colacion){
        this.plan.agregarColacion(colacion);
    }
    public void agregarBebida(String bebida) {
        // agregar una comida a la rutina del plan
        this.plan.agregarBebida(bebida);
    }

    public void agregarObjetivo(String objetivo){
        this.plan.establecerObjetivo(objetivo);
    }

    public void terminarPlan(double pesoActual, double cinturaActual){
        setPesoActual(pesoActual);
        setCinturaActual(cinturaActual);

        System.out.println("[PLAN TERMINADO]");
        System.out.println("Resultados: ");
        System.out.println("Nombre del paciente: "+ getNombre() +" "+ getApellido());
        System.out.println("Peso Inicial: "+ this.plan.getPesoInicial() + " | Peso actual: " + getPesoActual());
        System.out.println("Cintura Inicial: "+ this.plan.getCinturaInicial()+ " | Cintura Actual: "+ getCinturaActual());
        plan.mostrarObjetivos();              
    }

    public void vincularPlan(Plan plan) {
        this.plan = plan;
    }

    public void descinvularPlan() {
        this.plan = null;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public String getSexo() {
        return sexo;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public double getCinturaActual() {
        return cinturaActual;
    }  
    public int getEdad() {
        return edad;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    public void setCinturaActual(double cinturaActual) {
        this.cinturaActual = cinturaActual;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
