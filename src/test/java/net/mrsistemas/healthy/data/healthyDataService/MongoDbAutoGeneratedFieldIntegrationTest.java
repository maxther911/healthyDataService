package net.mrsistemas.healthy.data.healthyDataService;


import net.mrsistemas.healthy.data.business.model.*;
import net.mrsistemas.healthy.data.business.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDbAutoGeneratedFieldIntegrationTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void givenUserObject_whenSave_thenCreateNewUser() {

        User user = new User();
        user.setId(2019000024L);
        userRepository.save(user);
        assertThat(userRepository.findAll().size()).isGreaterThan(0);
    }


}
