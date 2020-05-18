package com.example.backend.controller;

import com.example.backend.bl.comment.CommentService;
import com.example.backend.vo.CommentVO;
import com.example.backend.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentApi {
    @Autowired
    private CommentService commentService;

    @PostMapping("/addComment")//TODO 路由里面要不要加id
    public ResponseVO addComment(@RequestBody CommentVO commentVO){
        boolean flag = commentService.addComment(commentVO);
        if(flag)return ResponseVO.buildSuccess(true);
        else return ResponseVO.buildFailure("添加失败");
    }


    @GetMapping("/{userId}/queryCommentsByUserId")//TODO List的PO和VO不好转换 直接用PO了
    public ResponseVO queryCommentsByUserId(@PathVariable String userId){
        return ResponseVO.buildSuccess(commentService.queryCommentsByUserId(userId));
    }

    @PostMapping("/deleteComment")//TODO 路由里面要不要加id
    public ResponseVO deleteComment(@RequestBody CommentVO commentVO){
        boolean flag = commentService.deleteComment(commentVO);
        if(flag)return ResponseVO.buildSuccess(true);
        else return ResponseVO.buildFailure("删除失败");
    }

}
