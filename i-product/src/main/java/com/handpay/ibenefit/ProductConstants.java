package com.handpay.ibenefit;

public class ProductConstants {
    //商品是否发布
    public static final int PRODUCT_NO_PUBLISH = 0;       //未发布
    public static final int PRODUCT_YES_PUBLISH = 1;      //已发布
    //商品状态
    public static final int PRODUCT_STATUS_DRAFT = 1;     //草稿
    public static final int PRODUCT_STATUS_WAIT_CHECK = 2;//待审核
    public static final int PRODUCT_STATUS_CHECK_NOT = 3; //审核不通过
    public static final int PRODUCT_STATUS_WAIT_SALE= 4;  //待上架
    public static final int PRODUCT_STATUS_IN_SALE = 5;   //上架中
    public static final int PRODUCT_STATUS_NOT_SALE = 6;  //已下架

    //PM 角色Code
    public static final String PRODUCT_CHECK_ROLE_CODE = "SPSH";//商品审核角色代码

    //发布类型
    public static final int RELEASE_PLATFORM_AGENT = 1;   //平台代理发布
    public static final int RELEASE_VENDOR = 2;           //供应商自主发布

    //商品类型
    public static final int PRODUCT_TYPE_MATERIAL_OBJECT = 1;  //实物商品
    public static final int PRODUCT_TYPE_MATERIAL_CARD = 2;    //实体卡卷
    public static final int PRODUCT_TYPE_ELECTRONICS_CARD = 3; //电子卡卷
    public static final int PRODUCT_TYPE_PERSONAL_INSURE = 4; //个险
    public static final int PRODUCT_TYPE_GROUP_INSURE = 5; //团险

    /** 套餐与商品关联表 商品类型  */
    public static final String WP_RELATION_PRODUCT_TYPE_TJ = "1";//推荐商品
    public static final String WP_RELATION_PRODUCT_TYPE_BX = "2";//备选商品





}
