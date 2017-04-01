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


public class AddDepartments extends HttpServlet {
    private DepartmentService departmentService = new DepartmentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("departmentName");
        Department department = new Department();
        department.setDepartmentName(name);
        try {
            int status = departmentService.addDepartment(department);
            if(status > 0){
                out.println("<p>Record Saved successfully</p>");
            }else{
                out.println("Sorry! Unable to save record");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
              req.setAttribute("department",department);
              req.getRequestDispatcher("/addDepartment.jsp").forward(req,resp);

   }
}
