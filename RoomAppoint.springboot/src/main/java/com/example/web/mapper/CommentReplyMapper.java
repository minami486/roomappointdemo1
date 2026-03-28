package com.example.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web.entity.CommentReply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 评论回复Mapper
 */
@Mapper
public interface CommentReplyMapper extends BaseMapper<CommentReply> {

    /**
     * 根据预约记录ID查询回复列表
     * @param appointRecordId 预约记录ID
     * @return 回复列表
     */
    List<CommentReply> selectByAppointRecordId(@Param("appointRecordId") Integer appointRecordId);
}
