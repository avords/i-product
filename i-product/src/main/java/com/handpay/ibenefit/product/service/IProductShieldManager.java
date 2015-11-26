package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.ProductShield;

public interface IProductShieldManager extends Manager<ProductShield> {

	// 获取企业商品屏蔽信息(sku)
	public List<Map<String, Object>> getShieldDetailInfo();

    public PageSearch getShieldInfo(PageSearch page);

    public List<Long> getAllCompanyId();
}
