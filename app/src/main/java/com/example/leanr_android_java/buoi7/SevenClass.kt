package com.example.leanr_android_java.buoi7

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

class SevenClass() :Parcelable {
    var title:String=""
    var content:String=""

    constructor(parcel: Parcel) : this() {
        title = parcel.readString().toString()
        content = parcel.readString().toString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(content)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SevenClass> {
        override fun createFromParcel(parcel: Parcel): SevenClass {
            return SevenClass(parcel)
        }

        override fun newArray(size: Int): Array<SevenClass?> {
            return arrayOfNulls(size)
        }
    }
}
class Seven2Data :Serializable{
    var title:String=""
    var content:String=""
}