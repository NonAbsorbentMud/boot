package own.cfb.boot.JdbcDao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import own.cfb.boot.JdbcDao.IdCardDao;
import own.cfb.boot.model.IdCard;

import java.util.List;

@Repository
public class IdCardDaoImpl implements IdCardDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<IdCard> getIdCardList() {
        List idCardList = jdbcTemplate.query("select * from idcards", new BeanPropertyRowMapper(IdCard.class));
        return idCardList;
    }
}
