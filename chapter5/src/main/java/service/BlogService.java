package service;


import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
public class BlogService {

    private final CommentRepository commentRepository;

    @Autowired
    public BlogService(CommentRepository commentRepository) {
        System.out.println("Initialized BlogService!");
        this.commentRepository = commentRepository;
    }

    public void bloggar(Comment comment) {
        this.commentRepository.storeComment(comment);
    }


    public CommentRepository getCommentRepository() {
        return this.commentRepository;
    }

}
