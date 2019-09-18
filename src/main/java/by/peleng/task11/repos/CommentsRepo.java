package by.peleng.task11.repos;

import by.peleng.task11.domain.Comments;

import by.peleng.task11.domain.Message;
import by.peleng.task11.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentsRepo extends JpaRepository<Comments,Long> {
    List<Comments> findByMessage (Message message);

}
