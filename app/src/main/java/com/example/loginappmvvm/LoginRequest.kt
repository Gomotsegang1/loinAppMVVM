package com.example.loginappmvvm

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName


    data class LoginRequest(
        @SerializedName("email")
        var email: String,
        @SerializedName("password")
        var password: String
    )
