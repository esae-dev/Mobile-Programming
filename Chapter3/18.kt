// 18. 반복문 for : 인덱스와 데이터를 가져오는 withindex() 함수
// withIndex() : for문을 반복하면서 인덱스와 실제 데이터를 함께 가지고 옴.
fun main(){
    var data = arrayOf<Int>(10,20,30)
    for((index, value) in data.withIndex()){ //indices랑 비슷하게 전체 다 들고 옴(index, value값)
        print(value)
        if(index != data.size-1) print(",")
    }
}