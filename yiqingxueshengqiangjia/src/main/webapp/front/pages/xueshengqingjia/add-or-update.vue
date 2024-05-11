<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#06A9FF","textAlign":"left"}' class="title">
					请假原因</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#06A9FF","borderRadius":"16rpx","color":"#06A9FF","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.xueshengqingjiaName" type="text" v-model="ruleForm.xueshengqingjiaName"
					placeholder="请假原因"></input>
			</view>
			<!-- text后缀 -->
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#06A9FF","textAlign":"left"}' class="title">
					详情</view>
				<textarea
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#06A9FF","borderRadius":"16rpx","color":"#06A9FF","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
					:disabled="ro.xueshengqingjiaText" v-model="ruleForm.xueshengqingjiaText" placeholder="详情" />
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#06A9FF","textAlign":"left"}' class="title">
					请假类型</view>
				<picker @change="xueshengqingjiaTypesChange" :value="xueshengqingjiaTypesIndex"
					:range="xueshengqingjiaTypesOptions" range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#06A9FF","borderRadius":"16rpx","color":"#06A9FF","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.xueshengqingjiaTypes?ruleForm.xueshengqingjiaValue:"请选择请假类型"}}
					</view>
				</picker>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#06A9FF","textAlign":"left"}' class="title">
					请假时间</view>
				<input
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#06A9FF","borderRadius":"16rpx","color":"#06A9FF","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.xueshengqingjiaTime" placeholder="请假时间" :readonly="ro.xueshengqingjiaTime"
					@tap="toggleTab('xueshengqingjiaTime')"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#06A9FF","textAlign":"left"}' class="title">
					请假天数</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#06A9FF","borderRadius":"16rpx","color":"#06A9FF","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.xueshengqingjiaNumber" type="number" v-model="ruleForm.xueshengqingjiaNumber"
					placeholder="请假天数"></input>
			</view>
			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#06A9FF","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="xueshengqingjiaTimeConfirm"
			ref="xueshengqingjiaTime" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
			ref="insertTime" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					xueshengqingjiaName: false,
					xueshengqingjiaText: false,
					xueshengqingjiaTypes: false,
					xueshengqingjiaTime: false,
					xueshengqingjiaNumber: false,
					yonghuId: false,
					xueshengqingjiaYesnoTypes: false,
					xueshengqingjiaYesnoText: false,
					xueshengqingjiaStatusTypes: false,
					insertTime: false,
					createTime: false,
				},
				ruleForm: {
					xueshengqingjiaName: '',
					xueshengqingjiaText: '',
					xueshengqingjiaTypes: '', //数字
					xueshengqingjiaValue: '', //数字对应的值
					xueshengqingjiaTime: '',
					xueshengqingjiaNumber: '',
					yonghuId: '',
					xueshengqingjiaYesnoTypes: '1', //数字
					xueshengqingjiaYesnoValue: '', //数字对应的值
					xueshengqingjiaYesnoText: '',
					xueshengqingjiaStatusTypes: '', //数字
					xueshengqingjiaStatusValue: '', //数字对应的值
					insertTime: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				xueshengqingjiaTypesOptions: [],
				xueshengqingjiaTypesIndex: 0,
				xueshengqingjiaYesnoTypesOptions: [],
				xueshengqingjiaYesnoTypesIndex: 0,
				xueshengqingjiaStatusTypesOptions: [],
				xueshengqingjiaStatusTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let xueshengqingjiaTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'xueshengqingjia_types',
			}
			let xueshengqingjiaTypes = await this.$api.page(`dictionary`, xueshengqingjiaTypesParams);
			this.xueshengqingjiaTypesOptions = xueshengqingjiaTypes.data.list
			/*下拉框*/
			let xueshengqingjiaYesnoTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'xueshengqingjia_yesno_types',
			}
			let xueshengqingjiaYesnoTypes = await this.$api.page(`dictionary`, xueshengqingjiaYesnoTypesParams);
			this.xueshengqingjiaYesnoTypesOptions = xueshengqingjiaYesnoTypes.data.list
			/*下拉框*/
			let xueshengqingjiaStatusTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'xueshengqingjia_status_types',
			}
			let xueshengqingjiaStatusTypes = await this.$api.page(`dictionary`, xueshengqingjiaStatusTypesParams);
			this.xueshengqingjiaStatusTypesOptions = xueshengqingjiaStatusTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`xueshengqingjia`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.xueshengqingjiaId) {
				this.ruleForm.xueshengqingjiaId = options.xueshengqingjiaId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			xueshengqingjiaTypesChange(e) {
				this.xueshengqingjiaTypesIndex = e.target.value
				this.ruleForm.xueshengqingjiaValue = this.xueshengqingjiaTypesOptions[this.xueshengqingjiaTypesIndex]
					.indexName
				this.ruleForm.xueshengqingjiaTypes = this.xueshengqingjiaTypesOptions[this.xueshengqingjiaTypesIndex]
					.codeIndex
			},
			xueshengqingjiaYesnoTypesChange(e) {
				this.xueshengqingjiaYesnoTypesIndex = e.target.value
				this.ruleForm.xueshengqingjiaYesnoValue = this.xueshengqingjiaYesnoTypesOptions[this
					.xueshengqingjiaYesnoTypesIndex].indexName
				this.ruleForm.xueshengqingjiaYesnoTypes = this.xueshengqingjiaYesnoTypesOptions[this
					.xueshengqingjiaYesnoTypesIndex].codeIndex
			},
			xueshengqingjiaStatusTypesChange(e) {
				this.xueshengqingjiaStatusTypesIndex = e.target.value
				this.ruleForm.xueshengqingjiaStatusValue = this.xueshengqingjiaStatusTypesOptions[this
					.xueshengqingjiaStatusTypesIndex].indexName
				this.ruleForm.xueshengqingjiaStatusTypes = this.xueshengqingjiaStatusTypesOptions[this
					.xueshengqingjiaStatusTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			// 日期控件
			xueshengqingjiaTimeConfirm(val) {
				console.log(val)
				this.ruleForm.xueshengqingjiaTime = val.result;
				this.$forceUpdate();
			},
			// 日期控件
			insertTimeConfirm(val) {
				console.log(val)
				this.ruleForm.insertTime = val.result;
				this.$forceUpdate();
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.xueshengqingjiaName)) {
					this.$utils.msg(`请假原因不能为空`);
					return
				}
				if ((!this.ruleForm.xueshengqingjiaText)) {
					this.$utils.msg(`详情不能为空`);
					return
				}
				if ((!this.ruleForm.xueshengqingjiaTime)) {
					this.$utils.msg(`请假时间不能为空`);
					return
				}
				if ((!this.ruleForm.xueshengqingjiaNumber) && (!this.$validate.isIntNumer(this.ruleForm
						.xueshengqingjiaNumber)) && this.ruleForm.xueshengqingjiaNumber > 0) {
					this.$utils.msg(`请假天数不能为空，不能小于0 格式为数字`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`xueshengqingjia`, this.ruleForm);
				} else {
					await this.$api.save(`xueshengqingjia`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
