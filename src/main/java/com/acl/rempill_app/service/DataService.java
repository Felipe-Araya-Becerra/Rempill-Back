package com.acl.rempill_app.service;


import com.acl.rempill_app.model.DataEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DataService {

    List<DataEntity> getAllData();

    Optional<DataEntity> getDataById(Long id);
    DataEntity createData(DataEntity dataEntity);
    DataEntity updateData(Long id ,DataEntity dataEntity);
}
