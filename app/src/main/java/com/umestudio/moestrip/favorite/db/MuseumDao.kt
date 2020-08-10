package com.umestudio.moestrip.favorite.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.umestudio.moestrip.favorite.entity.MuseumEntity
import io.reactivex.Flowable


@Dao
interface MuseumDao {
    @Query("SELECT * from tablefavorites")
    fun getAll(): Flowable<List<MuseumEntity>>

    @Insert(onConflict = REPLACE)
    fun insert (museumfavorite: MuseumEntity)

    @Delete
    fun delete (museumfavorite: MuseumEntity)

}