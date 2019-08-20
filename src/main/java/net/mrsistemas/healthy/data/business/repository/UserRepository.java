package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
