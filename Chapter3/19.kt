// 19. 반복문 while : while 반복문
fun main(args:Array<String>){ //(C에서의 매개변수 char **Str과 비슷한 느낌임)
    var x = 10 //코드 오류있음, var x = 0같이 둬야 의도대로 나옴(지금은 바로 10이라 while 바로 종료됨)
    var sum1 = 10
    while(x < 10){
        sum1 += ++x //한자리 올리고 더하기 반복
    }
    println(sum1)
}