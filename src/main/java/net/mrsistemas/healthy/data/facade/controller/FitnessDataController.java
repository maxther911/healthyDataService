package net.mrsistemas.healthy.data.facade.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import lombok.Getter;
import lombok.Setter;
import net.mrsistemas.healthy.data.business.model.DataOrigin;
import net.mrsistemas.healthy.data.business.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Api for register data from app fitness, clinical and sports",
        authorizations = {
                @Authorization(value = "Oauth2.0", scopes = {}),
                @Authorization(value = "Bearer", scopes = {})
        },
        tags = "Data Clinicals patient")
@RequestMapping("/fitness")
public class FitnessDataController {
    @Getter @Setter
    private DataOrigin app;

    @Getter @Setter
    private User user;






}
