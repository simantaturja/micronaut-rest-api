package com.example.repositories;

import com.example.domain.Story;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {

}
