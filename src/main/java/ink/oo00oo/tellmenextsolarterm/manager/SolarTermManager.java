package ink.oo00oo.tellmenextsolarterm.manager;

import ink.oo00oo.tellmenextsolarterm.model.service.NextSolarTermVO;

public interface SolarTermManager {

    /**
     * 获取下一个节气
     *
     * @return 下一个节气
     */
    NextSolarTermVO getNextSolarTerm();
}
