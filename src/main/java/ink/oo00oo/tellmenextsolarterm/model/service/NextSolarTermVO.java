package ink.oo00oo.tellmenextsolarterm.model.service;

import lombok.Data;

@Data
public class NextSolarTermVO {

    /**
     * 举例下一个节气还剩几天
     */
    private long dayCount;

    /**
     * 下一个节气
     */
    private SolarTermVO nextSolarTermVO;
}
