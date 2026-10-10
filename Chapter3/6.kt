// 6. 함수 선언하기

// 1. 함수 선언과 반환값

// data1을 매개변수로 전달받아 Int 타입의 값을 반환
fun some1(data1: Int): Int { //매개변수 - 반환 타입
    return data1 * 10
}

// 2. 함수의 매개변수

fun some2(data1: Int) {
    // 함수의 매개변수는 함수 내부에서 값을 다시 대입할 수 없음
    // data1 = 20  // Error!
    println("data1 : $data1")
}

fun main() {
    // 3. 함수 내부에 함수 선언 가능
    // data2의 기본값을 10으로 지정
    fun some3(data1: Int, data2: Int = 10): Int {
        return data1 * data2
    }

    println(some1(10)) //some1에 10 대입 후 출력(값 반환: 100)
    some2(20) //20 대입 후 출력(출력만: 20)
    
    // 4. 기본 인자(Default Argument)

    // data2 생략 → 기본값 10 사용
    println(some3(10))  // 결과 : 100 (some1에 10, some2 기본 10)

    // data1 = 10, data2 = 20
    println(some3(10, 20))  // 결과 : 200 (some1에 10, some2에 20)

    // 5. 명명된 인자(Named Argument)
    // 매개변수 이름을 지정하면 순서를 바꾸어 전달 가능
    println(some3(data2 = 20, data1 = 10))  // 결과 : 200(매개변수 순서에 맞춰 호출하지 않아도 됨)
}

//매개변수 - 반환 타입
//매개변수는 값 변경 불가(지역변수가 아님)