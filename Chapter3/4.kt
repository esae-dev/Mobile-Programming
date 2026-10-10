// 4. 문자열템플릿($)

fun main() {
    fun sum(no:Int):Int{ //함수 sum
        var sum = 0 //변수 sum 선언 & 할당
        for(i in 1..no){ //i를 1부터 no까지 1씩 증가하며 반복(증가량은 정해주지 않았음 -> 1)
            sum += i
        }
        return sum
    }
    
    val name:String = "hej"
    println("name:$name, sum:${sum(10)}, plus:${10+20}") //변숫값, 결괏값 등 포함시킬 땐 $ 사용
}