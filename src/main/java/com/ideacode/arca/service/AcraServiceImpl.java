package com.ideacode.arca.service;

import com.ideacode.arca.dao.AcraRepository;
import com.ideacode.arca.dao.AcraTestRepository;
import com.ideacode.arca.dao.entity.CrashEntity;
import com.ideacode.arca.dao.entity.CrashTestEntity;
import com.ideacode.arca.domain.Crash;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 日志服务类
 *
 * Created by randysu on 2018/11/28.
 */

@Service
public class AcraServiceImpl implements AcraService {

    private static final Logger LOGGER = Logger.getLogger(AcraServiceImpl.class);

    @Autowired
    AcraRepository repository;

    @Autowired
    AcraTestRepository acraTestRepository;

    public void uploadCrashReport(Crash crash) {
        if (crash == null) {
            return;
        }
        LOGGER.info("------------ save crash info start ------------");

        LOGGER.info("APP_VERSION_NAME:" + crash.getAPP_VERSION_NAME());

        if (crash.getAPP_VERSION_NAME() != null && crash.getAPP_VERSION_NAME().contains("test")) { // 测试环境
            CrashTestEntity crashTestEntity = new CrashTestEntity();
            crashTestEntity.setKEY(UUID.randomUUID().toString());
            crashTestEntity.setANDROID_VERSION(crash.getANDROID_VERSION());
            crashTestEntity.setAPP_VERSION_CODE(aovidNull(crash.getAPP_VERSION_CODE() + ""));
            crashTestEntity.setAPP_VERSION_NAME(crash.getAPP_VERSION_NAME());
            crashTestEntity.setAVAILABLE_MEM_SIZE(aovidNull(crash.getAVAILABLE_MEM_SIZE() + ""));
            crashTestEntity.setANDROID_VERSION(aovidNull(crash.getANDROID_VERSION()));
            crashTestEntity.setAPP_VERSION_CODE(aovidNull(crash.getAPP_VERSION_CODE() + ""));
            crashTestEntity.setAPP_VERSION_NAME(aovidNull(crash.getAPP_VERSION_NAME()));
            crashTestEntity.setAVAILABLE_MEM_SIZE(aovidNull(crash.getAVAILABLE_MEM_SIZE() + ""));
            crashTestEntity.setBRAND(aovidNull(crash.getBRAND()));
            crashTestEntity.setSTACK_TRACE(aovidNull(crash.getSTACK_TRACE()));
            crashTestEntity.setTOTAL_MEM_SIZE(aovidNull(crash.getTOTAL_MEM_SIZE() + ""));
            crashTestEntity.setUSER_APP_START_DATE(aovidNull(crash.getUSER_APP_START_DATE()));
            crashTestEntity.setUSER_CRASH_DATE(aovidNull(crash.getUSER_CRASH_DATE()));
            crashTestEntity.setPACKAGE_NAME(aovidNull(crash.getPACKAGE_NAME()));
            crashTestEntity.setPHONE_MODEL(aovidNull(crash.getPHONE_MODEL()));
            crashTestEntity.setPRODUCT(aovidNull(crash.getPRODUCT()));
            crashTestEntity.setCPU_ABI(aovidNull(crash.getBUILD().getCPU_ABI()));
            crashTestEntity.setCPU_ABI2(aovidNull(crash.getBUILD().getCPU_ABI2()));
            crashTestEntity.setFINGERPRINT(aovidNull(crash.getBUILD().getFINGERPRINT()));
            crashTestEntity.setUSER_COMMENT(aovidNull(crash.getUSER_COMMENT()));
            crashTestEntity.setCreateTime(getCurrentDateTime());

            acraTestRepository.save(crashTestEntity);
        } else { // 正式环境
            CrashEntity crashEntity = new CrashEntity();
            crashEntity.setKEY(UUID.randomUUID().toString());
            crashEntity.setANDROID_VERSION(crash.getANDROID_VERSION());
            crashEntity.setAPP_VERSION_CODE(aovidNull(crash.getAPP_VERSION_CODE() + ""));
            crashEntity.setAPP_VERSION_NAME(crash.getAPP_VERSION_NAME());
            crashEntity.setAVAILABLE_MEM_SIZE(aovidNull(crash.getAVAILABLE_MEM_SIZE() + ""));
            crashEntity.setANDROID_VERSION(aovidNull(crash.getANDROID_VERSION()));
            crashEntity.setAPP_VERSION_CODE(aovidNull(crash.getAPP_VERSION_CODE() + ""));
            crashEntity.setAPP_VERSION_NAME(aovidNull(crash.getAPP_VERSION_NAME()));
            crashEntity.setAVAILABLE_MEM_SIZE(aovidNull(crash.getAVAILABLE_MEM_SIZE() + ""));
            crashEntity.setBRAND(aovidNull(crash.getBRAND()));
            crashEntity.setSTACK_TRACE(aovidNull(crash.getSTACK_TRACE()));
            crashEntity.setTOTAL_MEM_SIZE(aovidNull(crash.getTOTAL_MEM_SIZE() + ""));
            crashEntity.setUSER_APP_START_DATE(aovidNull(crash.getUSER_APP_START_DATE()));
            crashEntity.setUSER_CRASH_DATE(aovidNull(crash.getUSER_CRASH_DATE()));
            crashEntity.setPACKAGE_NAME(aovidNull(crash.getPACKAGE_NAME()));
            crashEntity.setPHONE_MODEL(aovidNull(crash.getPHONE_MODEL()));
            crashEntity.setPRODUCT(aovidNull(crash.getPRODUCT()));
            crashEntity.setCPU_ABI(aovidNull(crash.getBUILD().getCPU_ABI()));
            crashEntity.setCPU_ABI2(aovidNull(crash.getBUILD().getCPU_ABI2()));
            crashEntity.setFINGERPRINT(aovidNull(crash.getBUILD().getFINGERPRINT()));
            crashEntity.setUSER_COMMENT(aovidNull(crash.getUSER_COMMENT()));
            crashEntity.setCreateTime(getCurrentDateTime());

            repository.save(crashEntity);
        }

        LOGGER.info("------------ save crash info end ------------");
    }

    private String aovidNull(String str) {
        if (str == null)
            return "";
        return str;
    }

    public static String getCurrentDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        return str;
    }

}
