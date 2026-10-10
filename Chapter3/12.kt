// 12. 조건문 when : 문자열도 조건에 집어넣을 수 있음
fun main(){
    var data = "hello"
    when(data){
        "hello" -> println("data is hello")
        "world" -> println("data is world")
        else -> {
            println("data is not valid data")
        }
    }
}