package com.cegz.sys.model.adver;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 广告方实体类
 * 
 * @author lijiaxin
 * @date 2018年7月19日
 */
@Entity
@Table(name = "advertiser")
@Getter
@Setter
public class Advertiser implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * 手机号
	 */
	@Column(name = "phone", length = 20)
	private String phone;

	/**
	 * 姓名
	 */
	@Column(name = "name", length = 200)
	private String name;

	/**
	 * 营业执照图片地址
	 */
	@Column(name = "picture_url", length = 255)
	private String pictureUrl;

	/**
	 * 省份
	 */
	@Column(name = "city", length = 20)
	private String city;

	/**
	 * 公司名称
	 */
	@Column(name = "company", length = 100)
	private String company;

	/**
	 * 营业执照编号
	 */
	@Column(name = "business_license", length = 100)
	private String businessLicense;

	/**
	 * 住址
	 */
	@Column(name = "address", length = 100)
	private String address;

	/**
	 * email 邮箱
	 */
	@Column(name = "email", length = 100)
	private String email;

	/**
	 * 详细住址
	 */
	@Column(name = "address_detail", length = 100)
	private String addressDetail;

	/**
	 * 审核状态
	 */
	@Column(name = "status", length = 10)
	private byte status;

	/**
	 * 审核结论
	 */
	@Column(name = "reason", length = 255)
	private String reason;

	/**
	 * 数据是否有效 0 有效，1无效
	 */
	@Column(name = "is_deleted", length = 10)
	private byte isDeleted;

	/**
	 * 创建用户id
	 */
	@OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "create_user_id")
	private Users createUserId;

	/**
	 * 修改用户ID
	 */
	@OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "update_user_id")
	private Users updateUserId;

	/**
	 * 修改时间
	 */
	@Column(name = "update_time", length = 50)
	private Date updateTime;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time", length = 50)
	private Date createTime;
	
	/**
	 * 区域
	 */
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "region_id")
	private Region regionId;


}
