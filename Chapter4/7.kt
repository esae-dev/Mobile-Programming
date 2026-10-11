// 7. 일반클래스 & 데이터 클래스

// 일반 클래스
class NonDataClass(val name: String, val email: String, val age: Int)

// 데이터 클래스 : 데이터를 저장하기 위한 클래스(여러 부가 기능들이 열림)
data class DataClass(val name: String, val email: String, val age: Int)

fun main() {

    // 값이 같은 일반 클래스 객체 생성
    val non1 = NonDataClass("hej", "a@a.com", 10)
    val non2 = NonDataClass("hej", "a@a.com", 10)

    // 값이 같은 데이터 클래스 객체 생성
    val data1 = DataClass("hej", "a@a.com", 10)
    val data2 = DataClass("hej", "a@a.com", 10)

    // 일반 클래스 : 서로 다른 객체이므로 false(둘은 다름(==같은 느낌, 같은 객체인지를 비교))
    println("non data class equals : ${non1.equals(non2)}")

    // 데이터 클래스 : 프로퍼티의 값이 같으므로 true(둘이 같음(equals같은 느낌, 내부 값 비교))
    println("data class equals : ${data1.equals(data2)}")

}