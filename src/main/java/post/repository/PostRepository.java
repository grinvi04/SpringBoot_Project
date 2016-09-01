package post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import post.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
