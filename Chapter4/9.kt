//9. 데이터 클래스의 toString()

fun main() {
    // 일반 클래스
    class NonDataClass(
        val name: String,
        val email: String,
        val age: Int
    )
    // 데이터 클래스
    data class DataClass(
        val name: String,
        val email: String,
        val age: Int
    )

    // 일반 클래스 객체 생성
    val non = NonDataClass("hej", "a@a.com", 10)
    // 데이터 클래스 객체 생성
    val data = DataClass("hej", "a@a.com", 10)

    // 일반 클래스 : 객체를 식별하는 형태의 문자열 출력
    println("non data class toString() : ${non.toString()}") //객체 식별값만 줌
    // 데이터 클래스 : 프로퍼티의 이름과 값을 문자열로 출력
    println("data class toString() : ${data.toString()}") //데이터를 잘 정리해서 보여줌(데이터 클래스라서 가능)

}