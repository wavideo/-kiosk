package com.example.cafegeung

class UiMenuList() {

    companion object {
        var uiBlock = UiBlock()
        var pdCoffee = PdCoffee("")
        var pdBeverage = PdBeverage("")
        var pdBakery = PdBakery("")
        var categoryCheck: Char = 'A'

        // 메인화면 아랫줄 button 블럭 내 list button
        // 전체/현재 페이지 수에 따라 Int 변경, 버튼 노출여부 결정하여 조립
        var listNext:String = ""
        var listPrevious:String = "                     "
        fun buttonMenulist():String {
            if (Products.currentPage == 0) {
                listPrevious = "                     "
            } else {
                listPrevious = "◀ 이전 [10]           "
            }

            if(Products.currentPage == Products.totalPage){
                listNext = ""
            } else {
                listNext = "           다음 [20] ▶"
            }
            var listNumber = "page ${Products.currentPage+1}/${Products.totalPage+1}"
            return "${listPrevious}${listNumber}${listNext}\n= = = = = = = = = = = = = = = = = = = = = = = = = ="
        }

        fun view() {
            when(MainApp.top.categoryCheck){
                'A' -> {
                    println(uiBlock.noticeMenulist)
                    pdCoffee.menuListView()
                    println(buttonMenulist())
                }
                'B' -> {
                    println(uiBlock.noticeMenulist)
                    pdBeverage.menuListView()
                    println(buttonMenulist())
                }
                'C' -> {
                    println(uiBlock.noticeMenulist)
                    pdBakery.menuListView()
                    println(buttonMenulist())
                }
            }
        }

        init {
            view()
        }

        fun categoryChange() {
            when (MainApp.myChoice) {
                "A", "a", "커피" -> {
                    Products.currentPage = 0
                    view()
                }

                "B", "b", "음료" -> {
                    Products.currentPage = 0
                    view()
                }

                "C", "c", "베이커리" -> {
                    Products.currentPage = 0
                    view()
                }

                else -> {
                    println("[system] 오류입니다 처음으로 돌아갑니다")
                    Products.currentPage = 0
                    MainApp.top.categoryCheck = 'A'
                    view()
                }
            }
        }

        fun pageChange() {
            if(Products.currentPage == Products.totalPage && MainApp.myChoice == "20") {
                view()
                return
            } else if (Products.currentPage == 0 && MainApp.myChoice == "10") {
                view()
                return
            }

            when (MainApp.myChoice) {
                "10" -> {
                    Products.currentPage--
                }

                "20" -> {
                    Products.currentPage++
                }
            }
            view()
        }

    }
}