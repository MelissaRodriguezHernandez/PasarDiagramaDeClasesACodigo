package paquete;

import java.util.ArrayList;

public class Jardin implements Varolable {
    //Atributos
    private float superficie;
    private ArrayList<String> listaPlantas;

    //Constructores

    public Jardin(float superficie, ArrayList<String> listaPlantas) {
        this.superficie = superficie;
        this.listaPlantas = listaPlantas;
    }


    //Setters y Getters

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public ArrayList<String> getListaPlantas() {
        return listaPlantas;
    }

    public void setListaPlantas(ArrayList<String> listaPlantas) {
        this.listaPlantas = listaPlantas;
    }


    //Otros Metodos

    public void show(){
        System.out.println("");
        System.out.println("---Jardín---");
        System.out.println("Superficie: "+getSuperficie());
        if(getListaPlantas().isEmpty()){
            System.out.println("No hay plantas");
        }else{
            System.out.println("Listas de plantas: "+getListaPlantas());
        }


    }
}
