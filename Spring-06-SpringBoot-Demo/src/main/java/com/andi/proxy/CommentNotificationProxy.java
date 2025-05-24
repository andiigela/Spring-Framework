package com.andi.proxy;

import com.andi.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
