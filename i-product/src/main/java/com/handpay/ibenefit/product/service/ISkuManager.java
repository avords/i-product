package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.AttributeValue;
import com.handpay.ibenefit.product.entity.Sku;
import com.handpay.ibenefit.product.entity.SkuCheck;
import com.handpay.ibenefit.product.entity.SkuHomeView;

public interface ISkuManager extends Manager<Sku> {

	PageSearch findSkuByGroup(PageSearch page);

	PageSearch findSkuDirect(PageSearch page);

	void upProducts(List<Long> skuIds);

	void executeDownProducts(List<Long> skuIds);

	/**
	 * getSkusByProductId(根据ProductId获取SKU)
	 *
	 * @Title: getSkusByProductId
	 * @Description: TODO
	 * @param @param productId
	 * @param @return 设定文件
	 * @return List<Sku> 返回类型
	 * @throws
	 */
	List<Sku> getSkusByProductId(Long productId);

	List<Sku> querySkuList(Map<String, Object> map);

    List<AttributeValue> getAllAttribute1(Long productId);

    List<AttributeValue> getAllAttribute2(Long productId);

	/**
	 * @param priceZone
	 * @param areaId
	 * @param i
	  * getRecommendProductSku(获取首页推荐商品)
	  *
	  * @Title: getRecommendProductSku
	  * @Description: TODO
	  * @param @return    设定文件
	  * @return List<SkuHomeView>    返回类型
	  * @throws
	  */
	List<SkuHomeView> getRecommendProductSku(Integer count, String areaId, String priceZone);

	PageSearch getRecommendProductSkuPagination(PageSearch page);

	/**
	  * getSkuDetail(获取SKU详情)
	  *
	  * @Title: getSkuDetail
	  * @Description: TODO
	  * @param @param skuId
	  * @param @return    设定文件
	  * @return Sku    返回类型
	  * @throws
	  */
	Sku getSkuDetail(Long skuId);

    boolean searchSkuStatus(Map<String, Object> par);

    Long getStock(Map<String, Object> param);

    void executeCheck(Long skuId, Integer checkStatus, SkuCheck sc);

    void updateSku(Map<String, Object> map);

    void exeAutoUpShelves();

    void exeAutoDownShelves();
}
