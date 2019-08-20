package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.ClinicalData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicalDataRepository   extends MongoRepository<ClinicalData, Long> {
}
