package com.example.productflavorapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    val firstName: String,
    val lastName: String
): Parcelable