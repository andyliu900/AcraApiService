package com.ideacode.arca.service;

import com.ideacode.arca.domain.DeviceInfo;

/**
 * 设备服务api接口
 *
 * Created by randysu on 2018/12/18.
 */

public interface DeviceService {

    /**
     * 上传设备信息
     * @param deviceInfo
     */
    void registDevice(DeviceInfo deviceInfo);

}
