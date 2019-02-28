package com.cegz.sys.service.adver.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cegz.sys.dao.adver.AuthorityRepository;
import com.cegz.sys.dao.adver.MenuRepository;
import com.cegz.sys.dao.adver.RoleMenuRepository;
import com.cegz.sys.dao.adver.RoleRepository;
import com.cegz.sys.dao.adver.UsersRoleRepository;
import com.cegz.sys.model.adver.Authority;
import com.cegz.sys.model.adver.Menu;
import com.cegz.sys.model.adver.Role;
import com.cegz.sys.model.adver.RoleMenu;
import com.cegz.sys.model.adver.UsersRole;
import com.cegz.sys.service.adver.AuthorityService;

/**
 * 黑名单服务
 * 
 * @author tenglong
 * @date 2018年8月21日
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;

	@Autowired
	private UsersRoleRepository usersRoleRepository;

	@Autowired
	private RoleMenuRepository roleMenuRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private MenuRepository menuRepository;

	@Override
	public int save(Authority authority) {
		authorityRepository.save(authority);
		return 1;
	}

	@Override
	public Long getAuthorityCount(String name) {
		return authorityRepository.getAuthorityCount(name);
	}

	@Override
	public Long getAuthorityCount(Integer grade, String name) {
		return authorityRepository.getAuthorityCount(grade, name);
	}

	@Override
	public List<Authority> getAuthorityList(Integer curPage, Integer pageSize, String name) {
		return authorityRepository.getAuthorityList(curPage, pageSize, name);
	}

	@Override
	public List<Authority> getAuthorityList(Integer curPage, Integer pageSize, Integer grade, String name) {
		return authorityRepository.getAuthorityList(curPage, pageSize, grade, name);
	}

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return authorityRepository.findById(id);
	}

	@Override
	public List<Authority> getAuthorityListByCreateId(Long createUserId) {
		return authorityRepository.getAuthorityListByCreateId(createUserId);
	}

	@Override
	public List<UsersRole> getUsersRoleListByUserId(Long userId) {
		return usersRoleRepository.getUsersRoleListByUserId(userId);
	}

	@Override
	public List<RoleMenu> getRoleMenuListByRoleId(Long roleId) {
		return roleMenuRepository.getRoleMenuListByRoleId(roleId);
	}

	@Override
	public List<RoleMenu> getRoleOneMenuListByRoleId(Long roleId) {
		return roleMenuRepository.getRoleOneMenuListByRoleId(roleId);
	}

	@Override
	public List<RoleMenu> getTwoMenuListByRoleIdAndPId(Long roleId, Long pid) {
		return roleMenuRepository.getTwoMenuListByRoleIdAndPId(roleId, pid);
	}

	@Override
	public List<Role> getRoleList() {
		return roleRepository.getRoleList();
	}

	@Override
	public int getRoleCount() {
		return roleRepository.getRoleCount();
	}

	@Override
	public int deleteRolesByUserId(Long userId, Long updateUserId) {
		return usersRoleRepository.deleteRolesByUserId(userId, updateUserId);
	}

	@Override
	public int insertUsersRole(Long userId, Long roleId, Long createUserId) {
		return usersRoleRepository.insertUsersRole(userId, roleId, createUserId);
	}

	@Override
	public List<Menu> getMenuList() {
		return menuRepository.getMenuList();
	}

	@Override
	public int deleteMenusByRoleId(Long roleId, Long updateUserId) {
		return roleMenuRepository.deleteMenusByRoleId(roleId, updateUserId);
	}

	@Override
	public int insertRoleMenu(Long roleId, Long menuId, Long createUserId) {
		return roleMenuRepository.insertRoleMenu(roleId, menuId, createUserId);
	}

}
