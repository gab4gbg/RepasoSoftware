package org.yourcompany.yourproject;

public class Socio extends Usuario
{
    private int limiteEjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendientes;

    public Socio(String id, String nombre, String email, int limiteEjemplares)
    {
        super(id, nombre, email);

        this.limiteEjemplares = limiteEjemplares;
    }

    public void registrarPrestamos(int cantidad)
    {
        if(cantidad > (limiteEjemplares - ejemplaresEnPrestamo))
        {
            throw new IllegalArgumentException("supera el limite del socio");
        }

        if(multasPendientes > 0)
        {
            throw new IllegalArgumentException("no puede pedir prestado si tiene multa");
        }

        IO.println("Se prestaron " + cantidad + " libros");
    }
}
