import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Plan {
    private static AtomicInteger count = new AtomicInteger(0); 
    private int edad;
    private double pesoInicial, cinturaInicial;
    private String observaciones;
    private Duracion duracion;
    private Calificacion calificacion;
    private Necesidad necesidad;
    
    private ArrayList<String> colacionYbebidas;
    private ArrayList<String> objetivos;
    private ArrayList<RutinaDiaria> rutinaGeneral;
    
    public Plan(int edad, double pesoInicial, double cinturaInicial, int duracion, String necesidad){
            this.edad =edad;
            this.cinturaInicial = cinturaInicial;
            this.pesoInicial = pesoInicial;
            //this.duracion = duracion;
            this.objetivos = new ArrayList<String>();
            this.inicializar(duracion, necesidad);
            this.rutinaGeneral = new ArrayList<RutinaDiaria>();
            this.observaciones = observaciones;
        }

    public enum Duracion{
        SEMANAL(7), QUINCIENAL(14), MENSUAL(30);

        private int dias;

        private Duracion (int dias){
            this.dias = dias;
        }

        public int getDias() {
            return dias;
        }
    }

    public enum Calificacion{
        EXCELENTE("exelente", 3), BUENA("buena", 2), REGULAR("regular", 2);

        private String calificacion;
        private int numeral;

        private Calificacion(String calificacion, int numeral){
            this.calificacion = calificacion;
            this.numeral = numeral;
        }

        public String getCalificacion() {
            return calificacion;
        }

        public int getNumeral() {
            return numeral;
        }
    }

    public enum Necesidad{
        QUEMAR_GRASA("Quemar grasa",30,0,70),GANAR_MUSCULO("Ganar Musculatura",30,20,50);

        private String necesidad;
        private int limiteProte, limiteCarbo, limiteVeg;

        private Necesidad(String necesidad, int limiteProte, int limiteCarbo, int limiteVeg){
            this.necesidad = necesidad;
            this.limiteCarbo = limiteCarbo;
            this.limiteProte = limiteProte;
            this.limiteVeg = limiteVeg;
        }

        public String getNecesidad() {
            return necesidad;
        }
        public int getLimiteProte() {
            return this.limiteProte;
        }
        public int getLimiteCarbo() {
            return this.limiteCarbo;
        }
        public int getLimiteVeg() {
            return this.limiteVeg;
        }
    }

    private void inicializar(int duracion, String necesidad){
        this.objetivos = new ArrayList<String>();
        this.colacionYbebidas = new ArrayList<String>();

        switch(duracion){
            case 7:
                this.duracion = Duracion.SEMANAL;
                break;
            case 14:
                this.duracion = Duracion.QUINCIENAL;
                break;
            case 30:
                this.duracion = Duracion.MENSUAL;
                break;
        }
        switch (necesidad) {
            case "quemar grasa":
                this.necesidad = Necesidad.QUEMAR_GRASA;
                break;
            case "ganar musculo":
                this.necesidad = Necesidad.GANAR_MUSCULO;
                break;
        }

    }

    public void calificar(String calificacion){
        calificacion = calificacion.trim().toLowerCase();
        switch(calificacion){
            case "excelente":
                this.calificacion = Calificacion.EXCELENTE;
                break;
            case "buena":
                this.calificacion = Calificacion.BUENA;
                break;
            case "regular":
                this.calificacion= Calificacion.REGULAR;
                break;
        }
    }

    public void agregarRutina(Consumible desayuno, AC almuerzo, Consumible merienda, AC cena){
        if(finalRutina(this.rutinaGeneral)){
            RutinaDiaria rutinaDiaria = new RutinaDiaria(desayuno, almuerzo, merienda, cena);
            this.rutinaGeneral.add(rutinaDiaria);
            verificarAlimento(almuerzo, cena, necesidad);
            if(!finalRutina(rutinaGeneral)){
               count.set(0); 
            }
        }else{
            System.out.println("Ya agregaste todas las rutinas");
            
        }
    }

    public boolean finalRutina(ArrayList<RutinaDiaria> rutinaGeneral){
        return rutinaGeneral.size() < duracion.getDias();
    }

    public void verificarAlimento(AC almuerzo, AC cena, Necesidad necesidad){
        if(necesidad.getLimiteProte() == almuerzo.getProteina() && necesidad.getLimiteCarbo() == almuerzo.getCarbohidratos() && necesidad.getLimiteVeg() == almuerzo.getVegetales()){
            System.out.println("Almuerzo "+count.incrementAndGet()+"/"+ duracion.getDias()+" agregado: Tu almuerzo esta balanceada para " + necesidad.getNecesidad()); 
        }else{
            System.out.println("Almuerzo "+count.incrementAndGet()+"/"+ duracion.getDias()+" agregado: Tu almuerzo no cumple correctamente con el plan");   
        }

        if(necesidad.getLimiteProte() == cena.getProteina() && necesidad.getLimiteCarbo() == cena.getCarbohidratos() && necesidad.getLimiteVeg() == cena.getVegetales() ){
            System.out.println("Cena "+getCount()+"/"+ duracion.getDias()+" agregada: Tu cena esta balaceada para " + necesidad.getNecesidad());
        }else{
            System.out.println("Cena "+getCount()+"/"+ duracion.getDias()+" agregada: Tu cena no cumple correctamente con el plan");
        }   
    }

    public void agregarColacion(String colacion){
        this.colacionYbebidas.add(colacion);
    }
    public void agregarBebida(String bebida){
        this.colacionYbebidas.add(bebida);
    }
    public void mostrarColacionesyBebidas(){
        System.out.println("\nColaciones y Bebidas permitidas: ");
        for (int i = 0; i < colacionYbebidas.size(); i++) {
            System.out.println("-"+colacionYbebidas.get(i));
        }
    }

    
    public void establecerObjetivo(String objetivo){
        this.objetivos.add(objetivo);
    }
    public void establecerObjetivos(ArrayList<String> objetivos){
        this.objetivos.addAll(objetivos);
    }

    public void mostrarObjetivos(){
        System.out.println("\nLista de objetivos:");
        for (int i = 0; i < objetivos.size(); i++) {
            System.out.println("-"+objetivos.get(i));
        }
    }

    public ArrayList<String> getObetivos() {
        return objetivos;
    }
    public double getCinturaInicial() {
        return cinturaInicial;
    }
    public int getEdad() {
        return edad;
    }
    public double getPesoInicial() {
        return pesoInicial;
    }
    public void realizarObservaciones(String obs){
        this.observaciones = obs;
    }
    public void setCinturaInicial(double cinturaInicial) {
        this.cinturaInicial = cinturaInicial;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }
    public Duracion getDuracion() {
        return duracion;
    }
    public void setDuracion(Duracion duracion) {
        this.duracion = duracion;
    }
    public static AtomicInteger getCount() {
        return count;
    }
    public Calificacion getCalificacion() {
        return calificacion;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setNecesidad(Necesidad necesidad) {
        this.necesidad = necesidad;
    }
    
}
