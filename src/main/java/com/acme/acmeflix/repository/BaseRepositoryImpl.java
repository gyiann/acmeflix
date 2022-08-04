package com.acme.acmeflix.repository;

import com.acme.acmeflix.base.BaseComponent;
import com.acme.acmeflix.model.BaseModel;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public abstract class BaseRepositoryImpl<T extends BaseModel> extends BaseComponent
        implements BaseRepository<T, Long> {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    private final Class<T> type;

    private final Collection<T> collection;

    @Override
    public T create(T entity) {
        if (entity == null) {
            return null;
        }
        if (collection.add(entity)) {
            return entity;
        }
        return null;
    }

    @Override
    public List<T> createAll(T... entities) {
        return Arrays.stream(entities)
                .map(this::create)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public List<T> createAll(List<T> entities) {
        return collection.stream()
                .map(this::create)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public void update(T entity) {
        collection.add(entity);
    }

    @Override
    public void delete(T entity) {
        if (!collection.remove(entity)){
            logger.info("The" + entity.getClass().getSimpleName()  + " you tried to delete, does not exist.");
        }
    }

    @Override
    public void deleteById(Long id) {
        if (!collection.removeIf(entity -> entity.getId().equals(id))){
            logger.info(type.getSimpleName() +" with id: " + id  + " you tried to delete, does not exist.");
        }
    }

    @Override
    public boolean exists(T entity) {
        return collection.contains(entity);
    }

    @Override
    public T get(Long id) {
        collection.forEach(System.out::println);
        return collection.stream()
                .filter(o -> o.getId().equals(id))
                .findAny()
                .orElseThrow();
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(collection);
    }
}
