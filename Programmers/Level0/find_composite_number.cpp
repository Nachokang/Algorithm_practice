//
// 2023.02.17
// 프로그래머스 0단계 - 합성수 찾기 (120846)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(int n) {
	vector<int> primenum;
	int compositenum = 0;
	int cnt;
	for (int i = 2; i <= n; i++) {
		cnt = 0;
		for (int j = 2; j <= n; j++) {
			if (i % j == 0)
				cnt++;
		}
		if (cnt == 1)
			primenum.push_back(i);
	}
	compositenum = n - primenum.size()-1; // 1은 소수가 아니므로 -1을 해준다
	return compositenum;
}

int main() {
	int answer = solution(10);
	cout << answer;
}