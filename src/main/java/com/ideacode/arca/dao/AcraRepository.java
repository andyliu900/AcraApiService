package com.ideacode.arca.dao;

import com.ideacode.arca.dao.entity.CrashEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 数据库操作
 *
 * Created by randysu on 2018/11/28.
 */

@Repository
public interface AcraRepository extends JpaRepository<CrashEntity,Integer> {

}
