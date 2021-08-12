package com.unab.logica;

/**
 *
 * @author Johnny Antia <Johnny.Antia at jantia.com>
 */
public class Cliente
{

    private Integer documento;
    private String nombreCliente;

    public Cliente()
    {
    }
    public Integer getDocumento()
    {
        return documento;
    }

    public void setDocumento(Integer documento)
    {
        this.documento = documento;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

}
