package com.handpay.ibenefit.product.service;

import java.util.List;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.ProductCompanyExclusive;

public interface IProductCompanyExclusiveManager extends Manager<ProductCompanyExclusive> {
	
	// 获取企业专属商品信息
	public PageSearch getExclusiveProductInfo(PageSearch page);
	
	/**
	 * 根据企业查询所有专属的商品ID
	 * @param companyId
	 * @return
	 */
	public List<Long> getProductIdsByCompanyId(long companyId);
	
	/**
	 * 查询所有专属商品
	 * @return
	 */
	public List<Long> getAllExclusiveProduct();
	
	/**
	 * 根据产品查找专属的企业ID
	 * @param productId
	 * @return
	 */
	public List<Long> getExclusiveCompanyId(Long productId);

}
