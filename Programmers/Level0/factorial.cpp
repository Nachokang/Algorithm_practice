//
// 2023.01.19
// 프로그래머스 0단계 - 팩토리얼 (120848)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int factorial(int num) {
	if (num == 0)
		return 1;
	return num * factorial(num - 1);
}

int solution(int n) {
	int max_fact = 0;
	for (int i = 0; i <= 10; i++) {
		if (factorial(i) == n)
			max_fact = i;
		else {
			if (factorial(i) < n)
				max_fact = i;
		}
	}
	return max_fact;
}

int main() {
	int answer = solution(7);
	cout << answer;
}