package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Excepciones.NoHayRecetaAdecuadaException;
import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.criterios.AltoValorNutricional;
import ar.edu.unahur.obj2.practicaparcial1.criterios.RecetaTradicional;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class NutricionistaTest {

    Nutricionista elNutricionista = Nutricionista.getInstance();
    Cliente unCliente = new Cliente(43869937);
    IReceta unaReceta = new Receta("recetita", "Donato", 150.0, 15);

    @BeforeEach
    void init() {
        elNutricionista.getRecetas().clear();
        elNutricionista.agregarReceta(unaReceta);
    }

    @Test
    void testNutricionistaPuedeDarRecetaACliente() {
        elNutricionista.visitarCliente(unCliente);
        assertEquals(1 , unCliente.getRecetas().size());
    }

    @Test
    void testSiNoHayRecetaAdecuadaSeLanzaExcepcion() {
        unCliente.setCriterio(new RecetaTradicional());
        assertThrows(NoHayRecetaAdecuadaException.class,
            () -> {
                elNutricionista.darRecetaACliente(unCliente);
            }
        );
    }

    @Test
    void testSiNoHayRecetaAdecuadaSeLeDaBatidoEspecial() {
        unCliente.setCriterio(new AltoValorNutricional(1000.0));
        elNutricionista.visitarCliente(unCliente);
        assertEquals("pedrito", unCliente.getRecetas().getFirst().getAutor());
    }

    @Test
    void testLaRecetaAdecuadaEsCustomizada() {
       IReceta recetaTradicional = new Receta("recetita", "Donato", 10.0, 21);
       unCliente.setCriterio(new RecetaTradicional());
       elNutricionista.agregarReceta(recetaTradicional);
       elNutricionista.visitarCliente(unCliente);
       IReceta recetaDada = unCliente.getRecetas().getFirst();
       assertEquals(500, recetaDada.getValorNutricional()); 
    }
} 
