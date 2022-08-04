package com.acme.acmeflix.repository.tvshow;

import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class TvShowRepositoryImpl extends BaseRepositoryImpl<TvShow> implements TvShowRepository {

    public TvShowRepositoryImpl() {
        super(TvShow.class, new HashSet<>());
    }
}
