package com.example.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.web.entity.CommentReply;

import java.util.List;

/**
 * 评论回复Service
 */
public interface CommentReplyService extends IService<CommentReply> {

    /**
     * 根据预约记录ID查询回复列表
     * @param appointRecordId 预约记录ID
     * @return 回复列表
     */
    List<CommentReply> getByAppointRecordId(Integer appointRecordId);

    /**
     * 保存评论回复
     * @param reply 回复实体
     * @return 保存结果
     */
    boolean saveReply(CommentReply reply);
}
