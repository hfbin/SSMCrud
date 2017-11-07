package cn.hfbin.crud.dao;

import cn.hfbin.crud.bean.Department;
import cn.hfbin.crud.bean.DepartmentExample;

import java.util.List;

public interface DepartmentMapper {

    List<Department> selectByExample(DepartmentExample example);


}