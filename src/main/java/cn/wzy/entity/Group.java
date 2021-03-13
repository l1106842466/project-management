package cn.wzy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目管理-组织表
 * </p>
 *
 * @author wzy
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("smbms_group")
//@ApiModel(value="Group对象", description="项目管理-组织表")
public class Group implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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

    //@ApiModelProperty(value = "地址")
    @TableField("address")
    private String address;

    //@ApiModelProperty(value = "逻辑删除标志 1：已删除， 0：未删除，默认0")
    @TableField("is_delete")
    @TableLogic
    private Boolean deleted;

    //@ApiModelProperty(value = "版本号")
    @TableField("version")
    @Version
    private Integer version;

    //@ApiModelProperty(value = "创建人")
    @TableField("created_by")
    private String createdBy;

    //@ApiModelProperty(value = "创建时间")
    @TableField("created_time")
    private LocalDateTime createdTime;

    //@ApiModelProperty(value = "更新人")
    @TableField("last_modified_by")
    private String lastModifiedBy;

    //@ApiModelProperty(value = "更新时间")
    @TableField("last_modified_time")
    private LocalDateTime lastModifiedTime;


}
