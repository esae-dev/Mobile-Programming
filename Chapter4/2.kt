// 2. init 키워드로 주 생성자의 본문 지정

class User(name: String, count: Int) { // name과 count를 매개변수로 받는 주 생성자
    init { //초기화, 주 생성자의 본문 역할(객체 생성 시 자동 실행)
        println("i am init....")
    }
}

fun main() {
    val user = User("hej", 10) //User 객체 생성, init 실행

}