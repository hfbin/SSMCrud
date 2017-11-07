package cn.hfbin.crud.dao;

import cn.hfbin.crud.bean.Employee;
import cn.hfbin.crud.bean.EmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 检验用户名是否可用
     */
    long countByExample(EmployeeExample example);

    /**
     * 批量删除员工
     */
    int deleteByExample(EmployeeExample example);

    /**
     * 员工删除
     */
    int deleteByPrimaryKey(Integer empId);


    /**
     * 员工保存
     */
    int insertSelective(Employee record);


    /**
     * 按照员工id查询员工
     */
    Employee selectByPrimaryKey(Integer empId);

    /**
     * 查询所有员工
     */
    List<Employee> selectByExampleWithDept(EmployeeExample example);

    /**
     * 员工更新
     */
    int updateByPrimaryKeySelective(Employee record);
}