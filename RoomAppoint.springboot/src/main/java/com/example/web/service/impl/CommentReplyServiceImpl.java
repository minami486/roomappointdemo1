package com.example.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.web.entity.CommentReply;
import com.example.web.mapper.CommentReplyMapper;
import com.example.web.service.CommentReplyService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 评论回复Service实现类
 */
@Service
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply> implements CommentReplyService {

    /**
     * 根据预约记录ID查询回复列表
     * @param appointRecordId 预约记录ID
     * @return 回复列表
     */
    @Override
    public List<CommentReply> getByAppointRecordId(Integer appointRecordId) {
        return baseMapper.selectByAppointRecordId(appointRecordId);
    }

    /**
     * 保存评论回复
     * @param reply 回复实体
     * @return 保存结果
     */
    @Override
    public boolean saveReply(CommentReply reply) {
        // 设置回复时间
        reply.setReplyTime(LocalDateTime.now());
        return save(reply);
    }
}
