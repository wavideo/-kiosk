package com.example.cafegeung
// main의 주요 변수를 각 class에서 인용할 수 없어서,
// 불가피하게 main을 카피한 class를 만들고 - 로직을 옮겼습니다

// main은 MainApp 클래스를 연결하고 start() 메서드를 실행하는 역할만 합니다

fun main() {
    var mainApp = MainApp()
    var productsList = ProductsList()
    mainApp.start()

}