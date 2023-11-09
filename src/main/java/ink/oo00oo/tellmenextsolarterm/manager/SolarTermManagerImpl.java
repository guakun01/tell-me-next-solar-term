package ink.oo00oo.tellmenextsolarterm.manager;

import ink.oo00oo.tellmenextsolarterm.dao.SolarTermDAO;
import ink.oo00oo.tellmenextsolarterm.dao.SolarTermDateDAO;
import ink.oo00oo.tellmenextsolarterm.exception.ResourceNotFoundException;
import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDO;
import ink.oo00oo.tellmenextsolarterm.model.persistence.SolarTermDateDO;
import ink.oo00oo.tellmenextsolarterm.model.service.NextSolarTermVO;
import ink.oo00oo.tellmenextsolarterm.model.service.SolarTermVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Component
public class SolarTermManagerImpl implements SolarTermManager {

    private SolarTermDAO solarTermDAO;

    private SolarTermDateDAO solarTermDateDAO;

    @Autowired
    public SolarTermManagerImpl(
            final SolarTermDAO solarTermDAO,
            final SolarTermDateDAO solarTermDateDAO) {
        this.solarTermDAO = solarTermDAO;
        this.solarTermDateDAO = solarTermDateDAO;
    }

    @Override
    public NextSolarTermVO getNextSolarTerm() {
        SolarTermDateDO solarTermDateDO =
                Optional.ofNullable(solarTermDateDAO.getNextSolarTermDate())
                        .orElseThrow(() -> new ResourceNotFoundException("找不到下一个节气了，请联系机器人。"));

        SolarTermDO solarTermDO =
                Optional.ofNullable(solarTermDAO.getByName(solarTermDateDO.getSolarTermName()))
                        .orElseThrow(() -> new ResourceNotFoundException("找不到下一个节气了，请联系机器人。"));

        SolarTermVO solarTermVO = SolarTermVO.builder()
                .id(solarTermDO.getId())
                .name(solarTermDO.getName())
                .nameEn(solarTermDO.getNameEn())
                .meaning(solarTermDO.getMeaning())
                .meteorologicalChanges(solarTermDO.getMeteorologicalChanges())
                .relatedVerses(solarTermDO.getRelatedVerses())
                .custom(solarTermDO.getCustom())
                .recommendedFoods(solarTermDO.getRecommendedFoods())
                .addition(solarTermDO.getAddition())
                .build();

        NextSolarTermVO nextSolarTermVO = new NextSolarTermVO();
        nextSolarTermVO.setNextSolarTermVO(solarTermVO);

        LocalDate today = LocalDate.now();
        long between = Math.abs(ChronoUnit.DAYS.between(today, solarTermDateDO.getSolarTermDate()));
        nextSolarTermVO.setDayCount(between);

        return nextSolarTermVO;
    }

}
