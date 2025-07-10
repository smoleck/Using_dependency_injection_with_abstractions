package org.example;


import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(AppConfig.class);

      var comment = new Comment();
      comment.setAuthor("Laurentiu");
      comment.setText("test");

      var commentService = context.getBean(CommentService.class);
      commentService.publishComment(comment);
    }
}