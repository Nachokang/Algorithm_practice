//
// 2023.01.16
// 프로그래머스 0단계 - 구슬을 나누는 경우의 수 (120840)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int combination(int n, int r) {
	if (n == r || r == 0)
		return 1;
	return combination(n - 1, r - 1) + combination(n - 1, r);
	// 조합을 재귀로 구현한 함수
}

int solution(int balls, int share) {
	return combination(balls, share);
}

int main() {
	int answer = solution(5, 3);
	cout << answer;
}