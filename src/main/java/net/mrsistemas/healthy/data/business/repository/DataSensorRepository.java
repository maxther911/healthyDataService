package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.DataSensor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataSensorRepository extends MongoRepository<DataSensor, Long> {
}
