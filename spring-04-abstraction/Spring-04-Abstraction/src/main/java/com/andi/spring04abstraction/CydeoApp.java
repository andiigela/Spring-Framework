package com.andi.spring04abstraction;

import com.andi.spring04abstraction.config.ProjectConfig;
import com.andi.spring04abstraction.model.Comment;
import com.andi.spring04abstraction.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Andi Gela");
        comment.setText("This is my comment!!");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);



    }
}
