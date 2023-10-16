package com.acl.rempill_app.repository;


import com.acl.rempill_app.model.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataEntity,Long> {
}
