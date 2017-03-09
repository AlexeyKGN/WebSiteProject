package service.impl;


import dao.DepartmentDao;
import dao.impl.DepartmentDaoImpl;
import model.Department;
import service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServiceImpl implements DepartmentService{
    private DepartmentDao departmentDao = new DepartmentDaoImpl();


    public void updateDepartment(Department department) {

    }

    public void addDepartment(Department department) {

    }

    public List<Department> getAll() throws SQLException {
        List<Department> departmentList = departmentDao.getListDepartments();
        return departmentList;
    }
}
