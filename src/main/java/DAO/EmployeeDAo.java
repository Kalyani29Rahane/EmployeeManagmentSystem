package DAO;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import controller.Employee;
import service.EmployeeService;
import model.Employee1;

public class EmployeeDAo {
	

    public int insert(Employee1 emp) throws Exception {
        Connection con = EmployeeService.getConnection();
        String sql = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, emp.getId());
        ps.setString(2, emp.getName());
        ps.setDouble(3, emp.getSalary());
        ps.setString(4, emp.getDepartment());
        ps.setString(5, emp.getCity());
        ps.setString(6, emp.getPosition());
        ps.setDate(7, Date.valueOf(emp.getHireDate()));
        ps.setString(8, emp.getEmail());
        ps.setString(9, emp.getAddress());
        ps.setString(10, emp.getCompanyName());
        return ps.executeUpdate();
    }

    public int update(Employee1 emp) throws Exception {
        Connection con = EmployeeService.getConnection();
        String sql = "UPDATE employee SET name=?, salary=?, department=?, city=?, position=?, hire_date=?, email=?, address=?, company_name=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, emp.getName());
        ps.setDouble(2, emp.getSalary());
        ps.setString(3, emp.getDepartment());
        ps.setString(4, emp.getCity());
        ps.setString(5, emp.getPosition());
        ps.setDate(6, Date.valueOf(emp.getHireDate()));
        ps.setString(7, emp.getEmail());
        ps.setString(8, emp.getAddress());
        ps.setString(9, emp.getCompanyName());
        ps.setInt(10, emp.getId());
        return ps.executeUpdate();
    }

    public int delete(int id) throws Exception {
        Connection con = EmployeeService.getConnection();
        String sql = "DELETE FROM employee WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate();
    }

    public List<Employee1> getAllEmployees() throws Exception {
        List<Employee1> list = new ArrayList<>();
        Connection con = EmployeeService.getConnection();
        String sql = "SELECT * FROM employee";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Employee1 e = new Employee1();
            e.setId(rs.getInt(1));
            e.setName(rs.getString(2));
            e.setSalary(rs.getDouble(3));
            e.setDepartment(rs.getString(4));
            e.setCity(rs.getString(5));
            e.setPosition(rs.getString(6));
            e.setHireDate(rs.getDate(7).toString());
            e.setEmail(rs.getString(8));
            e.setAddress(rs.getString(9));
            e.setCompanyName(rs.getString(10));
            list.add(e);
        }
        return list;
    }
}

