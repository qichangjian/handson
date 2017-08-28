package cn.sxt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sxt.dao.EmployeeDao;
import cn.sxt.service.EmployeeService;
import cn.sxt.vo.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> list() {
		return employeeDao.list();
	}

	@Override
	public int addEmployee(Map<String, Object> map) {
		return employeeDao.addEmployee(map);
	}

	@Override
	public int deleteEmployee(int emp_id) {
		return employeeDao.deleteEmployee(emp_id);
	}

	@Override
	public int updateEmployee(Map<String, Object> map) {
		return employeeDao.updateEmployee(map);
	}
	
	
}
