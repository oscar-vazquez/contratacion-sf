package edesur.pangea.contratacion;

import com.wordnik.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Api(value = "/", description = "ABM Contratos")
public class ServiceSF {
    private static final Logger logger = LoggerFactory.getLogger(ServiceSF.class);

    public  ServiceSF() {
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Baja de un contrato", response = ResponseSF.class)
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Accepted, se va a procesar en background"),
            @ApiResponse(code = 404, message = "Cliente/ContractId Not Found"),
            @ApiResponse(code = 400, message = "Error Parámetros")
    })
    public Response bajaContrato(@ApiParam RequestBaja request) {
        logger.info(
                "NumeroCasoSFDC: {}, NumeroCliente: {}, ContractID: {}, Motivo: {}",
                request.NumeroCasoSFDC, request.NumeroCliente, request.ContractID, request.Motivo);

        return Response.ok(ResponseSF.ok()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Alta de un contrato", response = ResponseSF.class)
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Accepted, se va a procesar en background"),
            @ApiResponse(code = 400, message = "Error Parámetros")
    })
    public Response altaContrato(@ApiParam RequestAlta request) {
        logger.info(
                "NumeroCasoSFDC: {}, ContractID: {}, Dirección: {} {}",
                request.NumeroCasoSFDC, request.ContractID, request.Calle, request.NumeroCalle);

        return Response.ok(ResponseSF.ok()).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Modifcación de un contrato", response = ResponseSF.class)
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Accepted, se va a procesar en background"),
            @ApiResponse(code = 404, message = "Cliente/ContractId Not Found"),
            @ApiResponse(code = 400, message = "Error Parámetros")
    })
    public Response modifContrato(@ApiParam RequestModif request) {
        logger.info(
                "NumeroCasoSFDC: {}, Motivo: {}, SubMotivo: {}",
                request.NumeroCasoSFDC, request.Motivo, request.SubMotivo);

        return Response.ok(ResponseSF.ok()).build();
    }
}
