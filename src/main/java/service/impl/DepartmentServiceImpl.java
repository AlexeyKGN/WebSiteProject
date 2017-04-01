package service.impl;


import dao.DepartmentDao;
import dao.impl.DepartmentDaoImpl;
import model.Department;
import service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDaoImpl();


    public void updateDepartment(Department department) {

    }

    public Department deleteDepartment(int deleteId) throws SQLException {
         Department departmentDelete =  departmentDao.deleteDepartment(deleteId);
         return departmentDelete;
    }

//    public int deleteDepartment(Department delete) throws SQLException {
//       int departmentDel = departmentDao.deleteDepartment(delete);
//       return departmentDel;
//    }


    public int addDepartment(Department depAdd) throws SQLException {
        int departmentCreate = departmentDao.addDepartment(depAdd);
        return departmentCreate;
    }



    public List<Department> getAll() throws SQLException {
        List<Department> departmentList = departmentDao.getListDepartments();
        return departmentList;
    }
}
