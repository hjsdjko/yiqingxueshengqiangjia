package com.entity.vo;

import com.entity.JiaqiweizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 假期位置
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaqiweizhi")
public class JiaqiweizhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 是否来自疫区
     */

    @TableField(value = "jiaqiweizhi_yesno_types")
    private Integer jiaqiweizhiYesnoTypes;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
