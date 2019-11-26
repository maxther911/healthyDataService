package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.AppType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppTypeRepository extends MongoRepository<AppType, Long> {
}
