package cn.wzy.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目管理-组织表
 * </p>
 *
 * @author wzy
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("project_group")
//@ApiModel(value="ProjectGroup对象", description="项目管理-组织表")
public class ProjectGroup implements Serializable {


    //@ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    //@ApiModelProperty(value = "组织名称")
    @TableField("group_name")
    private String groupName;

    //@ApiModelProperty(value = "头像")
    @TableField("group_avatar")
    private String groupAvatar;

    //@ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

    //@ApiModelProperty(value = "拥有者")
    @TableField("owner_user_id")
    private String ownerUserId;

    //@ApiModelProperty(value = "逻辑删除标志 1：已删除， 0：未删除，默认0")
    @TableField("is_delete")
    @TableLogic
    private Boolean deleted;

    //@ApiModelProperty(value = "版本号")
    @TableField("version")
    @Version
    private Integer version;

    //@ApiModelProperty(value = "创建人")
    @TableField(value = "created_by", fill = FieldFill.INSERT)
    private String createdBy;

    //@ApiModelProperty(value = "创建时间")
    @TableField("created_time")
    @JSONField(format = "yyyy-MM-dd")
    private Date createdTime;

    //@ApiModelProperty(value = "更新人")
    @TableField(value = "last_modified_by", fill = FieldFill.INSERT_UPDATE)
    private String lastModifiedBy;

    //@ApiModelProperty(value = "更新时间")
    @TableField("last_modified_time")
    @JSONField(format = "yyyy-MM-dd")
    private Date lastModifiedTime;


}
