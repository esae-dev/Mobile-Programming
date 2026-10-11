// 17. 반복문 for : 반복 조건에 컬렉션 타입 활용
// indices : 컬렉션 타입의 인덱스값
fun main(){
    var data = arrayOf<Int>(10,20,30) //Int 배열에 10,20,30 집어넣기
    for(i in data.indices){ //컬렉션 타입의 데이터 개수만큼 반복
        print(data[i])
        if(i != data.size-1) print(",") //data.size-1(마지막 원소의 인덱스)가 아니라면 ',' 삽입
    }
}