package ar.edu.unahur.obj2.practicaparcial1.ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public abstract class Ingrediente implements IReceta {
    
    protected IReceta recetaDecorada; //decorator

    public Ingrediente(IReceta recetaDecorada) {
        this.recetaDecorada = recetaDecorada;
    }

    @Override
    public String getAutor() {
        return
            recetaDecorada.getAutor();
    }

    @Override
    public Integer getAñosDeTradicion() {
        return
            recetaDecorada.getAñosDeTradicion();
    }

    @Override
    public String getNombre() {
        return
            recetaDecorada.getNombre();
    }

    @Override
    public Double getValorNutricional() {
        return
            recetaDecorada.getValorNutricional() + this.doValorNutricional(); //Template
    }

    public abstract Double doValorNutricional();

    

}
