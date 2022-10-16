package paquete;

import java.sql.SQLOutput;

public class Vivienda extends Propiedad{
    //Atributos
    private String direccion;
    private float superficie;
    private Integer nro_habitaciones;


    //Constructores
    public Vivienda(){}

    public Vivienda(Integer valor, String descripcion, String direccion, float superficie, Integer nro_habitaciones) {
        super(valor, descripcion);
        this.direccion = direccion;
        this.superficie = superficie;
        this.nro_habitaciones = nro_habitaciones;
    }

    //Setters y Getters

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

    public Integer getNro_habitaciones() {
        return nro_habitaciones;
    }

    public void setNro_habitaciones(Integer nro_habitaciones) {
        this.nro_habitaciones = nro_habitaciones;
    }


    //Otros Metodos

    public void show(){
        System.out.println("--- Vivienda ---");
        System.out.println("Dirección: "+getDireccion());
        System.out.println("Superficie: "+getSuperficie());
        System.out.println("Número de habitaciones: "+getNro_habitaciones());
        super.show();
        System.out.println("---------------");
    }

    public void get_valor(){
        super.get_valor();
    }

}
