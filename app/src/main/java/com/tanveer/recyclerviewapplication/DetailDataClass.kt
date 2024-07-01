package com.tanveer.recyclerviewapplication

data class DetailDataClass(
    var name: String? = "",
    var rollNo: Int? = 0,
    var course: String? = "",
){
    override fun toString():String{
        return "$name"
    }
}
