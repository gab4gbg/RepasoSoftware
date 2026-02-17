package org.yourcompany.yourproject;

public abstract class Usuario
{
    protected String id;
    protected String nombre;
    protected String email;

    protected Usuario(String id, String nombre, String email)
    {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getEmail()
    {
        return this.email;
    }

}
