// 1. 클래스와 생성자(주생성자, 보조생성자)

// 클래스의 멤버 : 생성자, 프로퍼티, 함수, 클래스
class User constructor(var name: String) { //주 생성자: 클래스 선언부에 작성(한 개만 가능, constructor 생략 가능)
    var age = 0 //클래스의 프로퍼티(변수랑 비슷함)

    constructor(name: String, age: Int) : this(name) { // 보조 생성자 : 클래스 본문에 constructor 키워드로 선언
        this.age = age //this.age: 클래스 프로퍼티, age: 매개변수
    }
    
    // 클래스의 멤버 함수
    fun someFun() {
        println("name : $name, age : $age")
    }
    class SomeClass { } //클래스 안에 다른 클래스 선언 가능(Car 안에 Engine같은 그런 느낌으로)

}

fun main() {
    var user1 = User("hej") //주 생성자 호출(객체 생성)
    var user2 = User("kim", 20) //보조 생성자 호출(객체 생성)

    user1.someFun()
    user2.someFun()

}
//오버로딩: 매개변수 갯수만 다르게
//오버라이딩: 부모 클래스의 함수 자식 클래스에서 재정의