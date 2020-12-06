package com.example.madlevel5task1.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "noteTable")
data class Note(

    @ColumnInfo(name = "note")
    var title: String,

    @ColumnInfo(name = "note")
    var lastUpdated: Date,

    @ColumnInfo(name = "note")
    var text: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)