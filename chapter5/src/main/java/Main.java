import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.CommentRepository;
import service.BlogService;
import service.CommentService;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment("Vini", "Hello!");

        var service = context.getBean(CommentService.class);
        var blogService = context.getBean(BlogService.class);

        service.publishComment(comment);
        blogService.bloggar(comment);

        CommentRepository commentRepositoryComment = service.getCommentRepository();
        CommentRepository commentRepositoryBlog = blogService.getCommentRepository();

        System.out.println(commentRepositoryComment.hashCode() + " " + commentRepositoryBlog.hashCode());

    }
}
