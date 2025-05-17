package com.andi.spring05corebeanscope;

import com.andi.spring05corebeanscope.config.ProjectConfig;
import com.andi.spring05corebeanscope.model.Comment;
import com.andi.spring05corebeanscope.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Andi Gela");
        comment.setText("This is my comment!!");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = context.getBean(CommentService.class);
        // In EAGER, it creates all the objects when the application run, by default EAGER is in singleton.
        // In LAZY, it creates only the objects and its own dependencies it requests




    }
}
