package main.zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas = "";
    private int cantidadAletas = 0;

    public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }
    
    public Pez() {listado.add(this);}

    public int cantidadPeces() {
        return listado.size();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        Pez.salmones++;
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        Pez.bacalaos++;
        listado.add(bacalao);
        return bacalao;
    }
    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public String movimiento() {
        return "nadar";
    }
}
