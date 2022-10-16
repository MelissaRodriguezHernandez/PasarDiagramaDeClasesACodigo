package paquete;

import java.util.ArrayList;


public class Menu {
    public static void main(String[] args) {

        Huerto huerto0 = new Huerto(6000.56f, true);
        Huerto huerto1 = new Huerto(60.56f, false);

        Piscina piscina0 = new Piscina(25.676f, true, 3000);
        Piscina piscina1 = new Piscina(245.676f, false, 4500);

        ArrayList<String> listaPlantas = new ArrayList<>();

        Jardin jardin2 = new Jardin(23.6f, listaPlantas);
        Jardin jardin0 = new Jardin(123.45f, listaPlantas);


        Chalet chalet0 = new Chalet(30000, "descripcion","amapolas 89", 3445.67f, 4);
        chalet0.set_piscina(piscina1);
        chalet0.set_jardin(jardin2);

        Chalet chalet1 = new Chalet(70000, "descripcion","amapolas 76", 3900.67f, 8);
        chalet1.set_jardin(jardin0);
        chalet1.set_piscina(piscina0);


        Apartamento apartamento = new Apartamento( 6789,"descripcion","amapolas 12", 839754.45f, 5, true );
        Apartamento apartamento1 = new Apartamento(800000,"descripcion","amapolas 72", 34455.6f, 3, false);

        Adosado adosado1 = new Adosado(74700, "descripcion1", "amapolas 56", 4534.6f, 5);
        adosado1.set_jardin(jardin0);

        Adosado adosado = new Adosado(740000, "descripcion0", "amapolas 34", 454.6f, 5);
        adosado.set_jardin(jardin2);


        Finca finca0 = new Finca(56700, "descripcion 1","Finca0",Tipo.rustico,"calle flores 1",3560.00f);
        finca0.setVivienda(chalet0);
        finca0.setPiscina(piscina0);

        Finca finca1 = new Finca(4000454,"descripcion2","Finca1", Tipo.rustico, "calle flores 3" , 6788.0f);
        finca1.setHuerto(huerto0);

        Finca finca2 = new Finca(456600,"descripcion2","Finca2", Tipo.urbano, "calle flores 4" , 370.00f);
        finca2.setVivienda(adosado);
        finca2.setHuerto(huerto1);
        finca2.setPiscina(piscina1);

        Finca finca3 = new Finca( 400560,"descripcion2","Finca3", Tipo.rustico, "calle flores 5" , 89870.00f);

        Finca finca4 = new Finca(67670,"descripcion2","Finca4", Tipo.urbano, "calle flores 6" , 45546.00f);
        finca4.setVivienda(apartamento);
        finca4.setHuerto(huerto1);
        finca4.setPiscina(piscina0);
        finca4.setJardin(jardin0);

        ArrayList<Propiedad> listaPropiedades0 = new ArrayList<>();
        listaPropiedades0.add(finca4);
        listaPropiedades0.add(finca0);
        listaPropiedades0.add(chalet0);
        listaPropiedades0.add(apartamento);

        ArrayList<Propiedad> listaPropiedades1 = new ArrayList<>();
        listaPropiedades1.add(finca1);
        listaPropiedades1.add(finca2);
        listaPropiedades1.add(finca3);
        listaPropiedades1.add(chalet1);
        listaPropiedades1.add(apartamento1);
        listaPropiedades1.add(adosado);

        Propietario propietario0 = new Propietario("1234", "Antonio", "Amapolas 12", listaPropiedades0);
        Propietario propietario1 = new Propietario("1dfg234", "Maria", "Amapolas 42", listaPropiedades1);

        propietario0.show();


    }
}
