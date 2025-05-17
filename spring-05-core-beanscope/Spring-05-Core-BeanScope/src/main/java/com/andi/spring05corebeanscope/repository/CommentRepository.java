package com.andi.spring05corebeanscope.repository;

import com.andi.spring05corebeanscope.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
