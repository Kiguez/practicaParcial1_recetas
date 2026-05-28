package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Excepciones.NoHayRecetaAdecuadaException;
import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

public class Nutricionista {

    private String nombre = "pedrito";
    private List<IReceta> recetas = new ArrayList<>();
    private static Nutricionista instance = new Nutricionista();

    private Nutricionista() {} //Singleton

    public static Nutricionista getInstance() {
        return
            instance;
    }

    public List<IReceta> getRecetas() {
        return recetas;
    }

    public void agregarReceta(IReceta unaReceta) {
        recetas.add(unaReceta);
    }

    public void darRecetaACliente(Cliente unCliente) {
        IReceta recetaAdecuada = recetas.stream().filter(r -> unCliente.getCriterio().leGustaEstaReceta(r)).
        findFirst().orElseThrow( () -> new NoHayRecetaAdecuadaException());
        IReceta recetaCustomizada = unCliente.getCriterio().customizarReceta(recetaAdecuada);
        unCliente.agregarReceta(recetaCustomizada);

    }

    public IReceta recetaDeEmergencia() {
        return
            new Receta("batido magico", nombre, 2000.0, 0);
    }

    public void visitarCliente(Cliente unCliente) {
        try {
            this.darRecetaACliente(unCliente);
        }
        catch (NoHayRecetaAdecuadaException e) {
            unCliente.agregarReceta(this.recetaDeEmergencia()); 
        }
    }
}
