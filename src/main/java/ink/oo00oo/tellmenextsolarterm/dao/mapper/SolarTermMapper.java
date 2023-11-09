package ink.oo00oo.tellmenextsolarterm.dao.mapper;

import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SolarTermMapper {


    @Select("select * from `solar-term` where name = #{name}")
    SolarTermDO getByName(@Param("name") String name);
}
