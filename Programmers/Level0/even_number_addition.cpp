//
// 2023.01.13
// 프로그래머스 0단계 - 짝수의 합
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(int n) {
	int addition = 0;
	for (int i = 0; i <= n; i++) {
		if (i % 2 == 0)
			addition += i;
	}
	return addition;
}

int main() {
	int answer = solution(10);
	cout << answer;
}