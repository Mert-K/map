package service.based.map.services.map;

import service.based.map.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity> {
    protected Map<Long, T> map = new HashMap<>();

    T save(T object) {
        return map.put(object.getId(), object);
    }

    T findById(Long id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    void delete(T object) {
        map.entrySet().removeIf(x -> x.getValue().equals(object));
    }

    void deleteById(Long id) {
        map.remove(id);
    }
}
