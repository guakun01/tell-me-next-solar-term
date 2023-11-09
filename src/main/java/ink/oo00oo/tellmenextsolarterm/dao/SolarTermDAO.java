package ink.oo00oo.tellmenextsolarterm.dao;

import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDO;

public interface SolarTermDAO {

    SolarTermDO getByName(String solarTermName);
}
