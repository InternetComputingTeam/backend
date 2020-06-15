package com.example.backend.controller;

import com.example.backend.bl.group.GroupService;
import com.example.backend.vo.GroupInfoVO;
import com.example.backend.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/group")
public class GroupApi {

    @Autowired
    GroupService groupService;

    @PostMapping("/addGroup")
    public ResponseVO addGroup(@RequestBody GroupInfoVO groupInfoVO) {
        if (groupService.addGroup(groupInfoVO)) {
            return ResponseVO.buildSuccess(groupInfoVO);
        }
        return ResponseVO.buildFailure("组创建失败");
    }

    @PostMapping("/delGroup")
    public ResponseVO delGroup(@RequestBody GroupInfoVO groupInfoVO) {
        if (groupService.delGroup(groupInfoVO)) {
            return ResponseVO.buildSuccess(groupInfoVO);
        }
        return ResponseVO.buildFailure("组删除失败");
    }

    @PostMapping("/unbound/{userId}/{groupId}")
    public ResponseVO unBound(@PathVariable Integer groupId, @PathVariable String userId) {
        if (groupService.unBoundFromGroup(groupId, userId)) {
            return ResponseVO.buildSuccess();
        }
        return ResponseVO.buildFailure("解绑失败");
    }

    @PostMapping("/bindToGroup/{userId}/{groupId}")
    public ResponseVO bindToGroup(@PathVariable Integer groupId, @PathVariable String userId) {
        if (groupService.bindToGroup(groupId, userId)) {
            return ResponseVO.buildSuccess();
        }
        return ResponseVO.buildFailure("绑定失败");
    }

    @GetMapping("/queryByUser/{userId}")
    public ResponseVO queryByUser(@PathVariable String userId) {
        return ResponseVO.buildSuccess(groupService.queryByUser(userId));
    }






}
