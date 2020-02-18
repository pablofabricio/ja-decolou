package dao;

import domain.Airfare;
import domain.Destination;

public class DestinationDAO extends DAO<Destination> {
    @Override
    protected String getSqlString() {
        return "select a from destination des";
    }

    @Override
    protected Class getClassName() {
        return Destination.class;
    }
}
