package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.*;
import net.mrsistemas.healthy.data.business.model.DataSensor;
import net.mrsistemas.healthy.data.business.model.User;
import net.mrsistemas.healthy.data.business.repository.DataSensorOperationRepository;
import net.mrsistemas.healthy.data.business.repository.DataSensorRepository;
import net.mrsistemas.healthy.data.service.ConsumeService;
import net.mrsistemas.healthy.data.utils.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@RestController
@Api(value = "Api for register data from app fitness, clinical and sports",
        authorizations = {
                @Authorization(value = "Oauth2.0", scopes = {}),
                @Authorization(value = "Bearer", scopes = {})
        },
        tags = "Sensors Data")
@RequestMapping("/third/sensors")
public class DataSensorsController {

    DataSensorRepository repository;

    DataSensorOperationRepository dataRepository;

    @PostMapping(value = "/create")
    @ApiOperation("Reporta y registra los datos de un sensor en la base de datos con estructura no sql.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "REQUEST INVALIDO"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @Authorization(value = "Oauth 2.0", scopes = {@AuthorizationScope(scope = "read", description = "Rol de lectura aplicable a cualquier rol dentro de la aplicación.")})
    public ResponseEntity<DataSensor> create(@RequestHeader(name = "token") String token,  @RequestBody(required = true) DataSensor data) {
        if (data == null)
            return new ResponseEntity<DataSensor>(new DataSensor(), HttpStatus.BAD_REQUEST);
        try {
            data = repository.save(data);
            if (data == null)
                return new ResponseEntity<DataSensor>(new DataSensor(), HttpStatus.INTERNAL_SERVER_ERROR);
            return new ResponseEntity<DataSensor>(data, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<DataSensor>(new DataSensor(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getInformationById/{id}")
    @ApiOperation("Reporta y registra los datos de un sensor en la base de datos con estructura no sql.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "REQUEST INVALIDO"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @Authorization(value = "Oauth 2.0", scopes = {@AuthorizationScope(scope = "read", description = "Rol de lectura aplicable a cualquier rol dentro de la aplicación.")})
    public ResponseEntity<List<DataSensor>> get(@PathVariable(required = true, name = "id") Long id) {
        if (id == null || id < 1)
            return new ResponseEntity<List<DataSensor>>(new LinkedList<DataSensor>(), HttpStatus.BAD_REQUEST);
        try {
            List<DataSensor> data = dataRepository.findDataSensorsByUserId(id);
            if (data == null)
                return new ResponseEntity<List<DataSensor>>(new LinkedList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
            return new ResponseEntity<List<DataSensor>>(data, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<DataSensor>>(new LinkedList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
