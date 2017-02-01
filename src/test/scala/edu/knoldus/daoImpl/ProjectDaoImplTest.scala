package edu.knoldus.daoImpl

import edu.knoldus.model.Project
import org.scalatest.FunSuite

/**
  * Created by ashish on 2/1/17.
  */
class ProjectDaoImplTest extends FunSuite{

  test("test createProject") {
    val project = Project(3498, 67512, "Brahmos", 612)
    val projectDaoImpl = new ProjectDaoImpl

    assert(projectDaoImpl.createProject(project))
  }

  test("test updateProject") {
    val project = Project(3498, 67512, "Navaratan", 612)
    val projectDaoImpl = new ProjectDaoImpl

    assert(projectDaoImpl.updateProject(project))
  }

  test("test getProject()") {
    val projectId = 3904
    val project = Project(3904, 67512, "Scala Geek", 612)
    val projectDaoImpl = new ProjectDaoImpl

    assert(projectDaoImpl.getProject(projectId) == project)
  }

  test("test removeProject") {
    val projectId = 3498
    val projectDaoImpl = new ProjectDaoImpl

    assert(projectDaoImpl.removeProject(projectId))
  }
}
