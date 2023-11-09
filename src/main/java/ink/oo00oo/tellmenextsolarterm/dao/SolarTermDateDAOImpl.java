package ink.oo00oo.tellmenextsolarterm.dao;

import ink.oo00oo.tellmenextsolarterm.dao.mapper.SolarTermDateMapper;
import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDateDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class SolarTermDateDAOImpl implements SolarTermDateDAO {

    private SolarTermDateMapper solarTermDateMapper;

    @Autowired
    public SolarTermDateDAOImpl(final SolarTermDateMapper solarTermDateMapper) {
        this.solarTermDateMapper = solarTermDateMapper;
    }

    @Override
    public SolarTermDateDO getNextSolarTermDate() {
        SolarTermDateDO solarTermDateDO = solarTermDateMapper.getNextSolarTermDate();
        log.info("Next solar date: {}", solarTermDateDO);
        return solarTermDateDO;
    }

}
