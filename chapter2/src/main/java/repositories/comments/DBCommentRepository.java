package repositories.comments;

import model.Comment;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.printf("Storing comment: %s%n", comment.getText());
    }
}
