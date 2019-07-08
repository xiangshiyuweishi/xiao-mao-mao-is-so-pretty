package cn.communication.mapper;

import java.util.Map;

/*
 * 定义为用户的接口
 */
public interface UserMapper {
	//根据ID值查询出一条记录，并且以数据库中的字段作为map的键，与该字段对应的值为map的value 返回一个Map集合
	public abstract Map<String,String> getMapById();
	
	
	
}
