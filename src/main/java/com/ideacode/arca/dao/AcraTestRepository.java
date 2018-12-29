package com.ideacode.arca.dao;

import com.ideacode.arca.dao.entity.CrashTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 测试环境数据收集
 *
 * Created by randysu on 2018/11/28.
 */

@Repository
public interface AcraTestRepository extends JpaRepository<CrashTestEntity,Integer> {

}
