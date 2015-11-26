package com.handpay.ibenefit.product.service;

import java.util.List;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.product.entity.Attribute;

public interface IAttributeManager extends  Manager<Attribute>{

    List<Attribute> getByCategoryId(Long categoryId);

    void savePM(String[] categoryIds, Long userId);

    List<Long> getOtherAttributeValueIdsByAttributeId(Long attributeId);
}
