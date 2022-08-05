package com.acme.acmeflix.service;

import com.acme.acmeflix.base.BaseComponent;
import com.acme.acmeflix.model.BaseModel;
import com.acme.acmeflix.repository.BaseRepository;

import java.util.List;

public abstract class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T, Long> {

    public abstract BaseRepository<T, Long> getRepository();

    @Override
    public T create(T entity) {
        return getRepository().create(entity);
    }

    @Override
    public List<T> createAll(T... entities) {
        return getRepository().createAll(entities);
    }

    @Override
    public List<T> createAll(List<T> entities) {
        return getRepository().createAll(entities);
    }

    @Override
    public void update(T entity) {
        getRepository().update(entity);
    }

    @Override
    public void delete(T entity) {
        getRepository().delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        getRepository().deleteById(id);
    }

    @Override
    public boolean exists(T entity) {
        return getRepository().exists(entity);
    }

    @Override
    public T get(Long id) {
        return getRepository().get(id);
    }

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }
}
