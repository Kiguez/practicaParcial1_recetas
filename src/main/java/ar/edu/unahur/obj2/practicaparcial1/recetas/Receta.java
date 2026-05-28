package ar.edu.unahur.obj2.practicaparcial1.recetas;

public class Receta implements IReceta {

    private String nombre;
    private String autor;
    private Double valorNutricional;
    private Integer añosDeTradicion;

    public Receta(String nombre, String autor, Double valorNutricional, Integer añosDeTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricional = valorNutricional;
        this.añosDeTradicion = añosDeTradicion;
    }

    @Override
    public String getAutor() {
        return
            autor;
    }

    @Override
    public Integer getAñosDeTradicion() {
        return
            añosDeTradicion;
    }

    @Override
    public String getNombre() {
        return
            nombre;
    }

    @Override
    public Double getValorNutricional() {
        return
            valorNutricional;
    }
    
    
}
