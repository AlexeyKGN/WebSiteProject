package dao.impl;


import dao.DepartmentDao;
import model.Department;
import util.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class DepartmentDaoImpl  implements DepartmentDao{

    private static final String DEPARTMENT_INSERT = "INSERT INTO departments"
            + "(department_id,department_name) VALUES(?,?)";

    private static final String DEPARTMENT_GET_BY_ID = "SELECT * FROM departments where id = ?;";

    private static final String DEPARTMENT_DELETE = "DELETE departments where department_id = ?;";

    private static final String DEPARTMENT_UPDATE = "UPDATE departments set department_id=?"
            +"department_name=?;";

    private static final String DEPARTMENT_GET_ALL = "SELECT * FROM departments;";


//    public void deleteDepartment(int id) {
//
//    }

    public void deleteDepartment(Department departmentDelete) {

    }

    public void updateDepartment(Department departmentUpdate) {

    }

    public Department getDepartmentById(int id) {
        return null;
    }


    public void addDepartment(Department departmentAdd) throws SQLException {
        Connection connection = DbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DEPARTMENT_INSERT);
        preparedStatement.setInt(1,departmentAdd.getDepartmentID());
        preparedStatement.setString(2,departmentAdd.getDepartmentName());
        preparedStatement.executeUpdate();
        connection.close();
    }

    public List<Department> getListDepartments() throws SQLException {
        Connection connection = DbConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(DEPARTMENT_GET_ALL);

        List<Department> departmentList = new ArrayList<Department>();
        while(resultSet.next()){
            Department department = new Department();
            department.setDepartmentID(resultSet.getInt("department_id"));
            department.setDepartmentName(resultSet.getString("department_name"));
            departmentList.add(department);
        }
        return departmentList;
    }
}
