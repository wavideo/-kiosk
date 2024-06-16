package com.example.cafegeung

class UiPick() {

    companion object {
        var pickedIns: Products = ProductsList.pdCoffeeList[0]

        fun getInstance(cat: String, num: Int) {
            pickedIns = when (cat) {
                "A" -> ProductsList.pdCoffeeList[num - 1]
                "B" -> ProductsList.pdBeverageList[num - 1]
                else -> ProductsList.pdBakeryList[num - 1]
            }
        }

        fun view() {
            getInstance(Products.pickedMenu[0].toString(), Products.pickedMenu[1] as Int)
            println(
                """□ ${pickedIns.name}
${pickedIns.script}
□ 가격 : ${pickedIns.price}원
        [ 1 ] 선택        |        [ 2 ] 취소
= = = = = = = = = = = = = = = = = = = = = = = = = =""".trimIndent()
            )
        }
    }
}