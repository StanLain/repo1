package cn.itcast.service.imp;

import cn.itcast.mapper.ItemsMapper;
import cn.itcast.pojo.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImp implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
