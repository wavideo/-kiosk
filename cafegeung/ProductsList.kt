package com.example.cafegeung

class ProductsList() {
    companion object {
        var pdCoffeeList: MutableList<PdCoffee> = mutableListOf()
        var pdBeverageList: MutableList<PdBeverage> = mutableListOf()
        var pdBakeryList: MutableList<PdBakery> = mutableListOf()

        init {
            //
            // 커피를 11종 추가했습니다
            //

            pdCoffeeList.add(PdCoffee("아메리카노").apply
            {
                price = 1500
                script = """원두로 추출한 에스프레소에 물을 더해,
풍부한 바디감을 느낄 수 있는
스탠다드 커피.           
        """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("콜드브루").apply
            {
                price = 3300
                script = """차가운 물에 장시간 우려내
깔끔한 목넘김을 느낄 수 있는 콜드브루.
            
        """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "콜드브루라떼"
                price = 3800
                script = """콜드브루에 고소한 우유를 섞어,
깔끔함과 부드러움을 잡은 라떼.
            
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "카페라떼"
                price = 2700
                script = """진한 에스프레소와 부드러운 우유가
어우러져 고소한 풍미를 완성한 라떼.
            
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "카페모카"
                price = 3700
                script = """초코를 만나 풍부해진 에스프레소와
고소한 우유, 부드러운 휘핑크림까지 더해 달콤하게 즐기는 커피.
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "카푸치노"
                price = 2700
                script = """에스프레소 위에 올려진 우유 거품,
그리고 시나몬 파우더로 완성한
조화로운 맛의 커피.
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "카라멜마끼야또"
                price = 3500
                script = """폼 밀크 속에 진한 에스프레소와
달콤한 카라멜을 가미해
부드럽게 즐기는 커피.
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "에스프레소"
                price = 1500
                script = """커피 원두의 향미를
온전히 즐길 수 있는 에스프레소
            
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "티라미수라떼"
                price = 3900
                script = """에스프레소와 티라미수 소스 & 우유
그리고 풍미를 더해주는 달달한 크림까지
곁들여 완성한 티라미수 라떼.
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "연유라떼"
                price = 3700
                script = """향기로운 에스프레소 샷,
부드러운 우유 그리고 달콤한 연유가
조화롭게 어우러진 라떼
            """.trimIndent()
            })
            pdCoffeeList.add(PdCoffee("").apply
            {
                name = "큐브라떼"
                price = 3900
                script = """연유를 섞은 라떼에 에스프레소를 얼린
커피큐브를 올려, 녹을수록 더 진한
커피가 느껴지는 라떼.
            """.trimIndent()
            })

            //
            // 음료를 7종 추가했습니다
            //

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "체리콕"
                price = 3000
                script = """체리의 새콤함과 청량감을
동시에 즐길 수 있는
환상적인 에이드.
            """.trimIndent()
            })

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "청포도에이드"
                price = 3500
                script = """산뜻한 청포도와 상쾌한
탄산의 달달한 조화가
인상적인 에이드.
            """.trimIndent()
            })

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "자몽에이드"
                price = 3500
                script = """자몽의 달콤쌉싸름한 맛과
탄산의 톡쏘는 목넘김이 어우러진
트로피컬 에이드.
            """.trimIndent()
            })

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "블루레몬에이드"
                price = 3500
                script = """레몬에이드의 상큼한 청량감에
블루큐라소의 진한 향미를 더한 에이드.
                    
            """.trimIndent()
            })

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "레몬에이드"
                price = 3500
                script = """시트러스향 가득한 레몬의 상큼함과
톡쏘는 탄산의 상쾌함이 만난
청량 에이드.
            """.trimIndent()
            })

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "라임모히또"
                price = 3800
                script = """상큼한 라임과 달콤한 향기의
애플민트가 어우러져 상쾌함을
한잔에 가득 채운 모히또 음료.
            """.trimIndent()
            })

            pdBeverageList.add(PdBeverage("").apply
            {
                name = "아이스티"
                price = 3000
                script = """달콤한 복숭아의 은은한
향이 어우러진 시원한 여름철 인기 음료.
            """.trimIndent()
            })


            //
            // 빵을 7종 추가했습니다
            //

            pdBakeryList.add(PdBakery("").apply
            {
                name = "버터 소금빵"
                price = 3200
                script = """고소한 프랑스산 프레지덩 버터를
듬뿍넣어 더 부드럽고 짭쪼롬하게
즐길 수 있는 베이커리 메뉴
            """.trimIndent()
            })

            pdBakeryList.add(PdBakery("").apply
            {
                name = "크로와상"
                price = 3200
                script = """바삭하고 부드러운 식감에
고소한 버터향을 가득 담은
베이커리 메뉴.
            """.trimIndent()
            })

            pdBakeryList.add(PdBakery("").apply
            {
                name = "크로플"
                price = 2800
                script = """버터풍미가 가득한 크루와상의
바삭함과 와플의 부드러움을 합친
겉바속촉 베이커리 메뉴.
            """.trimIndent()
            })
        }
    }
}