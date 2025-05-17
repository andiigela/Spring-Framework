package com.andi.spring04abstraction.proxy;

import com.andi.spring04abstraction.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notificaction for comment " + comment.getText());
    }
}
