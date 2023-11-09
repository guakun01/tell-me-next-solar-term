package ink.oo00oo.tellmenextsolarterm.dao;

import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDateDO;

public interface SolarTermDateDAO {

    /**
     * 获取下一个节气的时间
     *
     * @return 获取下一个节气的时间
     */
    SolarTermDateDO getNextSolarTermDate();
}
