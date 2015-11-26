package com.handpay.ibenefit.product.service;

import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.product.entity.SkuCheck;

public interface ISkuCheckManager extends Manager<SkuCheck>{

    SkuCheck getLatelyCheckRecord(Map<String,Object> map);
}
