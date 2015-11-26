package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.product.entity.ElectronicCard;

public interface IElectronicCardManager extends  Manager<ElectronicCard>{

    String importStock(byte[] fileData, Long skuId, Integer source);


	
	List<ElectronicCard> getCardByCount(Long productCount,Long productId);


	/**
	 * 子订单关联卡密信息
	 * @author zhliu
	 * @date 2015年8月5日
	 * @parm
	 * @param map
	 * @return
	 */
	List<ElectronicCard> selectSubOrderCardInfo(Map<String, Object> map);
	
}
