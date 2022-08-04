package com.acme.acmeflix.repository;

import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class TvShowRepositoryImpl extends BaseRepositoryImpl<TvShow> implements TvShowRepository {

    public TvShowRepositoryImpl() {
        super(TvShow.class, new HashSet<>());
    }
}
