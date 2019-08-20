package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.*;
import net.mrsistemas.healthy.data.facade.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
@Api(value = "Greetings", tags = {"Greetings"})
public class GettingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting")
    @ApiOperation("Genera un mensaje de saludo, con el que se puede verificar que la api funciona correctamente.")
    @ApiResponses({
            @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
            @ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
            @ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
            @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND") })
    @Authorization( value = "Oauth 2.0",
            scopes = {
        @AuthorizationScope(scope = "read", description = "Rol de lectura aplicable a cualquier rol dentro de la aplicación.")
    })
    public ResponseEntity<Greeting> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ResponseEntity<Greeting>( Greeting.builder().id(counter.incrementAndGet()).content( String.format(template, name)).build(), HttpStatus.OK);
    }
}
