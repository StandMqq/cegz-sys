package com.cegz.sys.service.adver;

import java.util.List;
import java.util.Optional;

import com.cegz.sys.model.adver.Authority;
import com.cegz.sys.model.adver.Menu;
import com.cegz.sys.model.adver.Role;
import com.cegz.sys.model.adver.RoleMenu;
import com.cegz.sys.model.adver.UsersRole;

/**
 * 黑名单服务
 * 
 * @author tenglong
 * @date 2018年8月21日
 */
public interface AuthorityService {

	/**
	 * 通过主键查询黑名单
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年8月23日
	 */
	Optional<Authority> getAuthorityById(Long id);

	/**
	 * 保存黑名单
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年8月21日
	 */
	int save(Authority authority);

	/**
	 * 获取黑名单记录数（不带黑名单等级参数）
	 * 
	 * @return
	 */
	Long getAuthorityCount(String name);

	/**
	 * 获取黑名单记录数（带黑名单等级参数）
	 * 
	 * @return
	 */
	Long getAuthorityCount(Integer grade, String name);

	/**
	 * 获取黑名单列表（不带黑名单等级参数）
	 * 
	 * @param curPage
	 * @param pageSize
	 * @return
	 */
	List<Authority> getAuthorityList(Integer curPage, Integer pageSize, String name);

	/**
	 * 获取黑名单列表（带黑名单等级参数）
	 * 
	 * @param curPage
	 * @param pageSize
	 * @return
	 */
	List<Authority> getAuthorityList(Integer curPage, Integer pageSize, Integer grade, String name);

	/**
	 * 通过用户id（被操作人id）获取黑名单列表
	 * 
	 * @return
	 */
	List<Authority> getAuthorityListByCreateId(Long createUserId);

	/**
	 * 通过用户id获取List<UsersRole>
	 * 
	 * @return
	 */
	List<UsersRole> getUsersRoleListByUserId(Long userId);

	/**
	 * 通过角色id获取List<RoleMenu>
	 * 
	 * @return
	 */
	List<RoleMenu> getRoleMenuListByRoleId(Long roleId);

	/**
	 * 通过角色id获取一级List<RoleMenu>
	 * 
	 * @return
	 */
	List<RoleMenu> getRoleOneMenuListByRoleId(Long roleId);

	/**
	 * 通过角色id和菜单父级id获取List<RoleMenu>
	 * 
	 * @return
	 */
	List<RoleMenu> getTwoMenuListByRoleIdAndPId(Long roleId, Long pid);

	/**
	 * 获取所有的角色总数
	 * 
	 * @return
	 */
	int getRoleCount();

	/**
	 * 获取所有的角色List<Role>
	 * 
	 * @return
	 */
	List<Role> getRoleList();

	/**
	 * 通过用户id删除对应角色
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年10月31日
	 */
	int deleteRolesByUserId(Long userId, Long updateUserId);

	/**
	 * 通过用户id删除对应角色
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年10月31日
	 */
	int insertUsersRole(Long userId, Long roleId, Long createUserId);

	/**
	 * 获取所有的菜单List<Role>
	 * 
	 * @return
	 */
	List<Menu> getMenuList();

	/**
	 * 通过用户id删除对应角色
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年10月31日
	 */
	int deleteMenusByRoleId(Long roleId, Long updateUserId);

	/**
	 * 通过用户id删除对应角色
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年10月31日
	 */
	int insertRoleMenu(Long roleId, Long menuId, Long createUserId);

}
