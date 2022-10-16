package paquete;

public class Apartamento extends Vivienda {
    //Atributos
    private boolean Balcon;

    //Constructores

    public Apartamento(boolean balcon) {
        Balcon = balcon;
    }

    public Apartamento(Integer valor, String descripcion, String direccion, float superficie, Integer nro_habitaciones, boolean balcon) {
        super(valor, descripcion, direccion, superficie, nro_habitaciones);
        Balcon = balcon;
    }

//Setters y Getters

    public boolean isBalcon() {
        return Balcon;
    }

    public void setBalcon(boolean balcon) {
        Balcon = balcon;
    }

    //Otros Metodos

    public void show(){
        super.show();
        if(isBalcon()){
            System.out.println("Balcón : Si");
        }else{
            System.out.println("Balcon : No");
        }

    }
}
