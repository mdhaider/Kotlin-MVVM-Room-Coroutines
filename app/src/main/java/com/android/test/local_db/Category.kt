package com.android.test.local_db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Category(
    @PrimaryKey
    val id: String,
    val categoryName: String,
    val categoryDescription: String
)
