package com.cegz.sys.service.adver.impl;

import com.cegz.sys.dao.adver.SubsecibeDesignRepository;
import com.cegz.sys.model.adver.SubscribeDesign;
import com.cegz.sys.service.adver.SubscribeDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 广告申请预约服务
 *
 * @author maqianqian
 * @date 2019年02月15日
 */
@Service("subscribeDesignService")
public class SubscribeDesignServiceImpl implements SubscribeDesignService {

    @Autowired
    private SubsecibeDesignRepository subsecibeDesignRepository;

    @Override
    public Long countSubscribeDesignByStatus(Byte type, Byte status, String name, String phone, String startTime, String endTime) {
        return subsecibeDesignRepository.countSubscribeDesignByStatus(type,status, name, phone,
                startTime, endTime);
    }

    @Override
    public List<SubscribeDesign> listSubscribeDesignByStatus(Byte type, Byte status, int startPage, Integer pageSize, String name, String phone, String startTime, String endTime) {
        return subsecibeDesignRepository.listSubscribeDesignByStatus(type, status, startPage, pageSize, name, phone, startTime, endTime);
    }
}
