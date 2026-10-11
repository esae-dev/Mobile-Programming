// 16. 반복문 for(제어 변숫값을 증감하면서 특정 조건이 참일때까지 구문을 반복해서 실행) : for~in 반복문
fun main(){
    var sum:Int = 0 //variable sum 만들고, int로 선언한 뒤 0 할당
    for(i in 1..10){ //i를 1부터 10까지
        sum += i 
    }
    println(sum)
}