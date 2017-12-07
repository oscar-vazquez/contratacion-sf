package edesur.pangea.contratacion;

public class ResponseSF {
    public enum ResponseCode {
        OK, ClienteNoExiste, ContratoNoExiste, Error
    }

    public static ResponseSF ok() {
        return  new ResponseSF(ResponseCode.OK, null, null);
    }

    public static ResponseSF error(ResponseCode codigo, String mensaje) {
        return new ResponseSF(codigo, mensaje, null);
    }

    public ResponseSF(ResponseCode codigo, String mensaje, String externalId) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.numeroOrden = externalId;
    }

    public String getCodigoResultado() {
        return codigo.name();
    }

    public  String getDescripcionResultado() {
        return mensaje;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    private ResponseCode codigo;
    private String mensaje;
    private String numeroOrden;

}
