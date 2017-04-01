package dao;


import model.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDao {

       // int deleteDepartment(Department id) throws SQLException;

        Department deleteDepartment(int deleteId) throws SQLException;

        void updateDepartment(Department departmentUpdate);


        Department getDepartmentById(int id) throws SQLException;

        List<Department> getListDepartments() throws SQLException;

        int addDepartment(Department id) throws SQLException;


}
