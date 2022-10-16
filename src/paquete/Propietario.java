package paquete;

import java.util.ArrayList;

public class Propietario {
    //Atributos
    private String NIF_CIF;
    private String nombre;
    private String direccion;
    private ArrayList<Propiedad> listaPropiedades ;

    //Constructores
    public Propietario(String NIF_CIF, String nombre, String direccion, ArrayList<Propiedad> listaPropiedades) {
        this.NIF_CIF = NIF_CIF;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaPropiedades = listaPropiedades;
    }

    public Propietario() {
    }

    //Getters y Setters

    public String getNIF_CIF() {
        return NIF_CIF;
    }

    public void setNIF_CIF(String NIF_CIF) {
        this.NIF_CIF = NIF_CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Propiedad> getListaPropiedades() {
        return listaPropiedades;
    }

    public void setListaPropiedades(ArrayList<Propiedad> listaPropiedades) {
        this.listaPropiedades = listaPropiedades;
    }


    //Otros metodos

    /**
     * metodo para añadir una vivienda a un propietario
     */

    public void add_vivienda(Vivienda vivienda) {
                }
    /**
     *
     */

    public void add_Finca(Finca finca){
    }

    /**
     *
     */
    public void show(){
        ArrayList<Finca> listaFincas = new ArrayList<>();
        ArrayList<Vivienda> listaViviendas = new ArrayList<>();

        for (int i = 0; i < getListaPropiedades().size(); i++) {
            if(getListaPropiedades().get(i) instanceof Finca){
                Finca finca = (Finca) getListaPropiedades().get(i);
                listaFincas.add(finca);
            }else{
                Vivienda vivienda = (Vivienda) getListaPropiedades().get(i);
                listaViviendas.add(vivienda);
            }
        }
        System.out.println("NIF_CIF: " + getNIF_CIF());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Dirección: "+getDireccion());
        System.out.println("--------------------------");
        System.out.println("            Fincas ");
        System.out.println("--------------------------");

        for (int i = 0; i < listaFincas.size(); i++) {
            Finca finca = listaFincas.get(i);
            System.out.println("_________________________");
            finca.show();

            System.out.println("_________________________");
        }
        System.out.println("--------------------------");
        System.out.println("            Viviendas ");
        System.out.println("--------------------------");
        for (int i = 0; i < listaViviendas.size(); i++) {
            Vivienda vivienda = listaViviendas.get(i);
            System.out.println("_________________________");
            vivienda.show();

            System.out.println("_________________________");
        }
    }

    /**
     *
     */
     public void get_valor(){
         int suma = 0;
         for (int i = 0; i < getListaPropiedades().size(); i++) {
             suma = suma + getListaPropiedades().get(i).getValor();
         }

         System.out.println("El valor del propietario "+getNombre() +" es de "+ suma+"€");
         }



}