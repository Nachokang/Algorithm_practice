//
// 2023.01.13
// 프로그래머스 0단계 - 직각삼각형 출력하기
// 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void triangle(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <= i; j++) {
			cout << "*";
		}
		cout << "\n";
	}
	cout << "\n";
}

int main(void) {
	int n;
	cin >> n;
	triangle(n);
	return 0;
}