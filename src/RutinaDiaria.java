public class RutinaDiaria {
    private AC almuerzo,cena;
    private Colacion colacion;
    private Bebida bebida;
    private Consumible desayuno, merienda;


    public RutinaDiaria(Consumible desayuno, AC almuerzo, Consumible merienda, AC cena){
        this.almuerzo = almuerzo;
        this.cena = cena;
        this.desayuno = desayuno;
        this.merienda = merienda;
        this.colacion = colacion;
        this.bebida = bebida;
    }



    public AC getAlmuerzo() {
        return almuerzo;
    }
    public AC getCena() {
        return cena;
    }
    public Consumible getDesayuno() {
        return desayuno;
    }
    public Consumible getMerienda() {
        return merienda;
    }
    public Bebida getBebida() {
        return bebida;
    }
    public Colacion getColacion() {
        return colacion;
    }
   
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    public void setColacion(Colacion colacion) {
        this.colacion = colacion;
    }
    public void setAlmuerzo(AC almuerzo) {
        this.almuerzo = almuerzo;
    }
    public void setCena(AC cena) {
        this.cena = cena;
    }
    public void setDesayuno(Consumible desayuno) {
        this.desayuno = desayuno;
    }
    public void setMerienda(Consumible merienda) {
        this.merienda = merienda;
    }
    
}
