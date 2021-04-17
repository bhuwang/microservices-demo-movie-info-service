/**
 * 
 */
package com.exampledemo.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampledemo.microservices.model.Movie;

/**
 * @author bhuwangautam
 *
 */

@RestController
@RequestMapping("/movies")
public class MovieInfoServiceController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId) {
        System.out.println("movieId: " + movieId);
        Movie movie = null;
        if ("titanic".equals(movieId)) {
            movie = new Movie(movieId, "Titanic");
        }
        if ("gozilla".equals(movieId)) {
            movie = new Movie(movieId, "Gozilla");
        }
        return movie;
    }
}
