package com.example.joblisting.repository;



import com.example.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post,String>
{

    List<Post> findAll();

    Post save(Post post);
}
