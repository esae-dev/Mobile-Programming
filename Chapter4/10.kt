//*10. 타입을 지정한 오브젝트 클래스(page 124)* 

// 부모 클래스
open class Super {
    open var data = 10 // 자식에서 재정의할 수 있는 프로퍼티
    open fun some() { // 자식에서 재정의할 수 있는 함수
        println("i am super some() : $data")
    }
}
val obj = object : Super() { // object를 이용하여 Super를 상속받는 익명 객체 생성
    override var data = 20 // 부모 클래스의 프로퍼티 재정의
    override fun some() { // 부모 클래스의 함수 재정의
        println("i am object some() : $data")
    }
}
fun main() { // 재정의한 data의 값을 20에서 30으로 변경
    obj.data = 30 // 익명 객체에서 재정의한 함수 호출
    obj.some()
}

//오브젝트 클래스는 선언과 동시에 객체 생성 필요