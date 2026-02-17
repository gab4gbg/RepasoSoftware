package org.yourcompany.yourproject;

import java.util.List;

public class Prestamo
{

    private Socio socio;
    private List<Ejemplar> ejemplares;

    public Prestamo(Socio socio, List<Ejemplar> ejemplares)
    {
        this.socio = socio;
        this.ejemplares = ejemplares;
    }

    public void notificarCreacion(Notificador notificador)
    {
        String mensaje = "Préstamo creado para el socio " + socio.getNombre();
        notificador.enviar(socio.getEmail(), mensaje);
    }
}

