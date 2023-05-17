package br.com.zaniboni.creditapplication.services.impl

import br.com.zaniboni.creditapplication.entities.Customer
import br.com.zaniboni.creditapplication.exceptions.BusinessException
import br.com.zaniboni.creditapplication.repositories.CustomerRepository
import br.com.zaniboni.creditapplication.services.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {

    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

    override fun findById(id: Long): Customer = this.customerRepository.findById(id)
        .orElseThrow{throw BusinessException("Id $id not found") }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
    }
}