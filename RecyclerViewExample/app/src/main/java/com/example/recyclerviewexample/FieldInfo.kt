package com.example.recyclerviewexample

class FieldInfo(name: String){
    var drawableId = 0
    var price: String? = null

    fun FoodInfo(drawableId: Int, price: String?) {
        this.drawableId = drawableId
        this.price = price
    }
}