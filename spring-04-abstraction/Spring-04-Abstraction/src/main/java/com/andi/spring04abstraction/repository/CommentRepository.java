package com.andi.spring04abstraction.repository;

import com.andi.spring04abstraction.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
