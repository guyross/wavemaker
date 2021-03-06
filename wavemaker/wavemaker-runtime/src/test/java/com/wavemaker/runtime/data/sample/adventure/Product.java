/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.runtime.data.sample.adventure;

// Generated Aug 18, 2007 5:20:14 PM by Hibernate Tools 3.2.0.b9

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
@SuppressWarnings({ "serial", "unchecked" })
public class Product implements java.io.Serializable {

    private int productId;

    private ProductCategory productCategory;

    private ProductModel productModel;

    private String name;

    private String productNumber;

    private String color;

    private BigDecimal standardCost;

    private BigDecimal listPrice;

    private String size;

    private BigDecimal weight;

    private Date sellStartDate;

    private Date sellEndDate;

    private Date discontinuedDate;

    private Blob thumbNailPhoto;

    private String thumbnailPhotoFileName;

    private String rowguid;

    private Date modifiedDate;

    private Set salesOrderDetails = new HashSet(0);

    public Product() {
    }

    public Product(int productId, String name, String productNumber, BigDecimal standardCost, BigDecimal listPrice, Date sellStartDate,
        String rowguid, Date modifiedDate) {
        this.productId = productId;
        this.name = name;
        this.productNumber = productNumber;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.sellStartDate = sellStartDate;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Product(int productId, ProductCategory productCategory, ProductModel productModel, String name, String productNumber, String color,
        BigDecimal standardCost, BigDecimal listPrice, String size, BigDecimal weight, Date sellStartDate, Date sellEndDate, Date discontinuedDate,
        Blob thumbNailPhoto, String thumbnailPhotoFileName, String rowguid, Date modifiedDate, Set salesOrderDetails) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.productModel = productModel;
        this.name = name;
        this.productNumber = productNumber;
        this.color = color;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.size = size;
        this.weight = weight;
        this.sellStartDate = sellStartDate;
        this.sellEndDate = sellEndDate;
        this.discontinuedDate = discontinuedDate;
        this.thumbNailPhoto = thumbNailPhoto;
        this.thumbnailPhotoFileName = thumbnailPhotoFileName;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
        this.salesOrderDetails = salesOrderDetails;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductModel getProductModel() {
        return this.productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getStandardCost() {
        return this.standardCost;
    }

    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    public BigDecimal getListPrice() {
        return this.listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getSellStartDate() {
        return this.sellStartDate;
    }

    public void setSellStartDate(Date sellStartDate) {
        this.sellStartDate = sellStartDate;
    }

    public Date getSellEndDate() {
        return this.sellEndDate;
    }

    public void setSellEndDate(Date sellEndDate) {
        this.sellEndDate = sellEndDate;
    }

    public Date getDiscontinuedDate() {
        return this.discontinuedDate;
    }

    public void setDiscontinuedDate(Date discontinuedDate) {
        this.discontinuedDate = discontinuedDate;
    }

    public Blob getThumbNailPhoto() {
        return this.thumbNailPhoto;
    }

    public void setThumbNailPhoto(Blob thumbNailPhoto) {
        this.thumbNailPhoto = thumbNailPhoto;
    }

    public String getThumbnailPhotoFileName() {
        return this.thumbnailPhotoFileName;
    }

    public void setThumbnailPhotoFileName(String thumbnailPhotoFileName) {
        this.thumbnailPhotoFileName = thumbnailPhotoFileName;
    }

    public String getRowguid() {
        return this.rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Set getSalesOrderDetails() {
        return this.salesOrderDetails;
    }

    public void setSalesOrderDetails(Set salesOrderDetails) {
        this.salesOrderDetails = salesOrderDetails;
    }

}
