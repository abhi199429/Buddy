package com.example.development;

import com.Buddy.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = DevelopmentApplication.class)
public class DevelopmentApplicationTests {

    @Autowired
    private I18NService i18NService;

    @Test
    public void testMessageByLocaleService() throws Exception{

        String expectedResult = "Bootstrap starter Template";
        String messageId = "index.main";
        String actualResult = i18NService.getMessage(messageId);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
