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

package com.wavemaker.runtime.data.sample.sakila;

// Generated Jun 26, 2007 4:52:50 PM by Hibernate Tools 3.2.0.b9

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * For TestHibernate
 * 
 * Address generated by hbm2java
 */
@SuppressWarnings({ "serial", "unchecked" })
public class TestAddress implements java.io.Serializable {

    private Short addressId;

    private TestCity city;

    private String address;

    private String address2;

    private String district;

    private String postalCode;

    private String phone;

    private Date lastUpdate;

    private Set customers = new HashSet(0);

    public TestAddress() {
    }

    public TestAddress(TestCity city, String address, String district, String phone, Date lastUpdate) {
        this.city = city;
        this.address = address;
        this.district = district;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }

    public Short getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public TestCity getCity() {
        return this.city;
    }

    public void setCity(TestCity city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set getCustomers() {
        return this.customers;
    }

    public void setCustomers(Set customers) {
        this.customers = customers;
    }
}
