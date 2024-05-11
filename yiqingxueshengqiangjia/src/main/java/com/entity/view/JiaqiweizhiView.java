package com.entity.view;

import com.entity.JiaqiweizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 假期位置
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaqiweizhi")
public class JiaqiweizhiView extends JiaqiweizhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 是否来自疫区的值
		*/
		private String jiaqiweizhiYesnoValue;



		//级联表 xueshengqingjia
			/**
			* 请假原因
			*/
			private String xueshengqingjiaName;
			/**
			* 详情
			*/
			private String xueshengqingjiaText;
			/**
			* 请假类型
			*/
			private Integer xueshengqingjiaTypes;
				/**
				* 请假类型的值
				*/
				private String xueshengqingjiaValue;
			/**
			* 请假时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date xueshengqingjiaTime;
			/**
			* 请假天数
			*/
			private Integer xueshengqingjiaNumber;
			/**
			* 学生请假 的 学生
			*/
			private Integer xueshengqingjiaYonghuId;
			/**
			* 审核结果
			*/
			private Integer xueshengqingjiaYesnoTypes;
				/**
				* 审核结果的值
				*/
				private String xueshengqingjiaYesnoValue;
			/**
			* 处理结果
			*/
			private String xueshengqingjiaYesnoText;
			/**
			* 请假状态
			*/
			private Integer xueshengqingjiaStatusTypes;
				/**
				* 请假状态的值
				*/
				private String xueshengqingjiaStatusValue;

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiaqiweizhiView() {

	}

	public JiaqiweizhiView(JiaqiweizhiEntity jiaqiweizhiEntity) {
		try {
			BeanUtils.copyProperties(this, jiaqiweizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否来自疫区的值
			*/
			public String getJiaqiweizhiYesnoValue() {
				return jiaqiweizhiYesnoValue;
			}
			/**
			* 设置： 是否来自疫区的值
			*/
			public void setJiaqiweizhiYesnoValue(String jiaqiweizhiYesnoValue) {
				this.jiaqiweizhiYesnoValue = jiaqiweizhiYesnoValue;
			}














				//级联表的get和set xueshengqingjia
					/**
					* 获取： 请假原因
					*/
					public String getXueshengqingjiaName() {
						return xueshengqingjiaName;
					}
					/**
					* 设置： 请假原因
					*/
					public void setXueshengqingjiaName(String xueshengqingjiaName) {
						this.xueshengqingjiaName = xueshengqingjiaName;
					}
					/**
					* 获取： 详情
					*/
					public String getXueshengqingjiaText() {
						return xueshengqingjiaText;
					}
					/**
					* 设置： 详情
					*/
					public void setXueshengqingjiaText(String xueshengqingjiaText) {
						this.xueshengqingjiaText = xueshengqingjiaText;
					}
					/**
					* 获取： 请假类型
					*/
					public Integer getXueshengqingjiaTypes() {
						return xueshengqingjiaTypes;
					}
					/**
					* 设置： 请假类型
					*/
					public void setXueshengqingjiaTypes(Integer xueshengqingjiaTypes) {
						this.xueshengqingjiaTypes = xueshengqingjiaTypes;
					}


						/**
						* 获取： 请假类型的值
						*/
						public String getXueshengqingjiaValue() {
							return xueshengqingjiaValue;
						}
						/**
						* 设置： 请假类型的值
						*/
						public void setXueshengqingjiaValue(String xueshengqingjiaValue) {
							this.xueshengqingjiaValue = xueshengqingjiaValue;
						}
					/**
					* 获取： 请假时间
					*/
					public Date getXueshengqingjiaTime() {
						return xueshengqingjiaTime;
					}
					/**
					* 设置： 请假时间
					*/
					public void setXueshengqingjiaTime(Date xueshengqingjiaTime) {
						this.xueshengqingjiaTime = xueshengqingjiaTime;
					}
					/**
					* 获取： 请假天数
					*/
					public Integer getXueshengqingjiaNumber() {
						return xueshengqingjiaNumber;
					}
					/**
					* 设置： 请假天数
					*/
					public void setXueshengqingjiaNumber(Integer xueshengqingjiaNumber) {
						this.xueshengqingjiaNumber = xueshengqingjiaNumber;
					}
					/**
					* 获取：学生请假 的 学生
					*/
					public Integer getXueshengqingjiaYonghuId() {
						return xueshengqingjiaYonghuId;
					}
					/**
					* 设置：学生请假 的 学生
					*/
					public void setXueshengqingjiaYonghuId(Integer xueshengqingjiaYonghuId) {
						this.xueshengqingjiaYonghuId = xueshengqingjiaYonghuId;
					}

					/**
					* 获取： 审核结果
					*/
					public Integer getXueshengqingjiaYesnoTypes() {
						return xueshengqingjiaYesnoTypes;
					}
					/**
					* 设置： 审核结果
					*/
					public void setXueshengqingjiaYesnoTypes(Integer xueshengqingjiaYesnoTypes) {
						this.xueshengqingjiaYesnoTypes = xueshengqingjiaYesnoTypes;
					}


						/**
						* 获取： 审核结果的值
						*/
						public String getXueshengqingjiaYesnoValue() {
							return xueshengqingjiaYesnoValue;
						}
						/**
						* 设置： 审核结果的值
						*/
						public void setXueshengqingjiaYesnoValue(String xueshengqingjiaYesnoValue) {
							this.xueshengqingjiaYesnoValue = xueshengqingjiaYesnoValue;
						}
					/**
					* 获取： 处理结果
					*/
					public String getXueshengqingjiaYesnoText() {
						return xueshengqingjiaYesnoText;
					}
					/**
					* 设置： 处理结果
					*/
					public void setXueshengqingjiaYesnoText(String xueshengqingjiaYesnoText) {
						this.xueshengqingjiaYesnoText = xueshengqingjiaYesnoText;
					}
					/**
					* 获取： 请假状态
					*/
					public Integer getXueshengqingjiaStatusTypes() {
						return xueshengqingjiaStatusTypes;
					}
					/**
					* 设置： 请假状态
					*/
					public void setXueshengqingjiaStatusTypes(Integer xueshengqingjiaStatusTypes) {
						this.xueshengqingjiaStatusTypes = xueshengqingjiaStatusTypes;
					}


						/**
						* 获取： 请假状态的值
						*/
						public String getXueshengqingjiaStatusValue() {
							return xueshengqingjiaStatusValue;
						}
						/**
						* 设置： 请假状态的值
						*/
						public void setXueshengqingjiaStatusValue(String xueshengqingjiaStatusValue) {
							this.xueshengqingjiaStatusValue = xueshengqingjiaStatusValue;
						}


				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
