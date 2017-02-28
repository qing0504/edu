package wusc.edu.service.role.dao;

import wusc.edu.common.core.dao.BaseDao;
import wusc.edu.facade.role.entity.PmsRole;


/**
 * 
 * @描述: 用户表数据访问层接口.
 * @作者: WuShuicheng .
 * @创建时间: 2013-7-22,下午5:51:47 .
 * @版本: 1.0 .
 */
public interface PmsRoleDao extends BaseDao<PmsRole> {

	/**
	 * 根据用户登录名获取用户信息.
	 * 
	 * @param loginName
	 *            .
	 * @return user .
	 */
	PmsRole findByUserNo(String userNo);

}
