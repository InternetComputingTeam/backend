package com.example.backend.vo;

import com.example.backend.po.comment.CommentPO;

import java.util.Date;

public class CommentVO {
    private int commentId;
    private String userId;
    private Date commentTime;
    private String commentDetail;
    private int status;

    public CommentVO(CommentPO commentPO){
        this.commentId=commentPO.getCommentId();
        this.userId=commentPO.getUserId();
        this.commentTime=commentPO.getCommentTime();
        this.commentDetail = commentPO.getCommentDetail();
        this.status = commentPO.getStatus();
    }

    public CommentVO(){}

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

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

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }
}
