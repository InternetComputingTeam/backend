package com.example.backend.blImpl.comment;

import com.example.backend.bl.comment.CommentService;
import com.example.backend.data.comment.CommentMapper;
import com.example.backend.po.comment.CommentPO;
import com.example.backend.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public Boolean addComment(CommentVO commentVO) {
        return commentMapper.addComment(new CommentPO(commentVO))>0;
    }

    @Override
    public List<CommentPO> queryCommentsByUserId(String userId) {
        return commentMapper.queryCommentsByUserId(userId);
    }

    @Override
    public Boolean deleteComment(CommentVO commentVO) {
        return commentMapper.deleteComment(new CommentPO(commentVO))>0;
    }
}
