package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.mrsistemas.healthy.data.business.model.User;
import net.mrsistemas.healthy.data.business.repository.UserRepository;
import net.mrsistemas.healthy.data.facade.model.Message;
import net.mrsistemas.healthy.data.utils.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@Api(tags = "Users All Operactions", value = "Users")
public class DataUsersController {

    @Autowired
    UserRepository userRepository;

    @ApiOperation("Almacenar en la base de datos mongo db los datos de un usuario autenticado.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND") })
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<Message>  create(@RequestBody(required = true) @Valid User user){
        User userResponse = userRepository.save(user);
        if (userResponse == null){
            return new ResponseEntity<Message>( new Message(1010L, Errors.ERROR.toString(),"No fue posible almacenar los datos por favor verifique."), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Message>( new Message(0L, Errors.INFO.toString(), "Datos Almacenado de manera exitosa.", userResponse), HttpStatus.OK);
    }

    @ApiOperation("Actualizar la informacion de un usuario en la base de datos mongo db")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND") })
    @PostMapping(value = "/update/{id}")
    @ResponseBody
    public ResponseEntity<Message>  update(@RequestBody(required = true) @Valid User user, @PathVariable(name = "id") String id){
        User userResponse = userRepository.save(user);
        if (userResponse == null){
            return new ResponseEntity<Message>( new Message(1010L, Errors.ERROR.toString(),"No fue posible almacenar los datos por favor verifique."), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Message>( new Message(0L, Errors.INFO.toString(), "Datos Almacenado de manera exitosa.", userResponse), HttpStatus.OK);
    }
}
