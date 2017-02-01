package edu.knoldus.daoImpl

import edu.knoldus.model.Employee
import org.scalatest.FunSuite

/**
  * Created by ashish on 2/1/17.
  */
class EmployeeDaoImplTest extends FunSuite{

  test("test create employee") {
    val employee = Employee(34621L, "Vijay Deenanath", "Mandwa", 7046948290L, 546L, 3904L)
    val employeeDaoImpl  = new EmployeeDaoImpl

    assert(employeeDaoImpl.createEmployee(employee))
  }

  test("test updateEmployee()") {
    val employee = Employee(34621L, "Vijay Deenanath", "Mumbai", 9866948290L, 546L, 3904L)
    val employeeDaoImpl  = new EmployeeDaoImpl

    assert(employeeDaoImpl.updateEmployee(employee))
  }

  test("test getEmployee()") {
    val empId = 67512L
    val employeeDaoImpl  = new EmployeeDaoImpl
    val employee = Employee(67512, "Prabhat", "Delhi", 934863092, 547, 123)

    assert(employeeDaoImpl.getEmployee(empId) == employee)
  }

  test("test getEmployeesByDeptId") {
    val deptId = 547L
    val employeeDaoImpl  = new EmployeeDaoImpl
    val employee = Employee(67512, "Prabhat", "Delhi", 934863092L, 547, 123)

    assert(employeeDaoImpl.getEmployeesByDeptId(deptId) == List(employee)) //Only one employee in that department
  }

  test("test getEmployeesByProjectId") {
    val proectId = 123L
    val employeeDaoImpl  = new EmployeeDaoImpl
    val employee = Employee(67512, "Prabhat", "Delhi", 934863092L, 547, 123)

    assert(employeeDaoImpl.getEmployeesByProjectId(proectId) == List(employee)) //Only one employee in that department
  }

  test("test removeEmployee()") {
    val empId = 34621L
    val employeeDaoImpl  = new EmployeeDaoImpl

    assert(employeeDaoImpl.removeEmployee(empId))
  }
}
