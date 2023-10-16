package com.acl.rempill_app.controller;


import com.acl.rempill_app.model.RememberEntity;
import com.acl.rempill_app.service.RememberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rem" )
public class RememberController {

    private final RememberService rememberService;

    public RememberController(RememberService rememberService) {
        this.rememberService = rememberService;
    }


    @GetMapping("/findrem")
    public List<RememberEntity> findAllRemember() {
        return rememberService.findAllRemember();
    }

    @GetMapping("/findrem/{id}")
    public Optional<RememberEntity> findRememberById(@PathVariable Long id){
        return rememberService.findRememberById(id);
    }

    @PostMapping(value = "/createrem")
    public RememberEntity createRemember(@RequestBody RememberEntity rememberEntity) {
        return rememberService.createRemember(rememberEntity);
    }

    @PutMapping(value = "/updaterem/{id}")
    public RememberEntity updateRemember(@PathVariable Long id, @RequestBody RememberEntity rememberEntity) {
        return rememberService.updateRemember(id, rememberEntity);
    }

    @DeleteMapping("/deleterem/{id}")
    public void deleteRemember(@PathVariable Long id) {
        rememberService.deleteRemember(id);
    }

}
