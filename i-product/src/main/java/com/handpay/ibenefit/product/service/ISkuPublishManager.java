package com.handpay.ibenefit.product.service;

import java.util.List;
import java.util.Map;

import com.handpay.ibenefit.framework.service.Manager;
import com.handpay.ibenefit.framework.util.PageSearch;
import com.handpay.ibenefit.product.entity.SkuPublish;

public interface ISkuPublishManager extends  Manager<SkuPublish>{

    void modifySkuPublish(Map<String,Object> map);

    List<SkuPublish> getAllPublish();

    PageSearch findSkuByGroup(PageSearch page);

    PageSearch findSkuDirect(PageSearch page);

    Long getStock(Map<String, Object> param);

    PageSearch findWelfarePackageSku(PageSearch page);

    SkuPublish getSkuPublishPrice(Long companyId, Long skuId);

    /**
     * 根据套餐ID 查询 对应的商品
     * @author zhliu
     * @date 2015年6月2日
     * @parm
     * @param map
     * @return
     */
    List<SkuPublish> findWelfarePackageSkuForPackageId(Map map);

    /**
     * 根据商品ID 查询 商品信息
     * @author zhliu
     * @date 2015年6月2日
     * @parm
     * @param map
     * @return
     */
    List<SkuPublish> findWelfarePackageSkuForPordIds(Map map);

    /**
     *
     * @author zhliu
     * @date 2015年6月3日
     * @parm
     * @param map
     * @return
     */
    List<Map> findSupplierProdIds(Map map);

    /**
     * 根据子订单号查询 订单中相关商品信息
     * @author zhliu
     * @date 2015年6月4日
     * @parm
     * @param map
     * @return
     */
    List<SkuPublish>  selectSkuPublishForSubOrderNo(Map map);
    /**
     * 通过推荐位置编码，或者其他参数得到skuPublish
     * @param map
     * @return
     */
    PageSearch getRecommendProductSkuByParam(PageSearch page);
    List<SkuPublish> getByParam(Map<String,Object> param);
    /**
     * 通过条件查询所有的商品
     * @param page
     * @return
     */
    PageSearch getPublishProductSkuByParam(PageSearch page);
    /**
     * 通过条件查询所有的商品(卡卷商品)
     * @param page
     * @return
     */
    PageSearch getPublishProductSkuByParamWeixin(PageSearch page);
    /**
     *
     * @Title: queryDetailPic
     * @Description: 查询出产品的明细图并放入SkuPublist
     * @param  skups
     * @return List<SkuPublish>
     * @throws
     * @author 陈传洞
     */
    public List<SkuPublish> putDetailPic(List<SkuPublish> skups);


    /**
     *
     * @Title: getSkuPublishByObjectId
     * @Description: 根据 主键Id 查询包含产品信息的 SkuPublish
     * @param  objectId 主键Id
     * @return SkuPublish
     * @throws
     * @author 陈传洞
     */
    public SkuPublish getSkuPublishByObjectId(Long objectId);

    /**
     * 查询供应商内卖商品
     * @param supplierId
     * @return
     */
	public List<SkuPublish> findSkuInner(Map<String,Object> map);

	boolean isHavePermission(Long companyId,Long skuId);
}
