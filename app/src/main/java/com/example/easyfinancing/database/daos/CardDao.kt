package com.example.easyfinancing.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.easyfinancing.database.models.CardModel

@Dao
interface CardDao {

    @Insert
    suspend fun insertCard(card : CardModel)

    @Query("SELECT * FROM CardModel")
    suspend fun getAllCard() : MutableList<CardModel>

    @Delete
    suspend fun deleteCard(card: CardModel)
}