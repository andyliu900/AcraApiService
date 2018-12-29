package com.ideacode.arca.dao.entity;

import lombok.Data;

import javax.persistence.*;

/**
 *
 * 设备信息数据库表
 *
 * Created by randysu on 2018/12/18.
 */

@Entity
@Table(name = "t_device")
@Data
public class DeviceEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "device_no")
    private String device_no;

    @Column(name = "device_did")
    private String device_did;

    @Column(name = "apk_version_code")
    private String apk_version_code;

    @Column(name = "apk_version_name")
    private String apk_version_name;

    @Column(name = "rom_version_name")
    private String rom_version_name;

    @Column(name = "android_version")
    private String android_version;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "city_name")
    private String city_name;

    @Column(name = "create_time")
    private String create_time;

    @Column(name = "update_time")
    private String update_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDevice_no() {
        return device_no;
    }

    public void setDevice_no(String device_no) {
        this.device_no = device_no;
    }

    public String getDevice_did() {
        return device_did;
    }

    public void setDevice_did(String device_did) {
        this.device_did = device_did;
    }

    public String getApk_version_code() {
        return apk_version_code;
    }

    public void setApk_version_code(String apk_version_code) {
        this.apk_version_code = apk_version_code;
    }

    public String getApk_version_name() {
        return apk_version_name;
    }

    public void setApk_version_name(String apk_version_name) {
        this.apk_version_name = apk_version_name;
    }

    public String getRom_version_name() {
        return rom_version_name;
    }

    public void setRom_version_name(String rom_version_name) {
        this.rom_version_name = rom_version_name;
    }

    public String getAndroid_version() {
        return android_version;
    }

    public void setAndroid_version(String android_version) {
        this.android_version = android_version;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "DeviceEntity [id=" + id + ", device_no=" + device_no + ", device_did=" + device_did
                + ", apk_version_code=" + apk_version_code
                + ", apk_version_name=" + apk_version_name
                + ", rom_version_name="
                + rom_version_name + ", android_version=" + android_version + ", longitude="
                + longitude + ", latitude="
                + latitude + ", city_name=" + city_name
                + ", create_time=" + create_time + ", update_time="
                + update_time + "]";
    }
}
