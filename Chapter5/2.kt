// 2. 람다 함수의 반환문

fun main() { // 매개변수가 2개인 람다 함수(함수 자체엔 이름이 없음, fun같은거)
    val some = { no1: Int, no2: Int ->
        println("in lambda function")
        no1 * no2 // 람다 함수는 마지막 표현식의 결과가 반환값_2장 lazy에서의 10같은거라 생각
    }
    println("result : ${some(10, 20)}") // 람다 함수 호출
}
//앱같은거 만들 때, 공통 기능을 여러 버튼에 만드는게 비효율적인 상황같은 것에 맞추기 좋음