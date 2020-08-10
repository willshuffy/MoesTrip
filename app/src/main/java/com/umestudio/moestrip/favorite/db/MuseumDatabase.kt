package com.umestudio.moestrip.favorite.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.umestudio.moestrip.favorite.entity.MuseumEntity


@Database(entities = arrayOf(MuseumEntity::class), version = 1)
abstract class MuseumDatabase: RoomDatabase() {


    abstract fun museumDao(): MuseumDao

    companion object{
        private var INSTANCE: MuseumDatabase? = null

        fun getInstance(context: Context): MuseumDatabase? {

            if (INSTANCE == null){
                synchronized(MuseumDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        MuseumDatabase::class.java, "museumdata.db")
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}