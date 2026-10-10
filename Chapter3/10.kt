// 10. 조건문 : 표현식(결괏값을 반환하는 계산식)으로 사용 예
// if~else문으로 표현식으로 사용하려면 else를 생략할 수 없음.
// if~else표현식이 반환하는 결괏값은 각 영역의 마지막 줄에 해당
fun main(){
    var data = 10 
    val result = if(data > 10){
        println("data > 0")
        true
    }else{
        println("data <= 0")
        false //결괏값 반환의 경우, 반대편(else)도 제공이 되어야 함.
    }
    println(result)
}