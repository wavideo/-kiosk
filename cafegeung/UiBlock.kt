package com.example.cafegeung

class UiBlock {

    //print 메서드, 텍스트 갯수 1~3개까지 오버로딩
    fun pr(text: String) {
        println(text)
    }
    fun pr(text: String, text2: String) {
        println("$text$text2")
    }
    fun pr(text: String, text2: String, text3: String) {
        println("$text$text2$text3")
    }
    var line = "= = = = = = = = = = = = = = = = = = = = = = = = = ="

    /* << 메인화면 UI 파트 >> */

    // 메인화면 첫줄 안내문구 블럭
    // Menulist - Pick - Option - Payment - Complete 단계 확인 후, 해당하는 notice 제공
    var noticeMenulist = "                 ※ 메뉴를 선택하세요 ※"
    var noticePick = "             ※ 이 메뉴로 선택하시겠습니까? ※"
    var noticeOption = "              ※ 옵션을 변경하시겠습니까? ※"
    var noticePayment = "              ※ 이대로 결제하시겠습니까? ※"
    var noticeComplete = "               ※ 결제가 완료되었습니다 ※"

    // 메인화면 아랫줄 button 블럭
    // Menulist - Pick - Option - Payment - Complete 단계 확인 후, 해당하는 button 제공
    var buttonPick = "        [ 1 ] 선택        |        [ 2 ] 취소"
    var buttonOption = "                 [ 5 ] 이대로 주문 "
    var buttonOptionShot:String = "        ※ 샷 추가를 얼마나 할 지 입력해주세요 ※"
    var buttonPayment = "        [ 1 ] 결제        |        [ 2 ] 취소"
    var buttonComplete = "                  [ 0 ] 처음으로 "

    /* << 메인화면 정보 : Pick 단계  >> */
    // 선택한 메뉴의 프로퍼티를 반영하여 정보 출력
    var pickedName = "아메리카노"
    var pickedScript:String = "정말 시원한 커피!\n"+
            "\n" +
            "" // 설명은 반드시 3줄 차지
    var pickdePrice: Int = 3000

    var pickName = "□ 제품명 : $pickedName"
    var pickScript = pickedScript
    var pickPrice = "□ 가격 : ${pickdePrice}원"

    /* << 메인화면 정보 : Option 단계 >> */
    // 선택한 메뉴에 알맞는 옵션을 스위칭
    var shotNum:Int = 0

    var SellectOptIceCheck:String = "[ 1 ] 종류 :  ■ ICE  □ HOT"
    var SellectOptIceAmount:String = "[ 2 ] 얼음양 : ■ 보통  □ 많이" // HOT이면 표기하지 않음
    var SellectOptSize:String = "[ 2 ] 사이즈 : ■ TallSize  □ GreandeSize(+1000원)"
    var SellectOptShot:String = "[ 3 ] 샷 추가 (1샷에 +500원)  |  현재 ${shotNum}샷"

    /* << 메인화면 정보 : Pick 단계  >> */
    // 변경한 옵션을 반영하여 정보 출력
    var pickedOptionA:String = "ICE, 얼음 많이"
    var pickedOptionB:String = "Tall Size, 2샷 추가"

    var pickOption = "□ 선택한 옵션\n" +
            "$pickedOptionA\n"+
            "$pickedOptionB" // 옵션 안내는 반드시 3줄 차지
    var pickPriceFinal = "□ 결제금액 : ${pickdePrice}원"
    var pickPriceFinalOpt = "□ 결제금액 : ${pickdePrice}원 (옵션변경)"
}