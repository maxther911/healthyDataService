package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.DataSensor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DataSensorRepository extends MongoRepository<DataSensor, Long> {

    @Query("{ 'patient.id' : ?0 }")
    List<DataSensor> findDataSensorByPatient(Long id);
}
