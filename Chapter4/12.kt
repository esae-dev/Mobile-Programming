// 12. 접근 제한자 사용 예
open class Super {
    var publicData = 10 // public : 어디에서나 접근 가능
    protected var protectedData = 20 // protected : 클래스 내부와 자식 클래스에서 접근 가능
    private var privateData = 30 // private : 선언된 클래스 내부에서만 접근 가능
}
class Sub : Super() {
    fun subFun() {
        publicData++ // public : 자식 클래스에서 접근 가능
        protectedData++ // protected : 자식 클래스에서 접근 가능
        // private : 부모 클래스 내부에서만 접근 가능(privateData++ 안됨)
    }
}
fun main() {
    val obj = Super()
    obj.publicData++ // public : 외부에서 접근 가능
    // protected : 외부에서 접근 불가
    // obj.protectedData++  // Error!
    // private : 외부에서 접근 불가
    // obj.privateData++    // Error!
}