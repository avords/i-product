package com.handpay.ibenefit.category.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.category.entity.ProductMallCategory;
import com.handpay.ibenefit.framework.service.Manager;

public interface IProductMallCategoryManager extends Manager<ProductMallCategory> {

	/**
	 * 统计二级分类数量
	 * @return
	 */
	public int updateSecondCategoryCount();

	/**
	 * 统计三级分类数量
	 * @return
	 */
	public int updateThirdCategoryCount();

	/**
	 * 根据三级分类ID得到三级分类
	 * @param	三级分类ID
	 * @return	三级分类List
	 */
	List<ProductMallCategory> getAllThirdCategoryByProductThirdId(Map<String,Object> map);


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
	 * 根据一级分类ID得到一级分类
	 * @param firstId
	 * @return
	 */
	public ProductMallCategory getProductMallCategoryByFirstId(String firstId);

	/**
	 * 根据二级分类ID得到二级分类
	 * @param	二级分类ID
	 * @return	二级分类
	 */
	public ProductMallCategory getProductMallCategoryBySecondId(String secondId);

	/**
	 * 根据三级分类ID得到三级分类
	 * @param	三级分类ID
	 * @return	三级分类
	 */
	public ProductMallCategory getProductMallCategoryByThirdId(String thirdId);


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
	 * @param objectId
	 * @return
	 */
	boolean canInvalid(Long objectId);

	/**
     * 得到所有有效的一级分类
     * @return List
     */
    public List<ProductMallCategory> getAllFirstCategory(Integer paltform,int count);

	/**
     * 根据一级分类得到二级分类
     * @param   一级分类Map firstId,platform
     * @return  二级分类List
     */
    public List<ProductMallCategory> getSecondCategoryByParam(Map<String, Object> param);

    /**
     * 根据二级分类得到三级分类
     * @param   二级分类Map secondId,platform,count
     * @return  三级分类List
     */
    public List<ProductMallCategory> getThirdCategoryByParam(Map<String, Object> param);
    
    /**
     * 根据二级分类得到三级分类(微信)
     * @param   二级分类Map secondId,platform,count
     * @return  三级分类List
     */
    public List<ProductMallCategory> getThirdCategoryByParamWeixin(Map<String, Object> param);


}
