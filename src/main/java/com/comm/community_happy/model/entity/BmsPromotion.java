package com.comm.community_happy.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName("bms_promotion")
@Accessors(chain = true)
public class BmsPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField("title")
    private  String title;

    @TableField("link")
    private String link;

    @TableField("`description`")
    private String description;
    public BmsPromotion(){

    }


}
