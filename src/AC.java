public class AC extends Consumible{
    private final int plato = 100;
    private int proteina, carbohidratos, vegetales;

    /*public AC(String descripcion){
        super(descripcion);
    }*/

    public AC(String descripcion, int proteina, int carbohidrato,int vegetales){
        super(descripcion);
        if(verificar(proteina, carbohidrato, vegetales)){
            this.proteina = proteina;
            this.carbohidratos = carbohidrato;
            this.vegetales = vegetales;
        }
    }

    private boolean verificar(int proteina, int carbohidrato, int vegetales){
        if(proteina + carbohidrato + vegetales==this.plato){
            return true;
        }
        return false;
    }

    public int getProteina() {
        return proteina;
    }
    public int getCarbohidratos() {
        return carbohidratos;
    }
    public int getVegetales() {
        return vegetales;
    }
    public int getPlato() {
        return plato;
    }
    public void setProteina(int proteina) {
        this.proteina = proteina;
    }
    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }
    public void setVegetales(int vegetales) {
        this.vegetales = vegetales;
    }
}
