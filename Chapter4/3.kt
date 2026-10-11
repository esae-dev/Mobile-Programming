// 3. 생성자의 매개변수를 다른 함수에서 사용하는 예

class User(name: String, count: Int) { //매개변수 name, count(변수명부터 선언)
    var name: String
	var count: Int //클래스 프로퍼티 선언

    // 주 생성자의 매개변수 값을 프로퍼티에 저장
    init {
        this.name = name
        this.count = count //클래스 프로퍼티에 매개변수 저장

    }
    fun someFun() {
        println("name : $name, count : $count") //프로퍼티에 저장했다 사용
    }
}

fun main() {

    // User 객체 생성
    val user = User("hej", 10)

    // 멤버 함수 호출
    user.someFun()

}