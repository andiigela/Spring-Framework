package com.andi.repository;

import com.andi.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
