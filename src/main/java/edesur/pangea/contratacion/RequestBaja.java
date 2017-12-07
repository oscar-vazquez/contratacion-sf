package edesur.pangea.contratacion;

import java.util.Date;

public class RequestBaja {
    // obligatorios
    public String NumeroCasoSFDC;
    public String Motivo;
    public String SubMotivo;
    public String Estado;
    public String NumeroCliente;
    public String ContractID;
    public String NumeroInstalacion;
    public Date FechaDeSolicitud;

    // opcionales
    public String NumeroOrden;
    public String FacturaFinal;
    public String FacturaPrincipal;
    public String RetiroMedidor;

}
