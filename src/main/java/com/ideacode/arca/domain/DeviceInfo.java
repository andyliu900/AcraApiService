package com.ideacode.arca.domain;

/**
 * 设备信息实体
 *
 * Created by randysu on 2018/12/18.
 */
public class DeviceInfo {

    private String device_no;

    private String device_did;

    private String apk_version_code;

    private String apk_version_name;

    private String rom_version_code;

    private String rom_version_name;

    private String android_version;

    private double longitude;

    private double latitude;

    private String city_name;

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

    public String getRom_version_code() {
        return rom_version_code;
    }

    public void setRom_version_code(String rom_version_code) {
        this.rom_version_code = rom_version_code;
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

    @Override
    public String toString() {
        return "DeviceInfo [device_no=" + device_no + ", device_did=" + device_did
                + ", apk_version_code=" + apk_version_code
                + ", apk_version_name=" + apk_version_name
                + ", rom_version_code=" + rom_version_code + ", rom_version_name="
                + rom_version_name + ", android_version=" + android_version + ", longitude="
                + longitude + ", latitude="
                + latitude + ", city_name=" + city_name + "]";
    }
}
