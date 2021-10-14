package com.example.recyclerview_nisrina_23

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Students (
    val imgStudents:Int,
    val nameStudents: String,
    val descStudents: String,
    ): Parcelable

