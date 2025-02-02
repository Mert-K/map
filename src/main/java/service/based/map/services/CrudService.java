package service.based.map.services;

import java.util.Set;

public interface CrudService<ID, T> {
    T save(T object);

    T findById(ID id);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
