package com.senyint.dubbo.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.common.Mapper;


    /**
    * @ClassName: BaseService
    * @Description: 基于spring4的 通用service实现 查询方法没有增加事务
    * @author zhangyu
    * @date 2017年6月16日下午2:46:39
    * @version V1.0  
	* @author zhangyu
    * @param <T>
    */
    
@Service
public abstract class BaseService<T> {

	@Autowired
	private Mapper<T> mapper;
	
	public T selectOne(T record) {
		return mapper.selectOne(record);
	}
	
	public List<T> select(T record) {
		return mapper.select(record);
	}

	public List<T> selectAll() {
		return mapper.selectAll();
	}
	
	public int selectCount(T record) {
		return mapper.selectCount(record);
	}

	public T selectByPrimaryKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Transactional
	public int insert(T record) {
		return mapper.insert(record);
	}
	
	@Transactional
	public int insertSelective(T record) {
		return mapper.insertSelective(record);
	}

	@Transactional
	public int updateByPrimaryKey(T record) {
		return mapper.updateByPrimaryKey(record);
	}
	
	@Transactional
	public int updateByPrimaryKeySelective(T record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	public int delete(T record) {
		return mapper.delete(record);
	}

	@Transactional
	public int deleteByPrimaryKey(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}

	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}

	public int selectCountByExample(Object example) {
		return mapper.selectCountByExample(example);
	}

	@Transactional
	public int deleteByExample(Object example) {
		return mapper.deleteByExample(example);
	}

	@Transactional
	public int updateByExample(T record, Object example) {
		return mapper.updateByExample(record, example);
	}
	
	@Transactional
	public int updateByExampleSelective(T record, Object example) {
		return mapper.updateByExampleSelective(record, example);
	}

	public PageInfo<T> getPageList(int pageNum, int rowNum, T record) {
		PageHelper.startPage(pageNum, rowNum);
		List<T> list = mapper.select(record);
		PageInfo<T> page= new PageInfo<T>(list);
		return page;
	}
	
	public PageInfo<T> getPageExampleList(int pageNum, int rowNum,Object example) {
		PageHelper.startPage(pageNum, rowNum);
		List<T> list = mapper.selectByExample(example);
		PageInfo<T> page= new PageInfo<T>(list);
		return page;
	}

}
