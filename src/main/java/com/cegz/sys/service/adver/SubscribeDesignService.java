package com.cegz.sys.service.adver;


import com.cegz.sys.model.adver.SubscribeDesign;

import java.util.List;

/**
 * 广告预约申请服务
 *
 * @author maqianqian
 * @date 2019年02月15日
 */
public interface SubscribeDesignService {

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
    List<SubscribeDesign> listSubscribeDesignByStatus(Byte type, Byte status, int startPage, Integer pageSize, String name, String phone,
                                                      String startTime, String endTime);

}
