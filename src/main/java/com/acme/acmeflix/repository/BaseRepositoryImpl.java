package com.acme.acmeflix.repository;

import com.acme.acmeflix.base.BaseComponent;
import com.acme.acmeflix.model.BaseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public abstract class BaseRepositoryImpl<T extends BaseModel> extends BaseComponent
        implements BaseRepository<T, Long> {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    public abstract AtomicLong getIdCounter();

    public abstract Class<T> getType();

    public abstract Map<Long, T> getMap();

    @Override
    public T create(T entity) {
        Long currentId = getIdCounter().getAndIncrement();
        entity.setId(currentId);
        getMap().put(entity.getId(), entity);
        logger.info("Created new {} with id: {}.", entity.getClass().getSimpleName(), entity.getId());
        return entity;
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
        return entities.stream()
                .map(this::create)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public void update(T entity) {
        if (getMap().containsKey(entity.getId())) {
            getMap().put(entity.getId(), entity);
            logger.info("Updated {} with id: {}.", getType().getSimpleName(), entity.getId());
        } else {
            logger.info("{} with id: {} does not exist.", getType().getSimpleName(), entity.getId());
        }
    }

    @Override
    public void delete(T entity) {
        deleteById(entity.getId());
    }

    @Override
    public void deleteById(Long id) {
        if (getMap().remove(id) != null) {
            logger.info("Deleted {} with id: {}.", getType().getSimpleName(), id);
        } else {
            logger.info("{} with id: {} you tried to delete, does not exist.", getType().getSimpleName(), id);
        }
    }

    @Override
    public boolean exists(T entity) {
        return getMap().get(entity.getId()) != null;
    }

    @Override
    public T get(Long id) {
        return getMap().get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(getMap().values());
    }
}
