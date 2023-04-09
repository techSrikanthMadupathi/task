package engineeringtask.elancoapps.com.task.repository;

import engineeringtask.elancoapps.com.task.model.Application;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ApplicationRepository {
    private List<Application> list = new ArrayList<Application>();

    public void createApplications() {
        list = List.of(
                new Application(1, "app-1"),
                new Application(2, "app-2"),
                new Application(3, "app-3")
        );
    }

    public List<Application> getAllApplications() {
        createApplications();
        return list;
    }

    public Application findByName(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Application> search(String name) {
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

}