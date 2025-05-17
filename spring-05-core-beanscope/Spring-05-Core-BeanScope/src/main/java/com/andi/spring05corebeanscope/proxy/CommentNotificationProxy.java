package com.andi.spring05corebeanscope.proxy;

import com.andi.spring05corebeanscope.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
