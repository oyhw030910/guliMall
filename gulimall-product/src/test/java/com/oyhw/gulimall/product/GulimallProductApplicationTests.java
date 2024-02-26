package com.oyhw.gulimall.product;

import com.oyhw.gulimall.product.entity.BrandEntity;
import com.oyhw.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity temp=new BrandEntity();
        temp.setName("OPPO");
        brandService.save(temp);
        System.out.println("插入成功");
    }

}
