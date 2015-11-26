package com.handpay.ibenefit.category.service;

import com.handpay.ibenefit.category.entity.ProductCategoryMapping;
import com.handpay.ibenefit.framework.service.Manager;

public interface IProductCategoryMappingManager extends Manager<ProductCategoryMapping> {

    /**
     * 保存商城和商品分类的关系
     * @author 闫冬全
     * @param mallCategoryId 商城三级分类
     * @param cetegoryIds 商品运营分类的id，多个id用逗号隔开
     */
    void save(Long mallCategoryId,String cetegoryIds);
}
