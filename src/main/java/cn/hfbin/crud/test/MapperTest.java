package cn.hfbin.crud.test;

import cn.hfbin.crud.bean.Employee;
import cn.hfbin.crud.dao.DepartmentMapper;
import cn.hfbin.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 *使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
    DepartmentMapper departmentMapper;
	
	@Autowired
    EmployeeMapper employeeMapper;
	
	@Autowired
	SqlSession sqlSession;
	/**
	 * 获取所有部门
	 */
	@Test
	public void text01(){
		System.out.println("所有部门 "+departmentMapper.selectByExample(null));
	}
	/**
	 * 批量插入
	 * 为了插入不同的性别 跟部门我做了四个不同的循环
	 */
	@Test
	public void testCRUD(){
	EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		for(int i = 0;i<200;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Employee(null,uid, "f", uid+"@hfbin.com", 1));
		}
		for(int i = 0;i<200;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Employee(null,uid, "M", uid+"@hfbin.com", 2));
		}
		for(int i = 0;i<200;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Employee(null,uid, "f", uid+"@hfbin.com", 3));
		}
		for(int i = 0;i<200;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Employee(null,uid, "M", uid+"@hfbin.com", 4));
		}
		System.out.println("批量完成");
		
	}

}
