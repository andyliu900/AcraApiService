package com.ideacode.arca.service;

import com.ideacode.arca.domain.Crash;

/**
 * Acra业务操作接口
 *
 * Created by randysu on 2018/11/28.
 */
public interface AcraService {

    /**
     * 上传崩溃日志信息
     * @param crash
     */
    void uploadCrashReport(Crash crash);

}
