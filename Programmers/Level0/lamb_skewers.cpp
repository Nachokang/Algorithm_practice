//
// 2023.01.13
// 프로그래머스 0단계 - 양꼬치
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(int n, int k) { // 양꼬치 n개 음료수 k개
	int price = 12000 * n + 2000 * k;
	int service = 0;
	for (int i = 0; i < n; i++) {
		if (n / 10 > i)
			service += 1;
	}
	price -= service * 2000;
	return price;
}

int main() {
	int answer = solution(64, 6);
	cout << answer;
}