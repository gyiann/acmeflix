package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.catalog.Catalog;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class CatalogRepositoryImpl extends BaseRepositoryImpl<Catalog> implements CatalogRepository {

    public CatalogRepositoryImpl() {
        super(Catalog.class, new HashSet<>());
    }
}
