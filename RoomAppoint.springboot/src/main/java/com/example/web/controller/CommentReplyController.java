package com.example.web.controller;

import com.example.web.entity.CommentReply;
import com.example.web.service.CommentReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 评论回复Controller
 */
@RestController
@RequestMapping("/CommentReply")
public class CommentReplyController {

    @Autowired
    private CommentReplyService _CommentReplyService;

    /**
     * 根据预约记录ID获取回复列表
     * @param appointRecordId 预约记录ID
     * @return 回复列表
     */
    @RequestMapping(value = "/ListByAppointRecordId", method = RequestMethod.GET)
    public List<CommentReply> ListByAppointRecordId(@RequestParam("appointRecordId") Integer appointRecordId) {
        return _CommentReplyService.getByAppointRecordId(appointRecordId);
    }

    /**
     * 保存评论回复
     * @param reply 回复实体
     * @return 保存结果
     */
    @RequestMapping(value = "/Save", method = RequestMethod.POST)
    public boolean Save(@RequestBody CommentReply reply) {
        return _CommentReplyService.saveReply(reply);
    }
}
