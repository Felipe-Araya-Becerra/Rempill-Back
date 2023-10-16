package com.acl.rempill_app.controller;


import com.acl.rempill_app.model.DataEntity;
import com.acl.rempill_app.service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final DataService dataService;


    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(value = "/showdata")
    public List<DataEntity> showData() {
        return dataService.getAllData();
    }

    @PostMapping(value = "/createdata")
    public DataEntity createData(@RequestBody DataEntity dataEntity) {
        return dataService.createData(dataEntity);
    }

    @PutMapping(value = "/updatedata/{id}")
    public DataEntity updateData(@PathVariable Long id, @RequestBody DataEntity dataEntity) {
        return dataService.updateData(id, dataEntity);
    }
}
