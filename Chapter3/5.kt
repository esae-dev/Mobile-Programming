//5. Unit & Nothing

// 1. Unit: 반환문이 없는 함수(void 같은거임)
val data1: Unit = Unit
// Unit 타입으로 선언한 변수에는 Unit 객체만 대입 가능
// Unit 타입의 변수 선언은 가능하지만 일반적으로 많이 사용하지 않음

fun some1(): Unit { // 반환값이 없는 함수
    println(10 + 20)
}

fun some2() { // 반환 타입 Unit 생략 가능
    println(10 + 20)
}

// 2. Nothing: null이나 예외를 반환하는 함수(특수한 상황 표현)
val data2: Nothing? = null
// Nothing 타입에는 정상적인 값을 대입할 수 없음
// Nothing? 타입에는 null만 대입 가능

fun some3(): Nothing? { //의미없는 값 쓸 때 Nothing
    return null
}

// 정상적으로 함수가 끝나지 않는 경우
fun some4(): Nothing {
    throw Exception("Error 발생")
}

fun main() {
    println("===== Unit =====")
    some1()
    some2()

    println("data1 : $data1")

    println("\n===== Nothing? =====")
    println("data2 : $data2")
    println("some3() : ${some3()}")

    // some4()   // 실행하면 예외가 발생하면서 프로그램 종료
}
//Unit과 Nothing 모두 특수한 상황 표현(의미 있는 데이터 x)
//Unit: void같은거라 생각하면 됨(반환문 없음)
//Nothing: null만 대입 가능(null만 반환)