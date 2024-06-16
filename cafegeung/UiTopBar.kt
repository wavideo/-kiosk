package com.example.cafegeung
/* << 상단바 UI 파트 >> */
//

class UiTopBar() {

    // 상단바 고정 블럭
    var cafeSign = "= = = = = = =    C A F E. G E U N G   = = = = = = ="
    var category = "[ A ] 커피            [ B ] 음료         [ C ] 베이커리"
    var line = "= = = = = = = = = = = = = = = = = = = = = = = = = ="

    // 상단바 카테고리 블럭 : 취소 버튼 + 현재 카테고리 안내를 조립하여 구성됩니다
    var menuCoffee = "          ※ 커피 MENU ※"
    var menuBeverage = "          ※ 음료 MENU ※"
    var menuBakery = "         ※ 베이커리 MENU ※"
    var menuBack = "◁ 취소 [0]"
    var menuNull = "         "

    // 취소버튼, 카테고리에 따라 다른 topbar:String을 print하는 메서드입니다
    var backCheck: Boolean = false
    var categoryCheck: Char = 'A'

    fun view() {
        var a: String = if (backCheck) {
            menuBack
        } else {
            menuNull
        }
        var b: String = when (categoryCheck) {
            'A' -> menuCoffee
            'B' -> menuBeverage
            'C' -> menuBakery
            else -> ""
        }
        var topbar: String = """
           $cafeSign
           $a$b
           $category
           $line
        """.trimIndent()

        println(topbar)
    }

    fun categoryChange(){
        when (MainApp.myChoice) {
            "A", "a", "커피" -> {
                MainApp.top.backCheck = false
                MainApp.top.categoryCheck = 'A'
                MainApp.top.view()
            }

            "B", "b", "음료" -> {
                MainApp.top.backCheck = false
                MainApp.top.categoryCheck = 'B'
                MainApp.top.view()
            }

            "C", "c", "베이커리" -> {
                MainApp.top.backCheck = false
                MainApp.top.categoryCheck = 'C'
                MainApp.top.view()
            }

            else -> {
                println("[system] 오류입니다 처음으로 돌아갑니다")
                MainApp.top.backCheck = false
                MainApp.top.categoryCheck = 'A'
                MainApp.top.view()
            }
        }
    }

    init {
        view()
    }
}