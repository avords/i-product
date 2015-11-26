package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.product.entity.AttributeValue;

public interface IAttributeValueManager extends  Manager<AttributeValue>{

    List<AttributeValue> getByAttributeId(Long attributeId);

    void save(Map<String, Object> param);

}
