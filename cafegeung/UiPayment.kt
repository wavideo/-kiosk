package com.example.cafegeung

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class UiPayment {

    companion object {
        var noticePayment = "              ※ 이대로 결제하시겠습니까? ※"
        var noticeComplete = "               ※ 결제가 완료되었습니다 ※"
        var noticeNoMoney = "                 ※ 잔액이 부족합니다 ※"
        var notice = noticePayment

        open fun view() {
            MainApp.top.view()
            println(notice)
            println(
                """□ 결제금액
            
${UiPick.pickedIns.price}원

□ 현재 카드잔액 : ${MainApp.myWallet}원
        [ 1 ] 결제        |        [ 2 ] 취소
= = = = = = = = = = = = = = = = = = = = = = = = = =
        """.trimIndent()
            )
        }
        open fun pay() {
            if (MainApp.myWallet < UiPick.pickedIns.price) {
                notice = noticeNoMoney
                view()
            } else {
                notice = noticeComplete
                MainApp.myWallet -= UiPick.pickedIns.price
                view()

                return
            }
        }
    }
}