package cn.hfbin.crud.service;

import cn.hfbin.crud.bean.Department;
import cn.hfbin.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	//获取所有部门
	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list = departmentMapper.selectByExample(null);
		return list;
	}

}
