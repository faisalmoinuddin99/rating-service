package com.kakashi.rating.RatingService.service;

import com.kakashi.rating.RatingService.model.Rating;

import java.util.List;

public interface RatingService {
    // create
    Rating createRating(Rating rating);

    // get all ratings
    List<Rating> getRating() ;

    // fetch user wise rating
    List<Rating> getRatingByUserId(String userId) ;

    // get all by hotel
    List<Rating> getRatingByHotelId(String hotelId) ;
}
