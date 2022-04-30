package com.comm.community_happy.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("bms_tip")
public class BmsTip implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;


    /**
     * 内容
     */
    @TableField("`content`")
    private String content;

    /**
     * 作者
     */
    private String author;

    /**
     * 类型
     */
    private boolean type;


}
