package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.*;
import net.mrsistemas.healthy.data.business.model.ClinicalData;
import net.mrsistemas.healthy.data.business.repository.DiseaseRepository;
import net.mrsistemas.healthy.data.business.service.FacadeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@Api(value = "clinicals",
        authorizations = {
                @Authorization(value = "Oauth2.0", scopes = {}),
                @Authorization(value = "Bearer", scopes = {})
        },
        tags = "Data Clinicals patient")
@RequestMapping("/clinical")
public class DataClinicalController {

    @Autowired
    DiseaseRepository diseaseRepository;

    @Autowired
    FacadeOperations operations;

    @ApiOperation("Registrar en la base de datos mongo db los datos clínicos de un patiente.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "INVALID REQUEST"),
            @ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @PostMapping(value = "/createDisseases/{id}")
    @ResponseBody
    public ResponseEntity<ClinicalData> create(@RequestBody(required = true) @Valid ClinicalData data, @PathVariable(name = "id") String id) {
        if (data == null) {
            return new ResponseEntity<ClinicalData>(data, HttpStatus.BAD_REQUEST);
        } else {
            data = operations.save(data);
            if (data == null) {
                return new ResponseEntity<ClinicalData>(data, HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<ClinicalData>(data, HttpStatus.OK);
        }
    }
}
