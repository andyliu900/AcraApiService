package com.ideacode.arca.dao;

import com.ideacode.arca.dao.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 设备信息数据库操作
 *
 * Created by randysu on 2018/12/18.
 */

@Repository
public interface DeviceRepository extends JpaRepository<DeviceEntity,Integer>, JpaSpecificationExecutor {


}
