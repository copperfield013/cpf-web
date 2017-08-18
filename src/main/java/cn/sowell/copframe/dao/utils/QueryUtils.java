package cn.sowell.copframe.dao.utils;

import org.hibernate.Criteria;
import org.hibernate.Query;

import cn.sowell.copframe.dto.page.PageInfo;

public class QueryUtils {
	/**
	 * 根据BaseModel的参数设置Query对象的分页参数
	 * @param query
	 * @param criteria
	 */
	public static void setPagingParamWithCriteria(Query query,
			PageInfo pageInfo) {
		if(query != null && pageInfo != null){
			query.setFirstResult(pageInfo.getFirstIndex());
			query.setMaxResults(pageInfo.getPageSize());
		}
	}
	
	public static void setPagingParamWithCriteria(Criteria criteria,
			PageInfo pageInfo) {
		if(criteria != null && pageInfo != null){
			criteria.setFirstResult(pageInfo.getFirstIndex());
			criteria.setMaxResults(pageInfo.getPageSize());
		}
	}
	
}
