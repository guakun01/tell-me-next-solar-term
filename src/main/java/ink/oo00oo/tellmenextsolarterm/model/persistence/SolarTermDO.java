package ink.oo00oo.tellmenextsolarterm.model.persistence;

import lombok.Data;

@Data
public class SolarTermDO {

    /**
     * 主键
     */
    private int id;

    /**
     * 节气名称
     */
    private String name;

    /**
     * 节气英文名
     */
    private String nameEn;

    /**
     * 气象变化
     */
    private String meteorologicalChanges;

    /**
     * 关联诗句
     */
    private String relatedVerses;

    /**
     * 节气渊源
     */
    private String meaning;

    /**
     * 风俗
     */
    private String custom;

    /**
     * 推荐食物
     */
    private String recommendedFoods;

    /**
     * 注意事项
     */
    private String addition;
}
