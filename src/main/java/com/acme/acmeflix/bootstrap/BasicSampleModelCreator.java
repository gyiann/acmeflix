package com.acme.acmeflix.bootstrap;

import com.acme.acmeflix.base.BaseComponent;
import com.acme.acmeflix.exception.BusinessException;
import com.acme.acmeflix.model.account.Account;
import com.acme.acmeflix.model.account.SubscriptionPlan;
import com.acme.acmeflix.model.screenplay.movie.Movie;
import com.acme.acmeflix.model.screenplay.tvshow.Episode;
import com.acme.acmeflix.model.screenplay.tvshow.Season;
import com.acme.acmeflix.service.account.AccountService;
import com.acme.acmeflix.service.movie.MovieService;
import com.acme.acmeflix.service.tvshow.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
@RequiredArgsConstructor
public class BasicSampleModelCreator extends BaseComponent implements CommandLineRunner {

    private final MovieService movieService;
    private final TvShowService tvShowService;
    private final AccountService accountService;

    @Override
    public void run(String... args) throws BusinessException {


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

        logger.info("createAll function : {}", movieService.createAll(movie, movie1));
        logger.info("get function : {}", movieService.get(2L));
        movieService.delete(movie);
        logger.info("Exists function : {}", movieService.exists(movie));
        movieService.findAll().forEach(System.out::println);


        Episode episode = Episode.builder()
                .id(1L)
                .description("Best EPISODE EVER.")
                .title("Star Trek")
                .duration(217D)
                .build();

        Season season = Season.builder()
                .episodes(Set.of(episode))
                .id(1L)
                .number(2)
                .build();

        Account account1 = accountService.createNewAccount("123@gmail.com");
        logger.info("{}", account1.getProfiles());
    }
}
