package com.andi.spring04abstraction.proxy;

import com.andi.spring04abstraction.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
