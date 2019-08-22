package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.*;
import net.mrsistemas.healthy.data.business.model.DataSensor;
import net.mrsistemas.healthy.data.business.repository.DataSensorRepository;
import net.mrsistemas.healthy.data.facade.model.Message;
import net.mrsistemas.healthy.data.service.ConsumeService;
import net.mrsistemas.healthy.data.utils.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "Api for register data from app fitness, clinical and sports",
        authorizations = {
                @Authorization(value = "Oauth2.0", scopes = {}),
                @Authorization(value = "Bearer", scopes = {})
        },
        tags = "Sensors Data")
@RequestMapping("/third/sensors")
public class DataSensorsController {

    @Autowired
    DataSensorRepository repository;

    @PostMapping(value = "/create-data")
    @ApiOperation("Reporta y registra los datos de un sensor en la base de datos con estructura no sql.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "REQUEST INVÁLIDO"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @Authorization(value = "Oauth 2.0",
            scopes = {
                    @AuthorizationScope(scope = "read", description = "Rol de lectura aplicable a cualquier rol dentro de la aplicación.")
            })
    public ResponseEntity<Message> create(@RequestBody(required = true) DataSensor data) {
        if (data == null)
            return new ResponseEntity<Message>(new Message(0L, Errors.ERROR.toString(), "Error en la petición, verifique."), HttpStatus.BAD_REQUEST);
        try {
            System.out.println(new ConsumeService().getUserByService(""));
            data = repository.save(data);
            if (data == null)
                return new ResponseEntity<Message>(new Message(0L, Errors.ERROR.toString(), "Error almacenado los datos ingresados."), HttpStatus.INTERNAL_SERVER_ERROR);
            return new ResponseEntity<Message>(new Message(0L, Errors.INFO.toString(), "Datos Almacenado de manera exitosa.", data), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Message>(new Message(0L, Errors.ERROR.toString(), new String(e.getLocalizedMessage())), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
