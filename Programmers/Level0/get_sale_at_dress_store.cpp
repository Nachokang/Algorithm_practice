//
// 2023.01.12
// 프로그래머스 0단계 - 옷가게 할인 받기
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(int price) {
	int payment = price;
	if (price >= 500000) {
		payment = price * 0.8;
	}
	else if (price >= 300000) {
		payment = price * 0.9;
	}
	else if (price >= 100000) {
		payment = price * 0.95;
	}
	return payment;
}

int main() {
	int answer = solution(580000);
	cout << answer << endl;
}