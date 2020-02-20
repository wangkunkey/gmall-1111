package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        Product byId = productService.getById(1);
//        System.out.println("id=" + byId.getName());
        //测试增删改在主库，查在从库
//        Brand brand = new Brand();
//        brand.setName("王昆生日快乐，哈哈哈");
//        brandService.save(brand);

        Brand byId = brandService.getById(55);
        System.out.println("保存成功...."+byId.getName());
    }

}
