import config.ProjectConfig;
//import model.Parrot;
import model.Comment;
import model.ParrotButComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.comments.EmailCommentNotificationProxy;
import repositories.comments.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        Parrot pajarito = context.getBean( Parrot.class);
//        Parrot pajarita = context.getBean("Laura", Parrot.class);
//        Parrot pajaritoOriginal = context.getBean("parrot", Parrot.class);
//        ParrotButComponent parrotButComponent = context.getBean(ParrotButComponent.class);
//
//        System.out.println(pajarito.getName());
//        System.out.println(pajarita.getName());
//        System.out.println(pajaritoOriginal.getName());
//        System.out.println(parrotButComponent.getName());


            var context =
                    new AnnotationConfigApplicationContext(
                            ProjectConfig.class);

            var comment = new Comment();
            comment.setAuthor("Laurentiu");
            comment.setText("Demo comment");

            var commentService = context.getBean(CommentService.class);
            commentService.publishComment(comment);
        }
}
