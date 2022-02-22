package repository;


import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class ProxyRepository {

    public void sendComment(Comment comment) {
        System.out.println("Sending Comment: " + comment.getText());
    }
}
