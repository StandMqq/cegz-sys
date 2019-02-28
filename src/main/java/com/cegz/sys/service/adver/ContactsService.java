package com.cegz.sys.service.adver;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cegz.sys.model.adver.Contacts;
import com.cegz.sys.model.adver.DrivingRegistration;

/**
 * 联系人后台服务
 * 
 * @author tenglong
 * @date 2018年7月31日
 */
public interface ContactsService {
	/**
	 * 获取车主未审核列表
	 * 
	 * @return
	 * @author tenglong
	 * @date 2018年7月31日
	 */
	List<Contacts> listContactsExamine(int startPos, int size, int status, String name, String phone);

	/**
	 * 获取记录数
	 * 
	 * @param status
	 * @return
	 * @author Administrator
	 * @date 2018年8月7日
	 */
	int countContractsExamine(int status, String name, String phone);

	/**
	 * 通过ID获取联系人信息
	 * 
	 * @param id
	 * @return
	 * @author lijiaxin
	 * @date 2018年7月23日
	 */
	Optional<Contacts> getContactById(Long id);

	/**
	 * 添加联系人
	 * 
	 * @param contacts 联系人信息
	 * @return
	 * @author lijiaxin
	 * @date 2018年7月20日
	 */
	int insertData(Contacts contacts);

	/**
	 * 审核车主
	 * 
	 * @param id
	 * @param status
	 * @param reason
	 * @param updateTime
	 * @return
	 */
	int carOwnerStatusExamine(Long id, byte status, String reason, Date updateTime, String name, String phone);

	/**
	 * 审核车主的身份证信息
	 * 
	 * @param id
	 * @param status
	 * @param reason
	 * @param updateTime
	 * @return
	 */
	int idCardStatusExamine(Long id, byte status, String reason, Date updateTime);

	/**
	 * 审核车主的驾驶证信息
	 * 
	 * @param id
	 * @param status
	 * @param reason
	 * @param updateTime
	 * @return
	 */
	int drivingLicenseStatusExamine(Long id, byte status, String reason, Date updateTime);

	/**
	 * 通过ID获取联系人信息
	 * 
	 * @param id
	 * @return
	 * @author lijiaxin
	 * @date 2018年7月23日
	 */
	Contacts getContactsByUsersId(Long usersId);

	/**
	 * 获取行驶证信息
	 * 
	 * @param id
	 * @return
	 * @author Administrator
	 * @date 2018年8月2日
	 */
	Optional<DrivingRegistration> getRegistrationById(Long id);

	/**
	 * 添加行驶证
	 * 
	 * @param cdr
	 * @return
	 * @author lijiaxin
	 * @date 2018年7月23日
	 */
	int insertContractDriveRegist(DrivingRegistration cdr);

	/**
	 * 获取车主数据
	 * @param i
	 * @param j
	 * @param phoneInput
	 * @param nameInput
	 * @return
	 */
	List<Contacts> queryContactsList(int i, int j, String phoneInput, String nameInput);
}
