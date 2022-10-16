package paquete;

public class Huerto implements Varolable{
    //Atributos
    private float superficie;
    private boolean riesgo_por_goteo;

    //Constructores

    public Huerto(float superficie, boolean riesgo_por_goteo) {
        this.superficie = superficie;
        this.riesgo_por_goteo = riesgo_por_goteo;
    }


    //Setters y Getters
    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public boolean isRiesgo_por_goteo() {
        return riesgo_por_goteo;
    }

    public void setRiesgo_por_goteo(boolean riesgo_por_goteo) {
        this.riesgo_por_goteo = riesgo_por_goteo;
    }

    //Otros Metodos

    public void show(){
        System.out.println("");
        System.out.println("---Huerto---");
        System.out.println("Superficie = "+getSuperficie());

        if(isRiesgo_por_goteo()){
            System.out.println("Riesgo por goteo: Si");
        }else{
            System.out.println("Riesgo por goteo: No");
        }
    }

}
