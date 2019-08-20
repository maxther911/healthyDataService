package net.mrsistemas.healthy.data.events;


import net.mrsistemas.healthy.data.business.model.User;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.stereotype.Component;


@Component
public class UserModelListener extends AbstractMongoEventListener<User> {

}
