package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.Disease;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends MongoRepository<Disease, Long> {}
