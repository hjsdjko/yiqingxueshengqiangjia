package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 假期位置
 *
 * @author 
 * @email
 */
@TableName("jiaqiweizhi")
public class JiaqiweizhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaqiweizhiEntity() {

	}

	public JiaqiweizhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 请假
     */
    @TableField(value = "xueshengqingjia_id")

    private Integer xueshengqingjiaId;


    /**
     * 所在地址
     */
    @TableField(value = "jiaqiweizhi_address")

    private String jiaqiweizhiAddress;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 是否来自疫区
     */
    @TableField(value = "jiaqiweizhi_yesno_types")

    private Integer jiaqiweizhiYesnoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：请假
	 */
    public Integer getXueshengqingjiaId() {
        return xueshengqingjiaId;
    }


    /**
	 * 获取：请假
	 */

    public void setXueshengqingjiaId(Integer xueshengqingjiaId) {
        this.xueshengqingjiaId = xueshengqingjiaId;
    }
    /**
	 * 设置：所在地址
	 */
    public String getJiaqiweizhiAddress() {
        return jiaqiweizhiAddress;
    }


    /**
	 * 获取：所在地址
	 */

    public void setJiaqiweizhiAddress(String jiaqiweizhiAddress) {
        this.jiaqiweizhiAddress = jiaqiweizhiAddress;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：是否来自疫区
	 */
    public Integer getJiaqiweizhiYesnoTypes() {
        return jiaqiweizhiYesnoTypes;
    }


    /**
	 * 获取：是否来自疫区
	 */

    public void setJiaqiweizhiYesnoTypes(Integer jiaqiweizhiYesnoTypes) {
        this.jiaqiweizhiYesnoTypes = jiaqiweizhiYesnoTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaqiweizhi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xueshengqingjiaId=" + xueshengqingjiaId +
            ", jiaqiweizhiAddress=" + jiaqiweizhiAddress +
            ", insertTime=" + insertTime +
            ", jiaqiweizhiYesnoTypes=" + jiaqiweizhiYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
