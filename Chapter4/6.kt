// 6. 오버라이딩 : 부모 클래스의 프로퍼티나 함수를 자식 클래스에서 재정의

open class Super { // open : 다른 클래스가 상속할 수 있도록 허용(public같은 그런 것)
    open var someData = 10 // open : 자식 클래스에서 오버라이딩 허용
    open fun someFun() {
        println("i am super class function : $someData")
    }
}
class Sub : Super() { //부모클래스 상속받음
    override var someData = 20 //부모클래스 프로퍼티 재정의(오버라이딩)
    override fun someFun() { // 부모 클래스의 함수 재정의
        println("i am sub class function : $someData")
    }
}

fun main() {

    // 자식 클래스의 객체 생성
    val obj = Sub()

    // 오버라이딩된 자식 클래스의 함수가 실행
    obj.someFun()

}