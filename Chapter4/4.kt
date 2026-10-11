// 4. 생성자의 매개변수를 클래스의 프로퍼티로 선언하는 방법(3 내용을 init 저장 없이 바로 써먹는 법)

class User(val name: String, val count: Int) { //val/var 선언하고 시작하면 바로 프로퍼티됨(값 고정)

    fun someFun() {
        println("name : $name, count : $count") // 생성자에서 선언한 프로퍼티를 멤버 함수에서 바로 사용
    }
}

fun main() {

    // 주 생성자를 호출하여 객체 생성
    val user = User("hej", 10)

    // 멤버 함수 호출
    user.someFun()

}