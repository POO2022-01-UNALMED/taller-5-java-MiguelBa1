package main.gestion;

import main.zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo= new Zoologico();
    private ArrayList<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){}

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }
    
    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

}
