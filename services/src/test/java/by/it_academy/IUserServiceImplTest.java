package by.it_academy;

import by.it_academy.services.ICarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context-services.xml")
public class IUserServiceImplTest {
    @Autowired
    ICarService carService;
    @Test
    public void getCarTest(){
        System.out.println(carService.getAllActiveCar());
    }

}
