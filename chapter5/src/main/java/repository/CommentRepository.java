package repository;


import model.Comment;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {

    public void storeComment(Comment comment) {
        System.out.println(comment.getText());
    }
}
