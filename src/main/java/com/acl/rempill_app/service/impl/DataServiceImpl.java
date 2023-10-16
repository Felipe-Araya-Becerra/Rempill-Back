package com.acl.rempill_app.service.impl;

import com.acl.rempill_app.model.DataEntity;
import com.acl.rempill_app.repository.DataRepository;
import com.acl.rempill_app.service.DataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataServiceImpl implements DataService {

    private final DataRepository dataRepository;

    public DataServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }

    @Override
    public Optional<DataEntity> getDataById(Long id) {
        return dataRepository.findById(id);
    }

    @Override
    public DataEntity createData(DataEntity dataEntity) {
        return dataRepository.save(dataEntity);
    }

    @Override
    public DataEntity updateData(Long id, DataEntity dataEntity) {
        DataEntity updatedData = dataRepository.findById(id).get();
        updatedData.setAge(dataEntity.getAge());
        updatedData.setWeight(dataEntity.getWeight());
        updatedData.setHeight(dataEntity.getHeight());
        updatedData.setGlucoselevel(dataEntity.getGlucoselevel());
        updatedData.setBloodpressure(dataEntity.getBloodpressure());
        return dataRepository.save(updatedData);
    }
}
