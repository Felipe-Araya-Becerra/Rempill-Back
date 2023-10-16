package com.acl.rempill_app.repository;

import com.acl.rempill_app.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
}
