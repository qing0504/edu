package wusc.edu.service.role.biz;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wusc.edu.common.page.PageBean;
import wusc.edu.common.page.PageParam;
import wusc.edu.facade.role.entity.PmsRole;
import wusc.edu.service.role.dao.PmsRoleDao;


/**
 * 
 * @描述: 用户表--服务层接口 .
 * @作者: WuShuicheng .
 * @创建时间: 2013-7-25,下午10:41:04 .
 * @版本: 1.0 .
 */
@Service("pmsRoleBiz")
public class PmsRoleBiz {

	@Autowired
	private PmsRoleDao pmsUserDao;
	
	/**
	 * 保存用户信息.
	 * @param pmsUser
	 */
	public void create(PmsRole pmsUser) {
		pmsUserDao.insert(pmsUser);
	}
	
	/**
	 * 根据ID获取用户信息.
	 * @param userId
	 * @return
	 */
	public PmsRole getById(Long userId) {
		return pmsUserDao.getById(userId);
	}

	/**
	 * 根据登录名取得用户对象
	 */
	public PmsRole findUserByUserNo(String userNo) {
		return pmsUserDao.findByUserNo(userNo);
	}

	/**
	 * 根据ID删除一个用户，同时删除与该用户关联的角色关联信息. type="1"的超级管理员不能删除.
	 * 
	 * @param id
	 *            用户ID.
	 */
	public void deleteUserById(long userId) {
		PmsRole pmsUser = pmsUserDao.getById(userId);
		if (pmsUser != null) {
			pmsUserDao.deleteById(pmsUser.getId());
		}
	}

	
	/**
	 * 更新用户信息.
	 * @param user
	 */
	public void update(PmsRole user) {
		pmsUserDao.update(user);
	}

	/**
	 * 查询并分页列出用户信息.
	 * @param pageParam
	 * @param paramMap
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return pmsUserDao.listPage(pageParam, paramMap);
	}


}