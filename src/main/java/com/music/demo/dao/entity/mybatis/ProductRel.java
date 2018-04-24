package com.music.demo.dao.entity.mybatis;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_product_rel")
public class ProductRel {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "c_product_id")
    private String productId;

    @Column(name = "c_product_name")
    private String productName;

    @Column(name = "c_product_parent_id")
    private String productParentId;

    @Column(name = "c_product_isfree")
    private String productIsfree;

    @Column(name = "c_product_ntroduction")
    private String productNtroduction;

    @Column(name = "c_product_owner_id")
    private String productOwnerId;

    @Column(name = "c_produc_type_id")
    private String producTypeId;

    @Column(name = "c_produc_creat_time")
    private Date producCreatTime;

    @Column(name = "c_produc_creater")
    private String producCreater;

    @Column(name = "c_product_top_pic_list_id")
    private String productTopPicListId;

    @Column(name = "c_product_middle_pic_list_id")
    private String productMiddlePicListId;

    @Column(name = "c_product_details_page")
    private String productDetailsPage;

    @Column(name = "c_product_num")
    private String productNum;

    @Column(name = "c_product_sale_price")
    private String productSalePrice;

    @Column(name = "c_product_price")
    private String productPrice;

    @Column(name = "c_text1")
    private String text1;

    @Column(name = "c_text2")
    private String text2;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return c_product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return c_product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return c_product_parent_id
     */
    public String getProductParentId() {
        return productParentId;
    }

    /**
     * @param productParentId
     */
    public void setProductParentId(String productParentId) {
        this.productParentId = productParentId;
    }

    /**
     * @return c_product_isfree
     */
    public String getProductIsfree() {
        return productIsfree;
    }

    /**
     * @param productIsfree
     */
    public void setProductIsfree(String productIsfree) {
        this.productIsfree = productIsfree;
    }

    /**
     * @return c_product_ntroduction
     */
    public String getProductNtroduction() {
        return productNtroduction;
    }

    /**
     * @param productNtroduction
     */
    public void setProductNtroduction(String productNtroduction) {
        this.productNtroduction = productNtroduction;
    }

    /**
     * @return c_product_owner_id
     */
    public String getProductOwnerId() {
        return productOwnerId;
    }

    /**
     * @param productOwnerId
     */
    public void setProductOwnerId(String productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    /**
     * @return c_produc_type_id
     */
    public String getProducTypeId() {
        return producTypeId;
    }

    /**
     * @param producTypeId
     */
    public void setProducTypeId(String producTypeId) {
        this.producTypeId = producTypeId;
    }

    /**
     * @return c_produc_creat_time
     */
    public Date getProducCreatTime() {
        return producCreatTime;
    }

    /**
     * @param producCreatTime
     */
    public void setProducCreatTime(Date producCreatTime) {
        this.producCreatTime = producCreatTime;
    }

    /**
     * @return c_produc_creater
     */
    public String getProducCreater() {
        return producCreater;
    }

    /**
     * @param producCreater
     */
    public void setProducCreater(String producCreater) {
        this.producCreater = producCreater;
    }

    /**
     * @return c_product_top_pic_list_id
     */
    public String getProductTopPicListId() {
        return productTopPicListId;
    }

    /**
     * @param productTopPicListId
     */
    public void setProductTopPicListId(String productTopPicListId) {
        this.productTopPicListId = productTopPicListId;
    }

    /**
     * @return c_product_middle_pic_list_id
     */
    public String getProductMiddlePicListId() {
        return productMiddlePicListId;
    }

    /**
     * @param productMiddlePicListId
     */
    public void setProductMiddlePicListId(String productMiddlePicListId) {
        this.productMiddlePicListId = productMiddlePicListId;
    }

    /**
     * @return c_product_details_page
     */
    public String getProductDetailsPage() {
        return productDetailsPage;
    }

    /**
     * @param productDetailsPage
     */
    public void setProductDetailsPage(String productDetailsPage) {
        this.productDetailsPage = productDetailsPage;
    }

    /**
     * @return c_product_num
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * @param productNum
     */
    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    /**
     * @return c_product_sale_price
     */
    public String getProductSalePrice() {
        return productSalePrice;
    }

    /**
     * @param productSalePrice
     */
    public void setProductSalePrice(String productSalePrice) {
        this.productSalePrice = productSalePrice;
    }

    /**
     * @return c_product_price
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return c_text1
     */
    public String getText1() {
        return text1;
    }

    /**
     * @param text1
     */
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * @return c_text2
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }
}