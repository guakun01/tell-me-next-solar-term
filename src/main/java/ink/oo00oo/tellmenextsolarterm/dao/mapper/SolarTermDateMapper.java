package ink.oo00oo.tellmenextsolarterm.dao.mapper;

import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDateDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SolarTermDateMapper {

    @Select("select * from `solar-term-date` where solar_term_date > now() and is_deleted = 0 order by solar_term_date limit 1")
    SolarTermDateDO getNextSolarTermDate();
}
