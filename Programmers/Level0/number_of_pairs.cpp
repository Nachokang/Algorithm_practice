//
// 2023.01.14
// 프로그래머스 0단계 - 순서쌍의 개수 (120836)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(int n) {
	int pair_cnt = 0;
	// n의 약수의 개수 구하기
	for (int i = 1; i <= n; i++) {
		// i = 0부터 시작하면 divide-by-zero exception이 발생하기 때문에 i=1부터 시작
		if (n % i ==0)
			pair_cnt++;
	}
	return pair_cnt;
}

int main() {
	int answer = solution(20);
	cout << answer;
}