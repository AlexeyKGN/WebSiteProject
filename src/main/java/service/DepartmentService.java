package service;


import model.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentService{

    void updateDepartment(Department department);

    void addDepartment(Department department);

    List<Department> getAll() throws SQLException;
}
