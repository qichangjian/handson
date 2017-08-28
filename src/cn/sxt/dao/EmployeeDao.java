package cn.sxt.dao;

import java.util.List;
import java.util.Map;

import cn.sxt.vo.Employee;

public interface EmployeeDao {
	//��ѯ
	public List<Employee> list();
	//add
	int addEmployee(Map<String,Object> map);
	//delete
	int deleteEmployee(int emp_id);
	//update
	int updateEmployee(Map<String,Object> map);
}
