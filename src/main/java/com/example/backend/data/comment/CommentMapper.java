package com.example.backend.data.comment;


import com.example.backend.po.comment.CommentPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommentMapper {

    int addComment(CommentPO commentPO);

    List<CommentPO> queryCommentsByUserId(String userId);

    int deleteComment(CommentPO commentPO);
}
