package com.example.HM_7_3

import java.io.Serializable

data class Character(
    var image: String?="https://s3.amazonaws.com/www-inside-design/uploads/2018/01/rick-morty-sq.jpg",
    var status: String? = "Alive",
    var name: String? = "Name"
): Serializable