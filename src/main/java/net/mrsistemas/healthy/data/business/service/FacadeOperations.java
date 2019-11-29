package net.mrsistemas.healthy.data.business.service;

import com.mongodb.client.MongoClients;
import net.mrsistemas.healthy.data.business.model.App;
import net.mrsistemas.healthy.data.business.model.AppType;
import net.mrsistemas.healthy.data.business.model.ClinicalData;
import net.mrsistemas.healthy.data.business.model.Disease;
import net.mrsistemas.healthy.data.business.repository.AppRepository;
import net.mrsistemas.healthy.data.business.repository.ClinicalDataRepository;
import net.mrsistemas.healthy.data.business.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeOperations {
    private static MongoTemplate mongoTemplate;
    private static FacadeOperations facade = new FacadeOperations(mongoTemplate);

    @Autowired
    ClinicalDataRepository clinicalData;

    @Autowired
    AppRepository appRepository;

    @Autowired
    DiseaseRepository diseaseRepository;

    private FacadeOperations(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public static final FacadeOperations INSTANCE() {
        return facade;
    }

    public ClinicalData save(ClinicalData data){
        return clinicalData.save(data);
    }

    public App save(App app){return appRepository.save(app);}

    public List<AppType> getAppTypeList(){
        MongoOperations mongoOps = mongoTemplate;
        return mongoOps.findAll(AppType.class);
    }

    public List<App> getAppList() {
        return appRepository.findAll();
    }

    public List<Disease> getDiseases() {
        return diseaseRepository.findAll();
    }
}
