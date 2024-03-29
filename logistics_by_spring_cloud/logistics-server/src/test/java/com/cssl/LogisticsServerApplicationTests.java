package com.cssl;


import com.cssl.mailing.entity.Express_user;
import com.cssl.mailing.mapper.Express_userDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.time.LocalDateTime;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = LogisticsServerApplication.class)
public class LogisticsServerApplicationTests {

    @Autowired
    Express_userDao mapper;
    @Test
    public void contextLoads() {
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        int i = mapper.saveExpress_user(new Express_user(1, LocalDateTime.now(), LocalDateTime.now(), "李嘉欣", 430000, 430990, 430903, "17700244411", "杨舟", 430000, 431100, 431125, "15116114097", 1));
        System.out.println("i = " + i);
        //        Express_provinces_city_areas province =  mapper.findAddressByName("湖南省");
//        System.out.println("province = " + province);
//        List<Express_provinces_city_areas> express_provinces_city_areas = mapper.selectList(null);
//        Integer integer = mapper.selectCount(null);
//        System.out.println("integer = " + integer);
//        System.out.println("express_provinces_city_areas = " + express_provinces_city_areas);
    }

}
