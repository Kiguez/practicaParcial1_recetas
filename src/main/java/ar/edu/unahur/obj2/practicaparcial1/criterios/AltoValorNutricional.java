package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.ingredientes.FrutoSeco;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class AltoValorNutricional implements ICriterio {

    private Double minimoDeCalorias;

    public AltoValorNutricional(Double minimoDeCalorias) {
        this.minimoDeCalorias = minimoDeCalorias;
    }

    @Override
    public Boolean leGustaEstaReceta(IReceta unaReceta) {
        return
            unaReceta.getValorNutricional() > minimoDeCalorias;
    }

    @Override
    public IReceta customizarReceta(IReceta unaReceta) {
        return
            new FrutoSeco(unaReceta); //Agrega frutos secos porque es lo de mayor valor
    }
    
    
}
