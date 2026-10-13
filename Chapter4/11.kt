// 11. 컴패니언 객체를 이용한 클래스 멤버 접근

class MyClass {
    companion object { // companion object : 객체를 생성하지 않고 클래스 이름으로 멤버에 접근 가능
        var data = 10
        fun some() {
            println(data)
        }
    }
}
fun main() {
    MyClass.data = 20 // MyClass 객체를 생성하지 않고 프로퍼티에 접근
    MyClass.some() // MyClass 객체를 생성하지 않고 함수 호출
}

//오브젝트 클래스는 익명인 대신 객체 생성이 필수적이였는데, 컴패니언 오브젝트로 쓰면 객체 생성도 없이 바로 접근해서 쓸 수 있음