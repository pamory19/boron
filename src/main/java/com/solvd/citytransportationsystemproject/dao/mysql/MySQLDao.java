package com.solvd.citytransportationsystemproject.dao.mysql;

import java.sql.ResultSet;

abstract public class MySQLDao<T> {
    protected abstract T resultSetToObject(ResultSet resultSet);
}