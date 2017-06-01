package lbd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
@Controller
@RequestMapping( "/ajax" )
public class AjaxController {
    @RequestMapping( "/test1" )
    @ResponseBody
    public String test1(){
        return "index.jsp";
    }
}
