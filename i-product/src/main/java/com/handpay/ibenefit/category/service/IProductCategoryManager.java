package com.handpay.ibenefit.category.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.category.entity.ProductCategory;
import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;

public interface IProductCategoryManager extends Manager<ProductCategory> {

	/**
	 * 统计二级分类数量
	 * @return int
	 */
	public int updateSecondCategoryCount();

	/**
     * 统计三级级分类数量
     * @return int
     */
	public int updateThirdCategoryCount();

	/**
	 * 根据一级分类得到二级分类
	 * @param	一级分类Map firstId
	 * @return	二级分类List
	 */
	public List<ProductCategory> getSecondCategoryByParam(Map<String, Object> param);

	/**
	 * 根据二级分类得到三级分类
	 * @param	二级分类Map secondId
	 * @return	三级分类List
	 */
	public List<ProductCategory> getThirdCategoryByParam(Map<String, Object> param);

	/**
	 * 根据一级分类ID得到一级分类
	 * @param firstId
	 * @return
	 */
	public ProductCategory getProductCategoryByFirstId(String firstId);

	/**
	 * 根据二级分类ID得到二级分类
	 * @param	二级分类ID
	 * @return	二级分类
	 */
	public ProductCategory getProductCategoryBySecondId(String secondId);

	/**
	 * 根据三级分类ID得到三级分类
	 * @param	三级分类ID
	 * @return	三级分类
	 */
	public ProductCategory getProductCategoryByThirdId(String thirdId);

	/**
	 * 得到所有的三级分类，带分页，填充firstName和secondName
	 * @param pageSearch
	 * @return
	 */
	public PageSearch findAllThirdCategory(PageSearch pageSearch);

	/**
	 * 得到所有有效的一级分类
	 * @return List
	 */
	public List<ProductCategory> getAllFirstCategory();

	/**
	 * 根据三级分类ID得到三级分类
	 * @param	三级分类ID
	 * @return	三级分类
	 */
	public ProductCategory getThirdCategoryByThirdId(String thirdId);

	/**
	 * 根据福利商城三级分类ID得到商品运营三级分类
	 * @param	福利商城三级分类ID
	 * @return	商品运营三级分类List
	 */
	public List<ProductCategory> getProductCategoriesByMallCategoryId(Long mallCategoryId);

	/**
	 * 更新分类状态
	 * @param objectId
	 * @param status
	 */
	public void updateStatus(Long objectId, int status);

	/**
	 * 批量更新分类的排列顺序
	 * @param objectIds
	 * @param sortNos
	 */
	void updateSortNoByObjectId(String objectIds, String sortNos);

	/**
	 * 判断一个分类是否能被删除
	 * 1.该分类下面有商品（无论商品是什么状态）都不能删除
	 * 2.二级分类下面有三级分类（无论状态是什么）不能删除该二级分类
	 * 3.一级分类下面有二级分类（无论状态是什么）不能删除该一级分类
	 * @param objectId
	 * @return
	 */
	boolean canDelete(Long objectId);

	/**
	 * 判断一个分类是否置为无效
	 * 1.二级分类下面有有效分类一级分类不能为无效
	 * 2.三级分类下面全部为无效则二级可为无效
	 * 3.关联的福利商城分类有效则三级分类不能无效
	 * 4.该分类下面有商品（无论商品是什么状态）都不能置为无效
	 * @param objectId
	 * @return
	 */
	boolean canInvalid(Long objectId);

	ProductCategory getThirdCategoryByObjectId(Long objectId);
	/**
	 * 通过三级分级objectids得到包含一级二级分类名字 的三级分类，例如 一级名称>>二级名称>>三级名称，且通过了拼音排序
	 * @param categoryIds
	 * @return List<ProductCategory>
	 */
	List<ProductCategory> getThirdCategory(List<Long> categoryIds);
}
