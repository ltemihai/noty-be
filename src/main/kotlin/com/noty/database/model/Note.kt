package com.noty.database.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.bson.types.ObjectId
import java.time.Instant

@Document
data class Note(
    @Id
    val id: ObjectId = ObjectId.get(),
    val title: String,
    val content: String,
    val color: Long,
    val createdAt: Instant,
    val ownerId: ObjectId,
)