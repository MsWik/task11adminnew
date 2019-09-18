package by.peleng.task11.repos;

import by.peleng.task11.domain.Comments;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentsRepo extends JpaRepository<Comments,Long> {


}
