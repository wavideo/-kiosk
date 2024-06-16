package com.example.cafegeung

class PdBeverage(_name:String):Products(_name) {
    override var name:String = _name
    override var price:Int = 0
    override var script:String = """
        음식에 대한
        설명입니다
        3줄로 작성해주세요
    """.trimIndent()

    override var opt1:Array<Any> = arrayOf("종류", "ICE", "HOT")
    override var opt2:Array<Any> = arrayOf("얼음", "보통", "많이")
    override var opt3:Array<Any> = arrayOf("사이즈", "TallSize", "GrandeSize")
    override var opt4:Array<Any> = arrayOf("당도", "100%", "50%")

    override fun menuListView() {
        totalPage = ((ProductsList.pdBeverageList.size+1) / 5)

        if (currentPage == totalPage) {
            maxNum = ProductsList.pdBeverageList.size - 1
        } else {
            maxNum = 4 + currentPage * 5
        }

        minNum= currentPage * 5

        for (i in minNum..maxNum) {
            var I = ProductsList.pdBeverageList[i]
            println("[ ${1 + i - currentPage * 5} ] ${I.name} (${I.price}원)")
        }

        if((maxNum+1)%5 != 0){
            for (i in 0..(4-((maxNum+1)%5))){
                println("")
            }
        }
    }

}