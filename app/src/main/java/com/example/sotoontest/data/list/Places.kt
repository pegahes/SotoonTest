package com.example.sotoontest.data.list

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "places")
data class Places (
    @PrimaryKey val id: String,
    val dist: Float?,
    val name: String?,
    val phone: String?,
    val country: String?,
    val streetName: String?,
    val streetNumber: String?,
    val freeformAddress: String?,
    val localName: String?
        )
