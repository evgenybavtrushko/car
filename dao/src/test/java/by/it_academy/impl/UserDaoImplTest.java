package by.it_academy.impl;

import by.it_academy.dao.CarDAO;
import by.it_academy.dao.OrderDAO;
import by.it_academy.dao.UserDao;
import by.it_academy.dao.impl.UserDaoImpl;
import by.it_academy.entities.Car;
import by.it_academy.entities.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context-DAO.xml")
public class UserDaoImplTest {
    @Autowired
    UserDao userDao;
    @Autowired
    CarDAO carDAO;
    @Autowired
    OrderDAO orderDAO;

    @Test
    public void testCar() {
        Car car = new Car(null,"fff",232, true, "asf" );

        carDAO.add(car);
        orderDAO.add(new Order());
        System.out.println(carDAO.get(1L));
    }
    @Test
    public void testUser() {
        System.out.println(userDao.get(3L));
    }
   /* @Test
    public void testCheckLogin() throws Exception {
        System.out.println("checkLogin");
        String login = "";
        boolean expResult = false;
        boolean result = userDao.checkLogin(login);
        assertEquals(expResult, result);
    }


 @Test
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        long userId = 2;
        UserDao instance = UserDaoImpl.getInstance();
        long expResult = 1;
        int result = instance.delete(userId);
        assertEquals(expResult, result);
    }
*/

    @Test
    public void testOldApi() {
//        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 8);
//        calendar.add(Calendar.DAY_OF_MONTH, 2);

        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("EEEEE d MM yyyy");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(format);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEEE dd M yyyy");
        try {
            Date date = sdf.parse(format);
            System.out.println(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
