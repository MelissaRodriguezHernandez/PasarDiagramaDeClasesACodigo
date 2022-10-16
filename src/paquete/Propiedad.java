package paquete;

import java.sql.SQLOutput;

public class Propiedad {
    //Atributos
    private Integer valor;
    private String descripcion;

    //Constructores

    public Propiedad(){}

    public Propiedad(Integer valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    //Getters y Setters
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    //Metodos

    public void show(){
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Valor: "+getValor());

    };
    public void get_valor(){
        System.out.println("Valor: "+getValor());
    };

}
