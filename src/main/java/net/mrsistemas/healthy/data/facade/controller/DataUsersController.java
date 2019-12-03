package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.mrsistemas.healthy.data.business.model.User;
import net.mrsistemas.healthy.data.business.repository.UserRepository;
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
            @ApiResponse(code = HttpServletResponse.SC_CREATED, message = "REGISTER CREATED SUCCESFUL"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<User> create(@RequestBody(required = true) @Valid User user) {
        try {
            user = userRepository.save(user);
            return new ResponseEntity<User>(user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation("Actualizar la informacion de un usuario en la base de datos mongo db")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @PostMapping(value = "/update/{id}")
    @ResponseBody
    public ResponseEntity<User> update(@RequestBody(required = true) @Valid User user, @PathVariable(name = "id") String id) {
        try {
            user = userRepository.save(user);
            return new ResponseEntity<User>(user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation("Actualizar la informacion de un usuario en la base de datos mongo db")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
            @ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
    @GetMapping(value = "/get/{id}")
    @ResponseBody
    public ResponseEntity<User> getById(@PathVariable(name = "id") Long id) {
        User user = null;
        try {
            user = userRepository.findById(id).get();
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
        }
    }
}
