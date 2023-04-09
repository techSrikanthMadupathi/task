package engineeringtask.elancoapps.com.task.controller;

import engineeringtask.elancoapps.com.task.model.Application;
import engineeringtask.elancoapps.com.task.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/engineering-task.elancoapps.com/api/applications")
public class AppInfoController {

    @Autowired
    private ApplicationService service;


    @GetMapping
    public List<Application> findAllApplications() {
        return service.getApplications();
    }

    @GetMapping("{name}")
    public Application findApplicationByName(@PathVariable String  name) {
        return service.getApplicationByName(name);
    }


}