package service;


import model.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentService{

    void updateDepartment(Department department);

    //int deleteDepartment(Department delete) throws SQLException;

    Department deleteDepartment(int deleteId) throws SQLException;

    int addDepartment(Department depAdd) throws SQLException;
    
    List<Department> getAll() throws SQLException;


}
