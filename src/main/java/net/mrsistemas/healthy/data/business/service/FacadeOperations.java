package net.mrsistemas.healthy.data.business.service;

import net.mrsistemas.healthy.data.business.model.AppType;
import net.mrsistemas.healthy.data.business.model.ClinicalData;
import net.mrsistemas.healthy.data.business.repository.AppTypeRepository;
import net.mrsistemas.healthy.data.business.repository.ClinicalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacadeOperations {
    private static FacadeOperations facade = new FacadeOperations();

    @Autowired
    ClinicalDataRepository clinicalData;

    @Autowired
    AppTypeRepository typeRepository;

    private FacadeOperations() {
    }

    public static final FacadeOperations INSTANCE() {
        return facade;
    }

    public ClinicalData save(ClinicalData data){
        return clinicalData.save(data);
    }

    public AppType save(AppType appType){return typeRepository.save(appType);}

}
