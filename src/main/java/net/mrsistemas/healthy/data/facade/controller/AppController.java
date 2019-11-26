package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.*;
import net.mrsistemas.healthy.data.business.model.AppType;
import net.mrsistemas.healthy.data.business.service.FacadeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@Api(value = "App Controller Service",
        authorizations = {
                @Authorization(value = "Oauth2.0", scopes = {}),
                @Authorization(value = "Bearer", scopes = {})
        },
        tags = "App Admin apps")
@RequestMapping("/apps")
public class AppController {

    @Autowired
    FacadeOperations facade;

    @ApiOperation("Registrar en la base de datos mongo db los datos clínicos de un patiente.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "INVALID REQUEST"),
            @ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @PostMapping(value = "/save")
    @ResponseBody
    public ResponseEntity<AppType> create(@RequestBody @Valid AppType data) {

        try {
            data = facade.save(data);
            return new ResponseEntity<>(data, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
        }
    }
}
