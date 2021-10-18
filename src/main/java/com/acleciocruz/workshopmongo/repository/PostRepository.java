package com.acleciocruz.workshopmongo.repository;

import com.acleciocruz.workshopmongo.domain.Post;
import com.acleciocruz.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
