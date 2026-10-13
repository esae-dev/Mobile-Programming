// 3. 함수타입 별칭
typealias MyFunType = (Int, Int) -> Boolean //C의 typedef같은 것

fun main() {
    val someFun: MyFunType = { no1: Int, no2: Int ->
        no1 > no2
    }
    println(someFun(10, 20))
    println(someFun(20, 10))
}