package main.zooAnimales;

import main.gestion.Zona;

public class Animal {
    private int totalAnimales = 0;
    private String nombre = "";
    private int edad = 0;
    private String habitat = "";
    private String genero = "";
    private Zona zona;

    public Animal (String nombre, int edad, String habitat, String genero) {
        this.totalAnimales++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }
    public Animal(){}

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        return "Mamiferos: "+Mamifero.getListado().size()+"\n" + 
				"Aves: "+Ave.getListado().size()+"\n" + 
				"Reptiles: "+Reptil.getListado().size()+"\n" + 
				"Peces: "+Pez.getListado().size()+"\n" + 
				"Anfibios: "+Anfibio.getListado().size();
    }
    
    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String toString(){
        return "Mi nombre es "+ this.nombre + ", tengo una edad de " +this.edad+ ", habito en "+this.habitat+" y mi genero es " + this.genero + (this.zona != null ? ", la zona en la que me ubico es "+this.zona+", en el "+this.zona.getZoo() : "");
    }
}
