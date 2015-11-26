package com.handpay.ibenefit.category.service;

import com.handpay.ibenefit.category.entity.ProductRecommend;
import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;

public interface IProductRecommendManager extends Manager<ProductRecommend> {

	/**
	  * updateSortNoByObjectId(这里用一句话描述这个方法的作用)
	  *
	  * @Title: updateSortNoByObjectId
	  * @Description: TODO
	  * @param @param string
	  * @param @param string2    设定文件
	  * @return void    返回类型
	  * @throws
	  */
	void updateSortNoByObjectId(String objectId, String sortNo);

	/**
	  * findList(这里用一句话描述这个方法的作用)
	  *
	  * @Title: findList
	  * @Description: TODO
	  * @param @param page
	  * @param @return    设定文件
	  * @return PageSearch    返回类型
	  * @throws
	  */
	PageSearch findList(PageSearch page);

	ProductRecommend getBasicInfoByPositionCode(String positionCode);

}
