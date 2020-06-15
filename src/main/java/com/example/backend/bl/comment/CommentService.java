package com.example.backend.bl.comment;

import com.example.backend.po.comment.CommentPO;
import com.example.backend.vo.CommentVO;


import java.util.List;

public interface CommentService {
    Boolean addComment(CommentVO commentVO);
    List<CommentPO> queryCommentsByUserId(String userId);

    Boolean deleteComment(CommentVO commentVO);

}
