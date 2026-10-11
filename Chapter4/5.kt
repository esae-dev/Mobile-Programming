// 5. 보조 생성자 선언

class User {
    constructor(name: String) { // 보조 생성자 : 클래스 본문에 constructor 키워드로 선언
        println("constructor(name: String) call...")
    }
    constructor(name: String, count: Int) { // 매개변수가 다른 보조 생성자를 여러 개 선언할 수 있음
        println("constructor(name: String, count: Int) call...")
    }
}

fun main() {

    // 매개변수가 1개인 보조 생성자 호출
    val user1 = User("hej")

    // 매개변수가 2개인 보조 생성자 호출
    val user2 = User("hej", 10)

}