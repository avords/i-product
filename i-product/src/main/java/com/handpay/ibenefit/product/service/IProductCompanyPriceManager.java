package com.handpay.ibenefit.product.service;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.ProductCompanyPrice;

public interface IProductCompanyPriceManager extends Manager<ProductCompanyPrice> {
	
	// 获取面向企业商品价格信息
	public PageSearch getCompanyPriceInfo(PageSearch page);

}
