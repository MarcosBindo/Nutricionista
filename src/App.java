public class App {
    public static void main(String[] args) throws Exception {
        Profesional prof1 = new Profesional("Marcos", "Bindo", "Deportologo");
        Administrador administrador = Administrador.getInstancia();

        Paciente psnt1 = new Paciente("Juan", "Perez", 30, "FootBall", "M", 80, 70);
        Paciente psnt2 = new Paciente("Pedro", "Martinez", 27, "TaeKwonDo", "M", 73, 53);

        Plan plan1 = prof1.diseñarPlan(psnt1.getEdad(), psnt1.getPesoActual(), psnt1.getCinturaActual(), 7, "quemar grasa", psnt1);
        Plan plan2 = prof1.diseñarPlan(psnt2.getEdad(), psnt2.getPesoActual(), psnt2.getCinturaActual(), 14, "ganar musculo", psnt2);

        psnt1.agregarObjetivo("Bajar 3kg");
        psnt1.agregarObjetivo("Quemar 2% de grasa");

        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));
        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));
        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));
        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));
        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));
        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));
        psnt1.agregarRutinaDelDia(new Consumible("tostadas con queso"), new AC("Pollo con verduras", 30,0, 70), new Consumible("Barrita de cereal"), new AC("Carne al horno", 30,0,70));

        psnt2.agregarObjetivo("Bajar 5k");
        psnt2.agregarObjetivo("Ganar 3% de musculatura");

        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));
        psnt2.agregarRutinaDelDia(new Consumible("Barra de cereal"), new AC("Almuerzo",30,20,50), new Consumible("Mate"), new AC("cena", 30, 20, 50));

        psnt1.terminarPlan(70,60);
        prof1.calificar(plan1, "ex", "Bien respetada las comidas, proximo plan agregar un poco mas de verdura");
        psnt1.descinvularPlan();

        psnt2.terminarPlan(14, 50);
        prof1.calificar(plan2, "buena","Ser mas consistente con el ejercicio");
        psnt1.descinvularPlan();     
    }
}