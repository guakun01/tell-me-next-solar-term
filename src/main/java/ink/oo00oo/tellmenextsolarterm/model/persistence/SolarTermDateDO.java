package ink.oo00oo.tellmenextsolarterm.model.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolarTermDateDO {

    /**
     * 主键
     */
    private int id;

    /**
     * 创建时间
     */
    private LocalDate gmtCreate;

    /**
     * 修改时间
     */
    private LocalDate gmtModified;

    /**
     * 删除标识
     */
    private int isDeleted;

    /**
     * 节气名称
     */
    private String solarTermName;

    /**
     * 节气时间
     */
    private LocalDate solarTermDate;

}
