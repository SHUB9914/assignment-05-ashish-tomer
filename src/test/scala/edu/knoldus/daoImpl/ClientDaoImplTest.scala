package edu.knoldus.daoImpl

import edu.knoldus.model.Client
import org.scalatest.FunSuite

/**
  * Created by ashish on 2/1/17.
  */
class ClientDaoImplTest extends FunSuite{

  test("test createClient() ") {
    val client = Client(543903L,3904, "Bombay Rockers", "Mumbai")
    val clientDaoImpl = new ClientDaoImpl
    assert(clientDaoImpl.createClient(client))
  }

  test("test updateClient()") {
    val client = Client(543903L,3904, "Kolkata Bloomers", "Kolkata")
    val clientDaoImpl = new ClientDaoImpl
    assert(clientDaoImpl.updateClient(client))
  }

  test("test getClient() ") {
    val clientId = 543903L
    val client = Client(543903L,3904, "Kolkata Bloomers", "Kolkata")
    val clientDaoImpl = new ClientDaoImpl
    assert(clientDaoImpl.getClient(clientId) == client)
  }

  test("test removeClient() ") {
    val clientId = 543903L
    val clientDaoImpl = new ClientDaoImpl
    assert(clientDaoImpl.removeClient(clientId))
  }
}
