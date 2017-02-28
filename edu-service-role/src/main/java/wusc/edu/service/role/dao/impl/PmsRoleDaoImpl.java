package wusc.edu.service.role.dao.impl;

import org.springframework.stereotype.Repository;

import wusc.edu.common.core.dao.BaseDaoImpl;
import wusc.edu.facade.role.entity.PmsRole;
import wusc.edu.service.role.dao.PmsRoleDao;


/**
 * 
 * @描述: 用户表数据访问层接口实现类.
 * @作者: WuShuicheng .
 * @创建时间: 2013-7-22,下午5:51:47 .
 * @版本: 1.0 .
 */
@Repository("pmsRoleDao")
public class PmsRoleDaoImpl extends BaseDaoImpl<PmsRole> implements PmsRoleDao {

	/**
	 * 根据用户登录名获取用户信息.
	 * 
	 * @param loginName
	 *            .
	 * @return user .
	 */

	public PmsRole findByUserNo(String userNo) {
		return super.getSqlSession().selectOne(getStatement("findByUserNo"), userNo);
	}

}
