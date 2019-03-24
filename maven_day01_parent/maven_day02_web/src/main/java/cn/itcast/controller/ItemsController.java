package cn.itcast.controller;

import cn.itcast.pojo.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findDetail")
    public ModelAndView findById(){
        int id=1;
        Items byId = itemsService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("item",byId);
        mv.setViewName("itemDetail");
        return mv;
    }
}
