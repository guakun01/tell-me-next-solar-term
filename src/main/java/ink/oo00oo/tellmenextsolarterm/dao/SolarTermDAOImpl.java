package ink.oo00oo.tellmenextsolarterm.dao;

import ink.oo00oo.tellmenextsolarterm.dao.mapper.SolarTermMapper;
import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SolarTermDAOImpl implements SolarTermDAO {

    private SolarTermMapper solarTermMapper;

    @Autowired
    public SolarTermDAOImpl(final SolarTermMapper solarTermMapper) {
        this.solarTermMapper = solarTermMapper;
    }

    @Override
    public SolarTermDO getByName(String name) {
        SolarTermDO solarTermDO = solarTermMapper.getByName(name);
        log.info("Get solar: {} by name: {}", solarTermDO, name);
        return solarTermDO;
    }
}
