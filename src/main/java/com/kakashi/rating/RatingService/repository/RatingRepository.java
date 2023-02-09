package com.kakashi.rating.RatingService.repository;


import com.kakashi.rating.RatingService.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    // custom finder methods
    List<Rating> findByUserId(String userId) ;

    List<Rating> findByHotelId(String hotelId) ;
}
