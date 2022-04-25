package main.zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel = "";
    private boolean venenoso = false;

    public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio(){listado.add(this);}

    public int cantidadAnfibios() {
        return listado.size();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        Anfibio.ranas++;
        listado.add(rana);
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        Anfibio.salamandras++;
        listado.add(salamandra);
        return salamandra;
    }
    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String movimiento() {
        return "saltar";
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }
}
