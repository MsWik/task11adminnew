package by.peleng.task11.repos;


import by.peleng.task11.domain.Message;
import by.peleng.task11.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MessageRepo extends CrudRepository<Message, Long> {

    Page<Message> findAll(Pageable pageable);

    Page<Message> findByTag(String tag, Pageable pageable);
    Page<Message> findByAuthor(User user, Pageable pageable);

}