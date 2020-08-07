package com.umestudio.moestrip.recyclerview.models

import android.os.Parcel
import android.os.Parcelable

data class Museum(

    var name: String? ="",
    var address: String? ="",
    var detail: String? ="",
    var transjakarta: String? ="",
    var commuterline: String? ="",
    var trainstation: String? ="",
    var mrtstation: String? ="",
    var photo: String? =""
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(address)
        parcel.writeString(detail)
        parcel.writeString(transjakarta)
        parcel.writeString(commuterline)
        parcel.writeString(trainstation)
        parcel.writeString(mrtstation)
        parcel.writeString(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Museum> {
        override fun createFromParcel(parcel: Parcel): Museum {
            return Museum(parcel)
        }

        override fun newArray(size: Int): Array<Museum?> {
            return arrayOfNulls(size)
        }
    }
}