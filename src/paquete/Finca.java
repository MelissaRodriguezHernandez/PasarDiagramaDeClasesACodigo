package paquete;

import java.util.ArrayList;

public class Finca extends Propiedad{
    //Atributos
    private String nombre;
    private Tipo tipo;
    private String direccion;
    private float superficie;
    private Vivienda vivienda;
    private Huerto huerto;
    private Piscina piscina;
    private Jardin jardin;

    //Constructores
    public Finca(Integer valor, String descripcion) {
        super(valor, descripcion);
    }

    public Finca(Integer valor, String descripcion, String nombre, Tipo tipo, String direccion, float superficie) {
        super(valor, descripcion);
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.superficie = superficie;

    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Huerto getHuerto() {
        return huerto;
    }

    public void setHuerto(Huerto huerto) {
        this.huerto = huerto;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }

    public Jardin getJardin() {
        return jardin;
    }

    public void setJardin(Jardin jardin) {
        this.jardin = jardin;
    }


    //toString

    //Otros Metodos

    public void show(){
    System.out.println("Nombre: "+ getNombre());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Superficie: "+getSuperficie());
        super.show();
        if (getVivienda() == null){
            System.out.println("Vivienda: No tiene");
        }else{
            System.out.println("-----------------------");
            System.out.println("  Vivienda de la Finca");
            System.out.println("-----------------------");
            Vivienda vivienda = getVivienda();
            vivienda.show();
        }
        if (getHuerto() == null){
            System.out.println("Huerto: No tiene");
        }else{
            Huerto huerto = getHuerto();
            huerto.show();
        }
        if(getPiscina() == null){

            System.out.println("Piscina: No tiene");
        }else{
            Piscina piscina = getPiscina();
            piscina.show();
    }
        if(getJardin() == null){
            System.out.println("Jardin: No tiene");
        }else{
            Jardin jardin = getJardin();
            jardin.show();
        }
    }

    public void get_valor(){
        int suma = 0;

        System.out.println("El valor total de la finca es de: "+suma+"€");

    }

    public void set_vivienda(Vivienda vivienda){
        setVivienda(vivienda);
    }

    public void set_huerto(Huerto huerto){
        setHuerto(huerto);
    }

    public void set_piscina(Piscina piscina){
        setPiscina(piscina);
    }

    public void set_jardin(Jardin jardin){
        setJardin(jardin);
    }

}
