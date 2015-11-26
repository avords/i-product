package com.handpay.ibenefit.product.service;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.SkuPriceHistory;

public interface ISkuPriceHistoryManager extends Manager<SkuPriceHistory>{

    PageSearch findSkuPriceHistory(PageSearch pageSearch);
}
