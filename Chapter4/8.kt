// 8. 데이터 클래스의 equals()

data class DataClass(
    val name: String,
    val email: String,
    val age: Int //주 생성자 프로퍼티가 비교 대상
) 
	{
    lateinit var address: String //본문 프로퍼티는 비교 대상 x
    constructor(name: String, email: String, age: Int, address: String): this(name, email, age) {
        this.address = address //본문에서만 address가 따로 추가됨
    }
}
    
fun main() {
    val obj1 = DataClass("hej", "a@a.com", 10, "seoul")
    val obj2 = DataClass("hej", "a@a.com", 10, "busan") //둘의 address는 다름
    println("obj1.equals(obj2) : ${obj1.equals(obj2)}") // name, email, age가 모두 같으므로 true
}