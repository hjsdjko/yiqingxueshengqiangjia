package com.dao;

import com.entity.JiaqiweizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaqiweizhiView;

/**
 * 假期位置 Dao 接口
 *
 * @author 
 */
public interface JiaqiweizhiDao extends BaseMapper<JiaqiweizhiEntity> {

   List<JiaqiweizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
