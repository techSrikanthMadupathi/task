package engineeringtask.elancoapps.com.task.service;

import engineeringtask.elancoapps.com.task.model.Resources;
import engineeringtask.elancoapps.com.task.repository.ResourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesService {
    @Autowired
    private ResourcesRepository repository;



    public List<Resources> getResourcess() {
        return repository.getAllUniqueResourcess();
    }

    public Resources getResourcesByName(String  name) {
        return repository.findByName(name);
    }




}