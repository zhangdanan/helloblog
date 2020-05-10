package com.byteblogs.system.init.strategy;

import java.sql.Statement;


public interface TableInfoService {

    /**
     * 生成表的DDL语句
     */
    void builderTable(Statement stat);

}
