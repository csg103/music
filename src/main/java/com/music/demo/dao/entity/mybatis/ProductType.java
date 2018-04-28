package com.music.demo.dao.entity.mybatis;

import javax.persistence.*;

@Table(name = "t_product_type")
public class ProductType {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "c_product_parent_id")
    private String productParentId;

    @Column(name = "c_product_parent_name")
    private String productParentName;

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
     * @return c_product_parent_name
     */
    public String getProductParentName() {
        return productParentName;
    }

    /**
     * @param productParentName
     */
    public void setProductParentName(String productParentName) {
        this.productParentName = productParentName;
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