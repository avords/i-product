package com.handpay.ibenefit.product.service;

import java.util.List;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.ProductPublish;

public interface IProductPublishManager extends  Manager<ProductPublish>{

    PageSearch findNoInSellingPublishProduct(PageSearch page);

    PageSearch getWelfarePlanProduct(PageSearch page);

    PageSearch getPublishProduct(PageSearch page);

    void uploadEnclosure(Long productId, String filePath, String fileName);
    
    /**
	  * getUserInsureProduct(获取用户对应年份的投保商品)
	  *
	  * @Title: getUserInsureProduct
	  * @Description: TODO
	  * @param @param userId
	  * @param @param currentYear
	  * @param @return    设定文件
	  * @return List<SkuPublish>    返回类型
	  * @throws
	 */
	List<ProductPublish> getUserInsureProduct(Long userId, Integer currentYear);
}
