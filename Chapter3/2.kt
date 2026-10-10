// 2. 초깃값 할당, 초깃값 미루기(lateinit, lazy)

// val data1: Int //최상위 변수는 초깃값을 바로 줘야 함
var data2 = 10

// lateinit var data1: Int //lateinit은 기본 타입에는 사용이 불가능함.
// lateinit val data2: String //lateinit은 var로 선언할 때만 쓸 수 있음.
lateinit var data3: String //lateinit은 참조 타입, var로 선언해 나중에 값을 할당할 수 있음.

val data4: Int by lazy {
    println("data4 초기화 실행")
    10
}
// data4를 처음 사용할 때 초기화, val로 선언했으므로 값 변경은 불가

fun main() {
    println("=== main 시작 ===")

    // lateinit
    data3 = "Hello Kotlin"
    println("data3 : $data3") //출력할 때 $ 사용
    println()

    // lazy
    println("data4 첫 번째 사용")
    println(data4 + 10)
    println("data4 두 번째 사용")
    println(data4 + 10) //val이라서 값 안바뀜, 그냥 둘 다 20만 나옴
    println()

    someFun()

    println("=== main 종료 ===")
}

fun someFun() {
    val data5: Int //지역변수는 바로 초기화 안해도 됨
    data5 = 10 //사용 전엔 초기화 필요

    println("data5 : $data5")
}

class User {
    // val data6: Int //클래스 프로퍼티는 바로 값 초기화or생성자 초기화 필요함(지역변수랑 다름, 클래스랑 최상위는 좀 더 빡빡함)
    val data6: Int = 10
}

//lateinit과 lazy는 변수의 초기화를 나중으로 미룸.(단, 최상위에 선언한 변수는 초깃값 필수)_바로 써먹어야 함
//lateinit: 빈 상자만 준비하기. var로 선언 필요, 참조 타입에서만 사용 가능, 나중에 값 할당.
//lazy: 처음 쓸 때 값 지정하기. (사용되지 않을 값의 낭비를 아끼는 장점이 있음. val 가능, 기본 타입 가능)

//lateinit은 무슨 값을 받을지 모르니 var 필요하고, String?같은 nullable 타입도 사용 불가(null로 미초기화 상태 구분하기 때문)
//최상위, 클래스, 지역 모두 lateinit과 lazy 사용 가능함(특히 바로 값 초기화 필요한 클래스/최상위에서 유용)