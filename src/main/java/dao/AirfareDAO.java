package dao;

import domain.Airfare;

import java.sql.SQLException;
import java.util.List;

public class AirfareDAO extends DAO <Airfare>{
    @Override
    protected String getSqlString() {
        return "select a from airfare air";
    }

    @Override
    protected Class getClassName() {
        return Airfare.class;
    }
}
