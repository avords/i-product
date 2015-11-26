package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.Product;

public interface IProductManager extends  Manager<Product>{

    List<Long> getWelfare(Map<String, Object> map);
    List<Integer> getProductType(Map<String, Object> map);
    List<String> getProductPicture(Map<String, Object> map);
    List<Integer> getProductTogetherShow(Map<String, Object> map);
    List<String> getSellArea(Map<String, Object> map);

    void saveWelfare(Map<String, Object> map);
    void deleteWelfare(Map<String, Object> m);
    void updateWelfare(Map<String, Object> map);
    void updateProductProperties(Map<String, Object> m);

    /**
     *
     * @Title: getProductsBySubOrderId
     * @Description: 根据子订单Id 获取产品List
     * @param @param subOrderId
     * @param @return
     * @return List<Product>
     * @throws
     * @author 陈传洞
     */
    public List<Product> getProductsBySubOrderId(Long subOrderId);

    Long queryCountByParam(Map<String,Object> map);

	boolean cansubitemInvalid(Long objectId);

    void saveProduct(Map<String, Object> productParam);
    /**
     *@Title  queryProductOnshelves
     *@Description: 查找上架中商品
     *@author terry.wang
     */
	PageSearch queryProductOnshelves(PageSearch page);

	boolean isSelectCountrywide(Long productId);
	/**
	 * 保存商品规格图片
	 * @param productId
	 * @param attributeValueId
	 * @param url
	 */
    void saveSpecPic(Long productId, Long attributeValueId, String url);
    /**
     * 删除商品规格图片
     * @param productId
     * @param attributeValueId
     */
    void deleteSpecPic(Long productId, Long attributeValueId);

    String getSpecPic(Long productId, Long attributeValueId);
    /**
     * 上传商品附件
     * @param productId
     * @param filePath
     * @param fileName
     */
    void uploadEnclosure(Long productId, String filePath, String fileName);
}
