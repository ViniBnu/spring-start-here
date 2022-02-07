package proxies.comments;

import model.Comment;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;

@Component
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending push notification for comment: "
                        + comment.getText());
    }

}
