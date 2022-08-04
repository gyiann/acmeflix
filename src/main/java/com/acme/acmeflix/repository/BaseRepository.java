package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel> {

    T create(final T entity);

    List<T> createAll(final T... entities);

    List<T> createAll(final List<T> entities);

    void update(T entity);

    void delete(T entity);

    boolean exists(T entity);

    T get(Long id);

    List<T> findAll();
}
