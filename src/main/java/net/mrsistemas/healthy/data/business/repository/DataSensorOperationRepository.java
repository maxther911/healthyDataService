package net.mrsistemas.healthy.data.business.repository;

import net.mrsistemas.healthy.data.business.model.DataSensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public abstract class DataSensorOperationRepository implements DataSensorRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    public List<DataSensor> findDataSensorsByUserId(Long id){
        Query query = new Query();
        query.addCriteria(Criteria.where("patient.id").is(id));
        List<DataSensor> users = mongoTemplate.find(query, DataSensor.class);
        return users;
    }
}
