package dao;

import domain.Airfare;
import domain.ExtraItem;

public class ExtraItemDAO extends DAO<ExtraItem> {
    @Override
    protected String getSqlString() {
        return "select a from extra_item ex";
    }

    @Override
    protected Class getClassName() {
        return ExtraItem.class;
    }
}
