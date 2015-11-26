package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.Cart;

public interface ICartManager extends  Manager<Cart>{

    /**
     * 通过参数跟新购物车数量
     * @param param 可以放count，objectId
     */
    void updateCountByParam(Map<String,Object> param);

    List<Cart> getByUserId(Long userId);

    Long queryCountByUserId(Long currentUserId,Long companyId);

    PageSearch getCarts(PageSearch page);
}
