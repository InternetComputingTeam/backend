package com.example.backend.po.comment;

import com.example.backend.vo.CommentVO;

import java.util.Date;

public class CommentPO {
    private int commentId;
    private String userId;
    private Date commentTime;
    private String commentDetail;


    public CommentPO(CommentVO commentVO){
        this.commentId=commentVO.getCommentId();
        this.userId=commentVO.getUserId();
        this.commentTime=commentVO.getCommentTime();
        this.commentDetail = commentVO.getCommentDetail();
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public CommentPO(){}
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
