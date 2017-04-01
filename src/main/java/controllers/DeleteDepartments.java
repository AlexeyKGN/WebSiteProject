package controllers;

import model.Department;
import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class DeleteDepartments  extends HttpServlet{
    private DepartmentService departmentService= new DepartmentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int departmentId = Integer.parseInt(req.getParameter("departmentID"));

        Department departmentDelete = new Department();
        try {
            departmentDelete = departmentService.deleteDepartment(departmentId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("departmentDelete",departmentDelete);
        req.getRequestDispatcher("/delete.jsp").forward(req,resp);

    }
}
