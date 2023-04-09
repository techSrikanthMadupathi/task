package engineeringtask.elancoapps.com.task.controller;

import engineeringtask.elancoapps.com.task.model.Resources;
import engineeringtask.elancoapps.com.task.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/engineering-task.elancoapps.com/api/resources")
public class ResourcesController {

    @Autowired
    private ResourcesService service;


    @GetMapping
    public List<Resources> findAllResourcess() {
        return service.getResourcess();
    }

    @GetMapping("{name}")
    public Resources findResourcesByName(@PathVariable String  name) {
        return service.getResourcesByName(name);
    }


}