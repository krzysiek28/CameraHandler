package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiscCommandController {

    @RequestMapping(value = "/miscAddressSet")
    public String miscAddressSet(){

        return "redirect:/?command=miscAddressSet";
    }

    @RequestMapping(value = "/miscIFClear")
    public String miscIFClear(){

        return "redirect:/?command=miscIFClear";
    }

    @RequestMapping(value = "/miscCommandCancel")
    public String miscCommandCancel(int socketNumber){

        return "redirect:/?command=miscCommandCancel";
    }
}
