package com.andi.spring05corebeanscope.service;
import com.andi.spring05corebeanscope.model.Comment;
import com.andi.spring05corebeanscope.proxy.CommentNotificationProxy;
import com.andi.spring05corebeanscope.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE) // 2nd way for bean scope
@Lazy // by default eager is with singleton, lazy creates bean when it requires from the container
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Test if Bean is Lazy or Eager!!!!" +
                "Eager will show this message without requesting the bean from the container" +
                "Lazy will not show this message without requesting the bean from the container");
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
