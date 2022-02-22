package service;


import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;
import repository.ProxyRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final ProxyRepository proxyRepository;
    private final CommentProcessor commentProcessor;

    @Autowired
    public CommentService(CommentRepository commentRepository,
                          ProxyRepository proxyRepository,
                          CommentProcessor processor) {
        this.commentProcessor = processor;
        System.out.println("Initialized! CommentService");
        this.commentRepository = commentRepository;
        this.proxyRepository = proxyRepository;
    }

    public void publishComment(Comment comment) {
        this.commentRepository.storeComment(comment);
        this.proxyRepository.sendComment(comment);
    }

    public void sendComment(Comment comment) {
        this.commentProcessor.setComment(comment);
        this.commentProcessor.setComment(comment);
        this.commentProcessor.processComment();
        this.commentProcessor.validateComment();
        comment = this.commentProcessor.getComment();
        System.out.println(comment);
    }

    public CommentRepository getCommentRepository() {
        return this.commentRepository;
    }
}
