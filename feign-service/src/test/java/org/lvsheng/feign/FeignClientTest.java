package org.lvsheng.feign;

import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.runner.RunWith;
import org.lvsheng.MyApp;
import org.lvsheng.api.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyApp.class},webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class FeignClientTest {
    @Autowired
    private FeignApi feignApi;

    @Test
    public void test() {
        System.out.println(feignApi.getResource());
    }
}