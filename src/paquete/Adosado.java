package paquete;

public class Adosado extends Vivienda {
    //Atributos
    private Jardin jardin;

    //Constructores

    public Adosado(Integer valor, String descripcion, String direccion, float superficie, Integer nro_habitaciones) {
        super(valor, descripcion, direccion, superficie, nro_habitaciones);
    }

    //Setters y Getters
    public Jardin getJardin() {
        return jardin;
    }

    public void setJardin(Jardin jardin) {
        this.jardin = jardin;
    }

    //Metodos
     public void show(){
        super.show();
         if(getJardin() == null){
             System.out.println("Jardin: No tiene");
         }else{
             Jardin jardin = getJardin();
             jardin.show();
         }
     }

     public void get_valor(){
        super.getValor();
     }

     public void set_jardin(Jardin jardin){
        setJardin(jardin);
     }

}
