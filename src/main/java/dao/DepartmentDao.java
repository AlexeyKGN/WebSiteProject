package dao;


import model.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDao {

        void deleteDepartment(Department departmentDelete);

        void updateDepartment(Department departmentUpdate);

        void addDepartment(Department departmentAdd) throws SQLException;

        Department getDepartmentById(int id);

        List<Department> getListDepartments() throws SQLException;

}
