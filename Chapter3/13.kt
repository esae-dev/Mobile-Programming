// 13. 조건문 when : 다양한 유형의 조건 제시
fun main(){
    var data: Any = 10
    when(data){
        is String -> println("data is String") 
        // is : 타입 확인
        20,30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10") 
        // in : 범위 지정 연산자
        else -> println("data is not valid")
    }
}