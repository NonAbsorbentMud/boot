package own.cfb.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import own.cfb.boot.JdbcDao.IdCardDao;
import own.cfb.boot.model.IdCard;
import own.cfb.boot.service.IdCardService;

import java.util.List;

@Service
public class IdCardSerivceImpl implements IdCardService {

    @Autowired
    private IdCardDao idCardDao;

    @Override
    public List<IdCard> getIdCardList() {
        return idCardDao.getIdCardList();
    }
}
