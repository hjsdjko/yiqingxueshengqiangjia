package com.entity.model;

import com.entity.JiaqiweizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 假期位置
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaqiweizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 请假
     */
    private Integer xueshengqingjiaId;


    /**
     * 所在地址
     */
    private String jiaqiweizhiAddress;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 是否来自疫区
     */
    private Integer jiaqiweizhiYesnoTypes;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：请假
	 */
    public Integer getXueshengqingjiaId() {
        return xueshengqingjiaId;
    }


    /**
	 * 设置：请假
	 */
    public void setXueshengqingjiaId(Integer xueshengqingjiaId) {
        this.xueshengqingjiaId = xueshengqingjiaId;
    }
    /**
	 * 获取：所在地址
	 */
    public String getJiaqiweizhiAddress() {
        return jiaqiweizhiAddress;
    }


    /**
	 * 设置：所在地址
	 */
    public void setJiaqiweizhiAddress(String jiaqiweizhiAddress) {
        this.jiaqiweizhiAddress = jiaqiweizhiAddress;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：是否来自疫区
	 */
    public Integer getJiaqiweizhiYesnoTypes() {
        return jiaqiweizhiYesnoTypes;
    }


    /**
	 * 设置：是否来自疫区
	 */
    public void setJiaqiweizhiYesnoTypes(Integer jiaqiweizhiYesnoTypes) {
        this.jiaqiweizhiYesnoTypes = jiaqiweizhiYesnoTypes;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
