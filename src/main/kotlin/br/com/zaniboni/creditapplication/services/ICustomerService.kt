package br.com.zaniboni.creditapplication.services

import br.com.zaniboni.creditapplication.entities.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)
}