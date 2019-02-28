package com.cegz.sys.dao.adver;

import com.cegz.sys.model.adver.SubscribeDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * 广告预约申请
 *
 * @author maqianqian
 * @date 2019年02月15日
 */
public interface SubsecibeDesignRepository extends JpaRepository<SubscribeDesign,Long> {


    /**
     * 通类型和状态获取广告预约总记录数
     * @param type
     * @param status
     * @param name
     * @param phone
     * @param startTime
     * @param endTime
     * @return
     */
    @Query(value = "select count(sd.id) from subscribe_design sd where type = ?1 and status = ?2 ", nativeQuery = true)
    Long countSubscribeDesignByStatus(Byte type, Byte status, String name, String phone,
                                      String startTime, String endTime);

    /**
     * 获取广告预约申请列表数据
     * @param type
     * @param status
     * @param startPage
     * @param pageSize
     * @param name
     * @param phone
     * @param startTime
     * @param endTime
     * @return
     */
    @Query(value = "select sd.* from subscribe_design sd left join users u " +
            "on sd.create_user_id = u.create_user_id and sd.update_user_id = u.update_user_id " +
            "where type = ?1 and status = ?2 " +
            "order by sd.create_time desc limit ?3, ?4 ", nativeQuery = true)
    List<SubscribeDesign> listSubscribeDesignByStatus(Byte type, Byte status, int startPage, Integer pageSize,String name, String phone,
                                                      String startTime, String endTime);
}
