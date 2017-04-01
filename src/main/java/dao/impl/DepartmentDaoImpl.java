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





    public int addDepartment(Department departmentAdd) throws SQLException {
        int status = 0;
            Connection connection = DbConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DEPARTMENT_INSERT);
                    preparedStatement.setInt(1,departmentAdd.getDepartmentID());
                    preparedStatement.setString(2,departmentAdd.getDepartmentName());
                status = preparedStatement.executeUpdate();
            connection.close();
        return status;
    }


    public Department deleteDepartment(int deleteId) throws SQLException {
        Connection connection = DbConnection.getConnection();
        Department department = new Department();
            PreparedStatement preparedStatement = connection.prepareStatement(DEPARTMENT_DELETE);
                preparedStatement.setInt(1,deleteId);
             preparedStatement.executeUpdate();
        connection.close();
        return department;
    }

    public void updateDepartment(Department departmentUpdate) {

    }

    public Department getDepartmentById(int id) throws SQLException {
             Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DEPARTMENT_GET_BY_ID);
             preparedStatement.setInt(1,id);
             Department department = new Department();
             ResultSet resultSet = preparedStatement.executeQuery();
             while (resultSet.next()){
                 department.setDepartmentID(resultSet.getInt("departmentId"));
                 department.setDepartmentName(resultSet.getString("departmentName"));
             }
             resultSet.close();
             preparedStatement.close();
        return department;
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
