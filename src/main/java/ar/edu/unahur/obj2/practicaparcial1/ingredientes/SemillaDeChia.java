package ar.edu.unahur.obj2.practicaparcial1.ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class SemillaDeChia extends Ingrediente{

    public SemillaDeChia(IReceta recetaDecorada) {
        super(recetaDecorada);
    }

    @Override
    public Double doValorNutricional() {
        return
            490.0;
    }
}
