package com.cegz.sys.dao.adver;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cegz.sys.model.adver.Authority;

/**
 * 黑名单持久类
 * 
 * @author tenglong
 * @date 2018年8月20日
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	/**
	 * 获取黑名单记录数（不带黑名单等级参数）
	 */
	@Query(value = "select count(id) from authority a where 1=1 and a.is_deleted = 0 and a.name like %?1%", nativeQuery = true)
	Long getAuthorityCount(String name);

	/**
	 * 获取黑名单记录数（带黑名单等级参数）
	 */
	@Query(value = "select count(id) from authority a where 1=1 and a.is_deleted = 0 and a.grade = ?1 and a.name like %?2%", nativeQuery = true)
	Long getAuthorityCount(Integer grade, String name);

	/**
	 * 获取黑名单列表（不带黑名单等级参数）
	 */
	@Query(value = "select * from authority a where 1=1 and a.is_deleted = 0 and a.name like %?3% order by a.create_time desc limit ?1, ?2", nativeQuery = true)
	List<Authority> getAuthorityList(Integer curPage, Integer pageSize, String name);

	/**
	 * 获取黑名单列表（带黑名单等级参数）
	 */
	@Query(value = "select * from authority a where 1=1 and a.is_deleted = 0 and a.grade = ?3 and a.name like %?4% order by a.create_time desc limit ?1, ?2", nativeQuery = true)
	List<Authority> getAuthorityList(Integer curPage, Integer pageSize, Integer grade, String name);

	/**
	 * 获取黑名单列表（带黑名单等级参数）
	 */
	@Query(value = "select * from authority a where 1=1 and a.is_deleted = 0 and a.create_user_id = ?1", nativeQuery = true)
	List<Authority> getAuthorityListByCreateId(Long createId);
}
