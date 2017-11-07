package cn.hfbin.crud.test;


import cn.hfbin.crud.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ServicceTest {

    @Autowired
    EmployeeService employeeService;

    /**
     * 测试用户名是否可用
     * 查询id为4416的信息
     */
    @Test
    public void text01(){
        System.out.println("返回true或false----"+employeeService.checkUser("hfbin"));
        System.out.println("返回id为4416的数据"+employeeService.getEmp(4416));
    }
}
