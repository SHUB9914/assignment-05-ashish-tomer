package edu.knoldus.mysqlworkder

import edu.knoldus.model.Project
import edu.knoldus.mysqlworker.MysqlWorker
import org.scalatest._

/**
  * Created by ashish on 2/1/17.
  */
class MysqlWorkerTest extends FunSuite{

  test("Insert in department") {
    val query : String = s"insert into department values(67512,'HR');"
    assert(MysqlWorker.pushData(query) == 1)
  }

  test("Delete from department") {
    val query : String = s"delete from department where id = 67512"
    assert(MysqlWorker.deleteData(query) == 1)
  }

  test("Insert in employee") {
    val query : String = s"insert into employee values(67512,'Prabhat', 'Delhi', 934863092, 547, 123);"
    assert(MysqlWorker.pushData(query) == 1)
  }

  test("Insert in client") {
    val query : String = s"insert into client values(612, 123, 'IBM', 'Delhi');"
    assert(MysqlWorker.pushData(query) == 1)
  }

  test("Insert in project") {
    val query : String = s"insert into project values(3904, 67512, 'Scala Geek', 612);"
    assert(MysqlWorker.pushData(query) == 1)
  }

}
