package br.com.zaniboni.creditapplication.exceptions

data class BusinessException(override val message: String?) : RuntimeException(message)