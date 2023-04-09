package engineeringtask.elancoapps.com.task.service;

import engineeringtask.elancoapps.com.task.model.Application;
import engineeringtask.elancoapps.com.task.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository repository;



    public List<Application> getApplications() {
        return repository.getAllApplications();
    }

    public Application getApplicationByName(String  name) {
        return repository.findByName(name);
    }




}