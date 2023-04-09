package engineeringtask.elancoapps.com.task.repository;

import engineeringtask.elancoapps.com.task.model.Resources;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class ResourcesRepository {
    private List<Resources> list = new ArrayList<Resources>();

    public void createResourcess() {
        list = List.of(
                new Resources(1, "res-1"),
                new Resources(2, "res-2"),
                new Resources(3, "res-3"),
                new Resources(4, "res-2")
        );
    }

    public List<Resources> getAllUniqueResourcess() {
        createResourcess();
        List<Resources> distinctElements = list.stream().filter(distinctByKey(resources -> resources.getName()))
                .collect(Collectors.toList());
        return distinctElements;
    }

    public Resources findByName(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return list.get(i);
            }
        }
        return null;
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
        return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}