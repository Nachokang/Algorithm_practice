//
// 2023.01.10
// 프로그래머스 0단계 - 피자 나눠 먹기 (1)
// 강다운
//

#include <iostream>
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
	int pizza = 0;
	int cnt = 0;
	if (n % 7 > 0)
		cnt += 1;
	pizza = n / 7 + cnt;
	return pizza;
}

int main() {
	int answer = solution(15);
	cout << answer << endl;
}