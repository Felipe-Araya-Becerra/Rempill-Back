package com.acl.rempill_app.service.impl;

import com.acl.rempill_app.model.RememberEntity;
import com.acl.rempill_app.repository.RememberRepository;
import com.acl.rempill_app.service.RememberService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class RememberServiceImpl implements RememberService {

    private final RememberRepository rememberRepository;

    public RememberServiceImpl(RememberRepository rememberRepository) {
        this.rememberRepository = rememberRepository;
    }

    @Override
    public List<RememberEntity> findAllRemember() {
        return rememberRepository.findAll();
    }

    @Override
    public Optional<RememberEntity> findRememberById(Long id) {
        return rememberRepository.findById(id);
    }

    @Override
    public RememberEntity createRemember(RememberEntity rememberEntity) {
        return rememberRepository.save(rememberEntity);
    }

    @Override
    public RememberEntity updateRemember(Long id, RememberEntity rememberEntity) {
        RememberEntity rememberUpdated = rememberRepository.findById(id).get();
        rememberUpdated.setTitle(rememberEntity.getTitle());
        rememberUpdated.setDescription(rememberEntity.getDescription());
        rememberUpdated.setCreateDate(rememberEntity.getCreateDate());
        rememberUpdated.setAlarm(rememberEntity.getAlarm());
        return rememberRepository.save(rememberUpdated);
    }

    @Override
    public void deleteRemember(Long id) {
        rememberRepository.deleteById(id);
    }
}
