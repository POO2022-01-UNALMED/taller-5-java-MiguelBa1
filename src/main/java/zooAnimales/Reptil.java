package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas = "";
    private int largoCola = 0;

    public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    
    public Reptil() {listado.add(this);}

    public int cantidadReptiles() {
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        Reptil.iguanas++;
        listado.add(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        Reptil.serpientes++;
        listado.add(serpiente);
        return serpiente;
    }
    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public String movimiento() {
        return "reptar";
    }
}
