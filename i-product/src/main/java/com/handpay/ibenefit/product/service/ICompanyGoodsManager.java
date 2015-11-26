package com.handpay.ibenefit.product.service;

import java.util.List;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.product.entity.CompanyGoods;
import com.handpay.ibenefit.welfare.entity.WelfarePackage;

public interface ICompanyGoodsManager extends Manager<CompanyGoods>{
	
	/**
	 * 更新企业权限数据
	 * 当企业屏蔽规则变更、企业志属商品设置变更、企业审核通过时调用
	 * 供应商审核通过、供应商状态置为有效和无效的条件在视图V_IBS_SKU_PUBLISH_ATTR中已经实现
	 * 内卖>专属 >屏蔽
	 * 按如下规则、顺序进行处理
	 * 1.先屏蔽后专属，专属优先
	 * 2.套餐中的商品不管是否已经屏蔽
	 * 3.商品可销售范围不在屏蔽规则中
	 * 4.仅供内卖商品加入屏蔽
	 * @param companyId
	 */
	public void updateByCompanyId(Long companyId);
	
	/**
	 * 更新商品对应的权限数据
	 * 当商品上架、下架时、专属商品设置修改时
	 * 按如下规则进行处理：
	 * 1.是否仅供内卖商品
	 * 2.查找所属供应商被屏蔽的企业
	 * 3.查找所属品牌被屏蔽的企业
	 * 4.查找所属分类被屏蔽的企业
	 * 5.对非专属企业进行屏蔽
	 * @param product
	 */
	public void updateByProductId(Long productId);
	
	/**
	 * 套餐上架
	 * 按屏蔽规则进行排除
	 * @param welfarePackage
	 */
	public void upPackage(WelfarePackage welfarePackage);
	
	/**
	 * 套餐下架
	 * @param packageId
	 */
	public void downPackage(Long packageId);
	
	/**
	 * 供应商信息更新
	 * @param supplierId
	 */
	public void updateBySupplierId(Long supplierId);
	
	/**
	 * 更新所有企业的权限
	 * 按企业逐个进行
	 */
	public void updateAll();
	
	/**
	 * 更新企业权限商品的"面向企业价格"
	 * 没有处理删除的情况，如果增加删除操作，则实现需要修改
	 * 根据ID排倒序，取最新的价格
	 * @param companyIds
	 */
	public void updateCompanySkuPrice(List<Long> companyIds);
	
	/**
	 * 更新企业权限套餐的"面向企业价格"
	 * 根据ID排倒序，取最新的价格
	 * @param companyIds
	 */
	public void updateCompanyPackagePrice(List<Long> companyIds);
	/**
	  * getSkuPriceByCompanyIdAndSkuId(通过商品的Id和companyId得到商品的销售价格)
	  * @Title: getSkuPriceByCompanyIdAndSkuId
	  * @param @param companyId
	  * @param @param skuId
	  * @param @return    设定文件
	  * @return CompanyGoods    返回类型
	  * @throws
	  */
	public CompanyGoods getSkuPriceByCompanyIdAndSkuId(Long companyId, Long skuId);

}
