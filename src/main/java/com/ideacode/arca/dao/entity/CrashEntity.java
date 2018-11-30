package com.ideacode.arca.dao.entity;


import lombok.Data;

import javax.persistence.*;

/**
 * 崩溃信息数据库表
 *
 * Created by randysu on 2018/11/28.
 */

@Entity
@Table(name = "t_crash")
@Data
public class CrashEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "t_key")
    private String KEY;

    @Column(name = "t_android_version")
    private String ANDROID_VERSION;

    @Column(name = "t_app_version_code")
    private String APP_VERSION_CODE;

    @Column(name = "t_app_version_name")
    private String APP_VERSION_NAME;

    @Column(name = "t_available_mem_size")
    private String AVAILABLE_MEM_SIZE;

    @Column(name = "t_brand")
    private String BRAND;

    @Column(name = "t_stack_trace")
    private String STACK_TRACE;

    @Column(name = "t_total_mem_size")
    private String TOTAL_MEM_SIZE;

    @Column(name = "t_user_app_start_date")
    private String USER_APP_START_DATE;

    @Column(name = "t_user_crash_date")
    private String USER_CRASH_DATE;

    @Column(name = "t_package_name")
    private String PACKAGE_NAME;

    @Column(name = "t_phone_model")
    private String PHONE_MODEL;

    @Column(name = "t_product")
    private String PRODUCT;

    @Column(name = "t_cpu_abi")
    private String CPU_ABI;

    @Column(name = "t_cpu_abi2")
    private String CPU_ABI2;

    @Column(name = "t_fingerprint")
    private String FINGERPRINT;

    @Column(name = "t_user_comment")
    private String USER_COMMENT;

    @Column(name = "create_time")
    private String createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKEY() {
        return KEY;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    public String getANDROID_VERSION() {
        return ANDROID_VERSION;
    }

    public void setANDROID_VERSION(String ANDROID_VERSION) {
        this.ANDROID_VERSION = ANDROID_VERSION;
    }

    public String getAPP_VERSION_CODE() {
        return APP_VERSION_CODE;
    }

    public void setAPP_VERSION_CODE(String APP_VERSION_CODE) {
        this.APP_VERSION_CODE = APP_VERSION_CODE;
    }

    public String getAPP_VERSION_NAME() {
        return APP_VERSION_NAME;
    }

    public void setAPP_VERSION_NAME(String APP_VERSION_NAME) {
        this.APP_VERSION_NAME = APP_VERSION_NAME;
    }

    public String getAVAILABLE_MEM_SIZE() {
        return AVAILABLE_MEM_SIZE;
    }

    public void setAVAILABLE_MEM_SIZE(String AVAILABLE_MEM_SIZE) {
        this.AVAILABLE_MEM_SIZE = AVAILABLE_MEM_SIZE;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getSTACK_TRACE() {
        return STACK_TRACE;
    }

    public void setSTACK_TRACE(String STACK_TRACE) {
        this.STACK_TRACE = STACK_TRACE;
    }

    public String getTOTAL_MEM_SIZE() {
        return TOTAL_MEM_SIZE;
    }

    public void setTOTAL_MEM_SIZE(String TOTAL_MEM_SIZE) {
        this.TOTAL_MEM_SIZE = TOTAL_MEM_SIZE;
    }

    public String getUSER_APP_START_DATE() {
        return USER_APP_START_DATE;
    }

    public void setUSER_APP_START_DATE(String USER_APP_START_DATE) {
        this.USER_APP_START_DATE = USER_APP_START_DATE;
    }

    public String getUSER_CRASH_DATE() {
        return USER_CRASH_DATE;
    }

    public void setUSER_CRASH_DATE(String USER_CRASH_DATE) {
        this.USER_CRASH_DATE = USER_CRASH_DATE;
    }

    public String getPACKAGE_NAME() {
        return PACKAGE_NAME;
    }

    public void setPACKAGE_NAME(String PACKAGE_NAME) {
        this.PACKAGE_NAME = PACKAGE_NAME;
    }

    public String getPHONE_MODEL() {
        return PHONE_MODEL;
    }

    public void setPHONE_MODEL(String PHONE_MODEL) {
        this.PHONE_MODEL = PHONE_MODEL;
    }

    public String getPRODUCT() {
        return PRODUCT;
    }

    public void setPRODUCT(String PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    public String getCPU_ABI() {
        return CPU_ABI;
    }

    public void setCPU_ABI(String CPU_ABI) {
        this.CPU_ABI = CPU_ABI;
    }

    public String getCPU_ABI2() {
        return CPU_ABI2;
    }

    public void setCPU_ABI2(String CPU_ABI2) {
        this.CPU_ABI2 = CPU_ABI2;
    }

    public String getFINGERPRINT() {
        return FINGERPRINT;
    }

    public void setFINGERPRINT(String FINGERPRINT) {
        this.FINGERPRINT = FINGERPRINT;
    }

    public String getUSER_COMMENT() {
        return USER_COMMENT;
    }

    public void setUSER_COMMENT(String USER_COMMENT) {
        this.USER_COMMENT = USER_COMMENT;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CrashModel [id=" + id + ", KEY=" + KEY + ", ANDROID_VERSION=" + ANDROID_VERSION
                + ", APP_VERSION_CODE=" + APP_VERSION_CODE
                + ", APP_VERSION_NAME=" + APP_VERSION_NAME
                + ", AVAILABLE_MEM_SIZE=" + AVAILABLE_MEM_SIZE + ", BRAND="
                + BRAND + ", STACK_TRACE=" + STACK_TRACE + ", TOTAL_MEM_SIZE="
                + TOTAL_MEM_SIZE + ", USER_APP_START_DATE="
                + USER_APP_START_DATE + ", USER_CRASH_DATE=" + USER_CRASH_DATE
                + ", PACKAGE_NAME=" + PACKAGE_NAME + ", PHONE_MODEL="
                + PHONE_MODEL + ", PRODUCT=" + PRODUCT + ", CPU_ABI=" + CPU_ABI
                + ", CPU_ABI2=" + CPU_ABI2 + ", FINGERPRINT=" + FINGERPRINT
                + "]";
    }
}
