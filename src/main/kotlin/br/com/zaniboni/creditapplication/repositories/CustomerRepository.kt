package br.com.zaniboni.creditapplication.repositories

import br.com.zaniboni.creditapplication.entities.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>