package com.berkemaktav.basicstoreapp.model

import com.berkemaktav.basicstoreapp.validation.UniqueUsername
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator

@Entity
data class Customer @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String? = "",
    @field:UniqueUsername
    val username:String?="",
    val email:String?=""
)
