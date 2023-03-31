//
// 2023.03.31
// 프로그래머스 0단계 - 저주의 숫자 3 (120871)
// code by 강다운
//


#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(int n) {
	int answer = 1;
	int cnt = 1;

	while (true) {
		bool check = false;
		string s = to_string(answer);

		if (answer % 3 == 0) {
			answer += 1;
			continue;
		}
		else
		{
			for (int i = 0; i < s.size(); i++) {
				if (s[i] == '3') {
					answer += 1;
					check = true;
					break;
				}
			}
		}

		if (check)
			continue;
		if (cnt == n)
			break;
		cnt += 1;
		answer += 1;
	}
	return answer;
}

int main() {
	int answer = solution(15);
	cout << answer;
}