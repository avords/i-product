package com.handpay.ibenefit.product.service;

import java.util.List;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.Brand;

public interface IBrandManager extends  Manager<Brand>{

    List<Brand> getBrandsByCount(Long count);

    List<Brand> getPublishBrands(PageSearch pageSearch);

    List<Brand> getRecommendBrands(PageSearch pageSearch);
}
