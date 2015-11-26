package com.handpay.ibenefit.category.service;

import com.handpay.ibenefit.category.entity.ProductRecommendRelevant;
import com.handpay.ibenefit.framework.service.Manager;

public interface IProductRecommendRelevantManager extends Manager<ProductRecommendRelevant> {

	/**
	  * update(这里用一句话描述这个方法的作用)
	  *
	  * @Title: update
	  * @Description: TODO
	  * @param @param string
	  * @param @param string2    设定文件
	  * @return void    返回类型
	  * @throws
	  */
	void updatePriorityByObjectId(String id, String priority);

}
