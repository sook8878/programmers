package level1;


public class X만큼간격이있는N개의숫자 {

//	"int x"를 "long x" 변환해야 하는 이유 남깁니다.
//
//	문제를 푸실때 요구사항의 특징을 잘 파악하는 것이 실무에서 가장 중요합니다.
//
//	x는 최대 1000만, n은 1000 까지 입력이 가능합니다.
//	연산으로 최대로 나올수 있는 최대값은 100억이 된다는 이야기입니다.
//
//	int자료형의 최대 표현범위는 약 -21억 ~+21억 입니다.
//	그래서 int형 x과 int형 n의 연산결과가 표현범위를 벗어나 에러가 난겁니다.
//	( int와 int를 연산하면 결과도 int형으로 반환됩니다.)
//
//	그에 비해 long형은 표현범위가 일단 조단위가 넘기 때문에 위의 연산결과를 받아오기에 충분합니다.
//	int 와 long 데이터 표현범위가 다른데 연산을 하면 데이터가 큰 long형으로 연산결과가 나옵니다.
//
//	그러니 int x 를 long x로 표현하면 실행이 되는겁니다.
//	int x를 long x로 바꾸는 것도 방법이지만, 알고리즘 문제를 푸실때 매개변수타입을 바꾸는 일보다는
//	주어진 매개변수타입 그대로 활용하는 것이 좋을 것같습니다.
//	알고리즘을 그대로 사용하신다면 int x대신, int i를 long i로 변환하는것이 좋을것같습니다.
	
    public static long[] solution(int x, int n) {
        long[] answer = {};
        
        answer = new long[n];
        
        long resultx = x;
        long lx = x;
        
        for (int i = 0; i < n; i++) {
			

        	
        	answer[i] = lx;
        	
        	lx = lx + resultx;
        	System.out.println(answer[i]);
		}
        return answer;
    }
	
	public static void main(String[] args) {
		
		solution(3, 5);
		
	}
}
