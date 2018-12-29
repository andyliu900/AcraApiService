package com.ideacode.arca.service;

import com.ideacode.arca.dao.DeviceRepository;
import com.ideacode.arca.dao.DeviceTestRepository;
import com.ideacode.arca.dao.entity.DeviceEntity;
import com.ideacode.arca.dao.entity.DeviceTestEntity;
import com.ideacode.arca.domain.DeviceInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 设备信息服务实现
 *
 * Created by randysu on 2018/12/18.
 */

@Service
public class DeviceServiceImpl implements DeviceService {

    private static final Logger LOGGER = Logger.getLogger(AcraServiceImpl.class);

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    DeviceTestRepository deviceTestRepository;

    @Override
    public void registDevice(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        LOGGER.info("------------ save device info start ------------");

        LOGGER.info("deviceNo:" + deviceInfo.getDevice_no());

        if (deviceInfo.getApk_version_name() != null && deviceInfo.getApk_version_name().contains("test")) { // 测试环境
            DeviceTestEntity deviceTestEntity = new DeviceTestEntity();
            deviceTestEntity.setDevice_no(aovidNull(deviceInfo.getDevice_no()));
            deviceTestEntity.setDevice_did(aovidNull(deviceInfo.getDevice_did()));
            deviceTestEntity.setApk_version_code(aovidNull(deviceInfo.getApk_version_code()));
            deviceTestEntity.setApk_version_name(aovidNull(deviceInfo.getApk_version_name()));
            deviceTestEntity.setRom_version_name(aovidNull(deviceInfo.getRom_version_name()));
            deviceTestEntity.setAndroid_version(aovidNull(deviceInfo.getAndroid_version()));
            if (deviceInfo.getCity_name() != null) {
                LOGGER.info("city_name:" + deviceInfo.getCity_name());
                deviceTestEntity.setLongitude(deviceInfo.getLongitude());
                deviceTestEntity.setLatitude(deviceInfo.getLatitude());
                deviceTestEntity.setCity_name(deviceInfo.getCity_name());
            }

            Specification specification = new Specification<DeviceTestEntity>() {

                @Override
                public Predicate toPredicate(Root<DeviceTestEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    List<Predicate> predicates = new ArrayList<>();
                    if(null != deviceInfo.getDevice_no()){
                        predicates.add(criteriaBuilder.equal(root.get("device_no"), deviceInfo.getDevice_no()));
                    }
                    return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
                }
            };

            DeviceTestEntity orignDeviceTestEntity = (DeviceTestEntity) deviceTestRepository.findOne(specification);

            if (null == orignDeviceTestEntity) {
                String currentTime = getCurrentDateTime();
                deviceTestEntity.setCreate_time(currentTime);
                deviceTestEntity.setUpdate_time(currentTime);
            } else {
                deviceTestEntity.setId(orignDeviceTestEntity.getId());
                deviceTestEntity.setCreate_time(orignDeviceTestEntity.getCreate_time());
                String currentTime = getCurrentDateTime();
                deviceTestEntity.setUpdate_time(currentTime);
            }

            deviceTestRepository.save(deviceTestEntity);
        } else { // 正式环境
            DeviceEntity deviceEntity = new DeviceEntity();
            deviceEntity.setDevice_no(aovidNull(deviceInfo.getDevice_no()));
            deviceEntity.setDevice_did(aovidNull(deviceInfo.getDevice_did()));
            deviceEntity.setApk_version_code(aovidNull(deviceInfo.getApk_version_code()));
            deviceEntity.setApk_version_name(aovidNull(deviceInfo.getApk_version_name()));
            deviceEntity.setRom_version_name(aovidNull(deviceInfo.getRom_version_name()));
            deviceEntity.setAndroid_version(aovidNull(deviceInfo.getAndroid_version()));
            if (deviceInfo.getCity_name() != null) {
                LOGGER.info("city_name:" + deviceInfo.getCity_name());
                deviceEntity.setLongitude(deviceInfo.getLongitude());
                deviceEntity.setLatitude(deviceInfo.getLatitude());
                deviceEntity.setCity_name(deviceInfo.getCity_name());
            }

            Specification specification = new Specification<DeviceEntity>() {

                @Override
                public Predicate toPredicate(Root<DeviceEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    List<Predicate> predicates = new ArrayList<>();
                    if(null != deviceInfo.getDevice_no()){
                        predicates.add(criteriaBuilder.equal(root.get("device_no"), deviceInfo.getDevice_no()));
                    }
                    return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
                }
            };

            DeviceEntity orignDeviceEntity = (DeviceEntity) deviceRepository.findOne(specification);

            if (null == orignDeviceEntity) {
                String currentTime = getCurrentDateTime();
                deviceEntity.setCreate_time(currentTime);
                deviceEntity.setUpdate_time(currentTime);
            } else {
                deviceEntity.setId(orignDeviceEntity.getId());
                deviceEntity.setCreate_time(orignDeviceEntity.getCreate_time());
                String currentTime = getCurrentDateTime();
                deviceEntity.setUpdate_time(currentTime);
            }

            deviceRepository.save(deviceEntity);
        }

        LOGGER.info("------------ save device info end ------------");
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
