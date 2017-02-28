/**
 * 
 */
package wusc.edu.facade.role.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wusc.edu.common.page.PageBean;
import wusc.edu.common.page.PageParam;
import wusc.edu.facade.role.entity.PmsRole;
import wusc.edu.facade.role.service.PmsRoleFacade;
import wusc.edu.service.role.biz.PmsRoleBiz;

/**
 * @描述: 用户Dubbo服务接口实现 .
 * @作者: WuShuicheng .
 * @创建时间: 2015-1-26,上午1:43:41 .
 * @版本号: V1.0 .
 */
@Service("pmsRoleFacade")
public class PmsRoleFacadeImpl implements PmsRoleFacade {
	@Autowired
	private PmsRoleBiz pmsUserBiz;
	
	/**
	 * 保存用户信息.
	 * @param pmsUser
	 */
	public void create(PmsRole pmsUser) {
		pmsUserBiz.create(pmsUser);
	}
	
	/**
	 * 根据ID获取用户信息.
	 * @param userId
	 * @return
	 */
	public PmsRole getById(Long userId) {
		return pmsUserBiz.getById(userId);
	}

	/**
	 * 根据登录名取得用户对象
	 */
	public PmsRole findUserByUserNo(String userNo) {
		return pmsUserBiz.findUserByUserNo(userNo);
	}

	/**
	 * 根据ID删除一个用户，同时删除与该用户关联的角色关联信息. type="1"的超级管理员不能删除.
	 * 
	 * @param id
	 *            用户ID.
	 */
	public void deleteUserById(long userId) {
		pmsUserBiz.deleteUserById(userId);
	}

	
	/**
	 * 更新用户信息.
	 * @param user
	 */
	public void update(PmsRole user) {
		pmsUserBiz.update(user);
	}
	
	/**
	 * 查询并分页列出用户信息.
	 * @param pageParam
	 * @param paramMap
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return pmsUserBiz.listPage(pageParam, paramMap);
	}
}
