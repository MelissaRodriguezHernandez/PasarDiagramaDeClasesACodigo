package paquete;

public class Piscina implements Varolable{
    //Atributos
    private float volumen;
    private boolean cloracion_salina;
    private Integer valor;

    //Constructores

    public Piscina(float volumen, boolean cloracion_salina, Integer valor) {
        this.volumen = volumen;
        this.cloracion_salina = cloracion_salina;
        this.valor = valor;
    }

    //Setters y Getters
    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public boolean isCloracion_salina() {
        return cloracion_salina;
    }

    public void setCloracion_salina(boolean cloracion_salina) {
        this.cloracion_salina = cloracion_salina;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    //Otros Metodos

    public void show(){
        System.out.println("");
        System.out.println("---Pisicina---");
        System.out.println("Volumen: "+getVolumen());
        if(isCloracion_salina()){
            System.out.println("Cloración salina: Si ");
        }else{
            System.out.println("Cloración salina: No ");
        }
        System.out.println("Valor: "+getValor());
        System.out.println("--------------");
    }

    public void get_valor(){
        System.out.println("El valor de la piscina es de "+getValor()+"€");
    }
}
