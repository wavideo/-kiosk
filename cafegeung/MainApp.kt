package com.example.cafegeung

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// main의 주요 변수를 각 class에서 인용할 수 없어서,
// 불가피하게 main을 카피한 class를 만들고 - 로직을 옮겼습니다

// main은 MainApp 클래스를 연결하고 start() 메서드를 실행하는 역할만 합니다

class MainApp() {

    // 모든 class에서 자유롭게 인용하는 중요한 변수
    companion object {
        // 메뉴정보 DB 추가
        var productList = ProductsList()

        var top = UiTopBar()
        var middle = UiMenuList()
        var myStep:String = "MENULIST"
        var myWallet:Int = 50000
        lateinit var myChoice: String // readLine으로 선택한 숫자
        lateinit var isMatchChoiceList: List<String> // Choice와 발동조건의 비교를 위한 list
    }

    // 키오스크가 실행되면 순차적으로 로직 실행
    fun start() {
        while (true) {

            top.view()
            UiMenuList.view()

            while (myStep == "MENULIST") {
                myChoice = readLine()!!.toString()

                // A,B,C를 선택했다면 -> 카테고리를 바꿉니다.
                isMatchChoiceList = listOf("A", "a", "B", "b", "C", "c", "커피", "음료", "베이커리")
                if (isMatchChoiceList.contains(myChoice)) {
                    Products.pickedMenu[0] = myChoice.toString()
                    myStep = "MENULIST"
                    top.categoryChange()
                    UiMenuList.categoryChange()
                }
                isMatchChoiceList = listOf("10", "20", "<", ">")
                if (isMatchChoiceList.contains(myChoice) && myStep == "MENULIST") {
                    top.view()
                    UiMenuList.pageChange()
                }
                isMatchChoiceList = listOf("1", "2", "3", "4", "5")
                if (isMatchChoiceList.contains(myChoice) && myChoice.toInt() <= 1+Products.maxNum - Products.minNum && myStep == "MENULIST") {
                    Products.pickedMenu[1] = Products.minNum.toInt() + myChoice.toInt()
                    top.backCheck = true
                    top.view()
                    UiPick.view()
                    myStep = "PICK"
                    break
                }
            }
            myChoice = readLine()!!.toString()

            while (myStep == "PICK") {
                when (myChoice) {
                    "0", "2" -> {
                        top.backCheck= false
                        myStep = "MENULIST"
                        break
                    }

                    "1" -> {
                        UiPayment.view()
                        myStep = "PAYMENT"
                    }

                    else -> {
                        myChoice = readLine()!!.toString()
                    }

                }
            }
//
//            while (myStep == "OPTION") {
//                when (myChoice) {
//                    "0" -> {
//                        top.backCheck= false
//                        myStep = "MENULIST"
//                        break
//                    }
//
//                    "5" -> {
//                        top.view()
//                        UiPayment.view()
//                        myStep = "PAYMENT"
//                    }
//
//                    else -> {
//                        myChoice = readLine()!!.toString()
//                    }
//
//                }
//            }
            myChoice = readLine()!!.toString()

            while (myStep == "PAYMENT") {
                when (myChoice) {
                    "0", "2" -> {
                        top.backCheck= false
                        myStep = "MENULIST"
                        break
                    }

                    "1" -> {
                            UiPayment.pay()
                    }
                    else -> {
                        myChoice = readLine()!!.toString()
                    }
                }
                top.backCheck= false
                myStep = "MENULIST"
                break
            }
        }
    }
}