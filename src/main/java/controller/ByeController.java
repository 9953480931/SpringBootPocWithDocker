package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ByeService;

/**
 * Created by jaspreet on 9/18/2018.
 */
@RestController
public class ByeController {

    @Autowired
    ByeService byeService;

    @RequestMapping("/bye")
    public String getMessage(){
        return byeService.getByeMessage();
    }
}
