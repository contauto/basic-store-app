package com.berkemaktav.basicstoreapp.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Product @JvmOverloads constructor (
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    val id: Long?=0,
    val name:String="",
)