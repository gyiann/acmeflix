package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel, K> {

    T create(final T entity);

    List<T> createAll(final T... entities);

    List<T> createAll(final List<T> entities);

    boolean update(T entity);

    boolean delete(T entity);

    boolean deleteById(K id);

    boolean exists(T entity);

    T get(K id);

    List<T> findAll();
}
