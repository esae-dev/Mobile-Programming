// 조건문 when : when문을 표현식으로 사용 = when문의 실행결과를 반환
// when문을 표현식으로 사용할때는 else문을 생략할수 없음
fun main(){
    var data = 10 
    var result = when{
        data <= 0 -> "data is <= 0"
        data > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(result)
}
/*
 즉, when문은 switch문과 비슷하지만
 1. else를 사용할 수 있고
 2. 문자열도 케이스에 집어넣을 수 있으며
 3. is(타입 확인), in(범위 체크) 같은 다양한 조건도 넣을 수 있고
 4. if/else문처럼 데이터 명시(케이스) 없이 조건문 사용이 가능하며
 5. 값을 반환할 수도 있음. (이땐 else를 생략할 수 없음, 반환식이니까)