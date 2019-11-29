package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.App;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends MongoRepository<App, Long> {}
