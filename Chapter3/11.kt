// 11. 조건문 when : when문 사용 예(switch랑 비슷한 문법, 근데 else도 사용 가능)
fun main(){
    var data = 10 
    when(data){
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }
}