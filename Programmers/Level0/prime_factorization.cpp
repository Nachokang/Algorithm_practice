//
// 프로그래머스 0단계 - 소인수분해 (120852)
// 2023.03.21
// code by 강다운
//

#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

vector<int> solution(int n) {
	vector<int> primenum;
	int cnt = 0;
	for (int i = 2; i <= n; ++i) {
		while (n % i == 0) {
			n /= i;
			primenum.push_back(i);
		}
	}
	if (n != 1) {
		primenum.push_back(n);
	}

	sort(primenum.begin(), primenum.end());
	primenum.erase(unique(primenum.begin(), primenum.end()), primenum.end());
	// vector 안에 중복 원소 제거

	return primenum;
}

int main() {
	vector<int> answer = solution(420);
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << " ";
	}
}