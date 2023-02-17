//
// 2023.02.17
// 프로그래머스 0단계 - 숨어있는 숫자의 덧셈(1) (120851)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(string my_string) {
	int sum = 0;
	int cnt = 0;
	vector<int> onlynum;
	for (int i = 0; i < my_string.size(); i++) {
		if (my_string[i] > 47 && my_string[i] < 58) {
			cnt = my_string[i] - 48;
			onlynum.push_back(cnt);
		}
	}
	for (int j = 0; j < onlynum.size(); j++) {
		sum += onlynum[j];
	}
	return sum;
}

int main() {
	int answer = solution("aAb1B2cC34oOp");
	cout << answer;
}