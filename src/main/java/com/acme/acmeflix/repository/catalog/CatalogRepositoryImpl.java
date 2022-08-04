package com.acme.acmeflix.repository.catalog;

import com.acme.acmeflix.model.catalog.Catalog;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class CatalogRepositoryImpl extends BaseRepositoryImpl<Catalog> implements CatalogRepository {

    public CatalogRepositoryImpl() {
        super(Catalog.class, new HashSet<>());
    }
}
