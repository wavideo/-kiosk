package com.example.cafegeung

open class Products(_name:String) {
    open var name:String = _name
    open var price:Int = 0
    open var script:String = """음식에 대한
설명입니다
3줄로 작성해주세요
    """.trimIndent()

    open var opt1:Array<Any> = arrayOf("이름", "옵션1", "옵션2")
    open var opt2:Array<Any> = arrayOf("이름", "옵션1", "옵션2")
    open var opt3:Array<Any> = arrayOf("이름", "옵션1", "옵션2")
    open var opt4:Array<Any> = arrayOf("이름", "옵션1", "옵션2")

    companion object {
        open var currentPage: Int = 0
        open var totalPage: Int = 0
        open var minNum: Int = 0
        open var maxNum: Int = 0
        open var pickedMenu:Array<Any> = arrayOf("A",1)
    }

    open fun menuListView() {
    }
}