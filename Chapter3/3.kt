// 3. 데이터타입

// 1. 기본 데이터 타입
val a1: Byte = 0b00001011
val a2: Int = 123
val a3: Short = 123
val a4: Long = 10L //뒤에 L 붙임
val a5: Double = 10.0 //소수점 들어감
val a6: Float = 10.0f //소수점과 f 모두 들어감(코틀린은 실수 기본이 double이기 때문)
val a7: Boolean = true
val a8: Char = 'a'

// 2. 문자열 타입
val a9: String = "Hello \nWorld"
val a10: String = """
    Hello
    World
""".trimIndent()  // 여러 줄 문자열: """, trimIndent()로 앞 줄 공백 제거

// 3. Any 타입 : 모든 타입의 최상위 타입, null 불허용(var은 변수를 선언하는거고, Any는 그 자료형이 뭔지를 답하는 것)
val a11: Any = 10
val a12: Any = "Hello"

class User
val a13: Any = User() 
// User() : User 클래스의 객체 생성,  Any 타입에는 User 객체도 저장 가능(진짜 다 가능)

// 4. Null 허용과 불허용
var data1: Int = 10
// data1 = null // Int는 null 불허용
var data2: Int? = null // 타입 뒤에 ?를 붙이면 null 허용(따라서 lateinit에서는 사용 불가)
// data2 = null // 가능

// 5. 모든 데이터를 객체처럼 사용
fun someFun() {
    var data3: Int = 10
    var data4: Int? = null   // 현재 유효한 값이 없음을 의미

    data3 = data3 + 10
    println("data3 + 10 = $data3")

    data3 = data3.plus(10)  // Int도 객체처럼 메서드 사용 가능
    println("data3.plus(10) = $data3")
    println("data4 = $data4")
}

fun main() {
    println("===== 기본 데이터 타입 =====")
    println("Byte    : $a1")
    println("Int     : $a2")
    println("Short   : $a3")
    println("Long    : $a4")
    println("Double  : $a5")
    println("Float   : $a6")
    println("Boolean : $a7")
    println("Char    : $a8") //출력할 땐 $
}

//기본 데이터타입 8가지, 문자열 타입, Any 타입, Null 허용/불허용
//Int? = null을 기억해두도록
//코틀린은 모든 데이터를 객체처럼 활용함.