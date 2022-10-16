package paquete;

public class Chalet extends Vivienda {
    //Atributos
    private Jardin jardin;
    private Piscina piscina;

    //Constructores

    public Chalet(Integer valor, String descripcion, String direccion, float superficie, Integer nro_habitaciones) {
        super(valor, descripcion, direccion, superficie, nro_habitaciones);
    }

    //Setters y Getters

    public Jardin getJardin() {
        return jardin;
    }

    public void setJardin(Jardin jardin) {
        this.jardin = jardin;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }


    //Otros Metodos

    public void show(){
        super.show();
        if(getPiscina() == null){
            System.out.println("Piscina: No tiene");
        }else{
            Piscina psicina = getPiscina();
            piscina.show();
        }
        if(getJardin() == null){
            System.out.println("Jardin: No tiene");
        }else{
            Jardin jardin = getJardin();
            jardin.show();
        }
        System.out.println("Valor: "+getValor());
        System.out.println("---------------");
    }

    public void set_jardin(Jardin jardin){
        setJardin(jardin);
    }

    public void set_piscina(Piscina piscina){
        set_piscina(piscina);
    }


}
