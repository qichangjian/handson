package cn.sxt.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sxt.dao.EmployeeDao;
import cn.sxt.vo.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends SqlSessionDaoSupport implements EmployeeDao{
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public List<Employee> list() {
		return getSqlSession().selectList("cn.sxt.vo.employee.mapper.list");
	}

	@Override
	public int addEmployee(Map<String, Object> map) {
		return getSqlSession().insert("cn.sxt.vo.employee.mapper.addEmployee",map);
	}

	@Override
	public int deleteEmployee(int emp_id) {
		return getSqlSession().delete("cn.sxt.vo.employee.mapper.deleteEmployee",emp_id);
	}

	@Override
	public int updateEmployee(Map<String, Object> map) {
		return getSqlSession().update("cn.sxt.vo.employee.mapper.updateEmployee",map);
	}
}
