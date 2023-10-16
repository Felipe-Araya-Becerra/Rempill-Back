package com.acl.rempill_app.repository;

import com.acl.rempill_app.model.RememberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RememberRepository extends JpaRepository<RememberEntity,Long> {
}
