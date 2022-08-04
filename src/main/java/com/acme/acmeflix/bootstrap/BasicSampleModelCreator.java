package com.acme.acmeflix.bootstrap;

import com.acme.acmeflix.base.BaseComponent;
import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.SubscriptionPlan;
import com.acme.acmeflix.model.screenplay.Genre;
import com.acme.acmeflix.model.screenplay.MaturityRating;
import com.acme.acmeflix.model.screenplay.involved.Actor;
import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.Episode;
import com.acme.acmeflix.model.screenplay.tvshow.Season;
import com.acme.acmeflix.model.screenplay.tvshow.TvShow;
import com.acme.acmeflix.repository.MovieRepository;
import com.acme.acmeflix.repository.TvShowRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
public class BasicSampleModelCreator extends BaseComponent implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        MovieRepository movieRepository = new MovieRepository();
        TvShowRepository tvShowRepository = new TvShowRepository();

        Account account = Account.builder()
                .email("geofdufd@gmail.com")
                .phoneNumber("6587654565")
                .subscriptionPlan(SubscriptionPlan.BASIC)
                .build();

        Movie movie = Movie.builder()
                .id(1L)
                .description("A movie about fast cars.")
                .title("Fast and Furious")
                .build();

        Movie movie1 = Movie.builder()
                .id(2L)
                .description("A movie about fast cars.")
                .title("Fast and Furious 2")
                .build();


        logger.info("{}", account);
        logger.info("{}", movie.getDescription());

        logger.info("createAll function : {}", movieRepository.createAll(movie, movie1));
        logger.info("create function : {}", movieRepository.create(null));
        logger.info("get function : {}", movieRepository.get(2L));
        movieRepository.delete(movie);
        logger.info("Exists function : {}", movieRepository.exists(movie));
        MovieRepository.movies.forEach(System.out::println);


        TvShow tvShow = TvShow.builder()
                .id(1L)
                .description("The most unique tvshow ever created.")
                .genres(Set.of(Genre.ADVENTURE)).cast(Set.of(new Actor())).crewMembers(Set.of(new CrewMember())).maturityRating(MaturityRating.NC_17).build();

        Episode episode = Episode.builder()
                .id(1L)
                .description("Best EPISODE EVER.")
                .title("Star Trek")
                .duration(217D)
                .genre(Set.of(Genre.ACTION))
                .build();

        Season season = Season.builder()
                .episodes(Set.of(episode))
                .id(1L)
                .number(2)
                .build();


        tvShowRepository.create(tvShow);


    }
}
