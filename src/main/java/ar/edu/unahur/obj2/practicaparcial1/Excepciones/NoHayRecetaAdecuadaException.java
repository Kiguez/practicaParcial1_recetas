package ar.edu.unahur.obj2.practicaparcial1.Excepciones;

public class NoHayRecetaAdecuadaException extends RuntimeException {

    public NoHayRecetaAdecuadaException() {
        super("Ninguna receta es adecuada para el cliente");
    }
    
    
}
