package com.umestudio.moestrip.favorite.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "tablefavorites")
data class MuseumEntity (
    @ColumnInfo(name = "name")var name: String,
    @ColumnInfo(name = "address")var address: String,
    @ColumnInfo(name = "detail")var detail: String,
    @ColumnInfo(name = "transjakarta")var transjakarta: String,
    @ColumnInfo(name = "commuterline")var commuterline: String,
    @ColumnInfo(name = "trainstation")var trainstation: String,
    @ColumnInfo(name = "mrtstation")var mrtstation: String,
    @ColumnInfo(name = "photo")var photo: String,
    @ColumnInfo(name = "status")var status: Boolean,
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id")var id: Long= 0
):Parcelable