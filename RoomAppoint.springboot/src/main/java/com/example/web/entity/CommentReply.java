package com.example.web.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 评论回复表
 */
@Data
@TableName("`CommentReply`")
public class CommentReply extends BaseEntity {

    /**
     * 预约记录ID
     */
    @JsonProperty("AppointRecordId")
    @TableField(value = "AppointRecordId")
    private Integer AppointRecordId;

    /**
     * 回复内容
     */
    @JsonProperty("ReplyContent")
    @TableField(value = "ReplyContent")
    private String ReplyContent;

    /**
     * 回复人ID
     */
    @JsonProperty("ReplyUserId")
    @TableField(value = "ReplyUserId")
    private Integer ReplyUserId;

    /**
     * 回复时间
     */
    @JsonProperty("ReplyTime")
    @TableField(value = "ReplyTime")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime ReplyTime;

    /**
     * 回复人姓名
     */
    @JsonProperty("ReplyUserName")
    @TableField(exist = false)
    private String ReplyUserName;

    /**
     * 回复人角色
     */
    @JsonProperty("ReplyUserRole")
    @TableField(exist = false)
    private Integer ReplyUserRole;
}
