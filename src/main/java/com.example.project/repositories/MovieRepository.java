package com.example.project.repositories;
import com.example.project.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MovieRepository extends MongoRepository<Movie,String>{
}