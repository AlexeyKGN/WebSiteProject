package controllers;


import model.Department;
import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowDepartments extends HttpServlet{
    private DepartmentService departmentService= new DepartmentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Department> departmentList = new ArrayList<Department>();
        try {
            departmentList = departmentService.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("departmentList",departmentList);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
