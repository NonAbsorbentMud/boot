package own.cfb.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import own.cfb.boot.domain.Response;
import own.cfb.boot.model.IdCard;
import own.cfb.boot.service.IdCardService;

import java.util.List;

@RestController
@RequestMapping("/idCard")
public class IdCardController {

    @Autowired
    private IdCardService idcardService;

    @RequestMapping("/getIdCardList")
    public Response<List<IdCard>> getIdCardList(){
        Response<List<IdCard>> response=new Response<List<IdCard>>();
        List<IdCard> idCardList = idcardService.getIdCardList();
        response.setCode(0);
        response.setResult(idCardList);
        return response;
    }
}
