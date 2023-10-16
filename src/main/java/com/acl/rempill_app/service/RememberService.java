package com.acl.rempill_app.service;


import com.acl.rempill_app.model.ClientEntity;
import com.acl.rempill_app.model.RememberEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RememberService {
    List<RememberEntity> findAllRemember();

    Optional<RememberEntity> findRememberById(Long id);

    RememberEntity createRemember(RememberEntity rememberEntity);

    RememberEntity updateRemember(Long id, RememberEntity rememberEntity);

    void deleteRemember(Long id);


}
