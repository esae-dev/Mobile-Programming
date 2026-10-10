// 14. 조건문 when : 조건문 명시한 예
// 데이터를 명시하지 않고 조건문 명시가능
fun main(){
    var data = 10
    when{
        data <= 0 -> println("data is <= 0")
        data > 100 -> println("data is > 100")
        else -> println("data is valid")
    }
}