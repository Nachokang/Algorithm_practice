//
// 2023.02.17
// 프로그래머스 0단계 - 문자열 정렬하기(1) (120850)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<int> solution(string my_string) {
	vector<int> onlynum;
	int cnt = 0;
	for (int i = 0; i < my_string.size(); i++) {
		if (my_string[i] > 47 && my_string[i] < 58) {  // ASCII코드 숫자 범위 내에 있다면 (숫자라면)
			cnt = my_string[i] - 48; // 문자열을 숫자로 변환
			onlynum.push_back(cnt);
			sort(onlynum.begin(), onlynum.end());
		}
	}
	return onlynum;
}

int main() {
	vector<int> answer = solution("hi12392");
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << " ";
	}
}