//
// 2023.01.13
// 프로그래머스 0단계 - 문자 반복 출력하기
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

string solution(string my_string, int n) {
	string repeated_str;
	for (int i = 0; i < my_string.size(); i++) {
		for (int j = 0; j < n; j++) {
			repeated_str.push_back(my_string[i]);
		}
	}
	return repeated_str;
}

int main() {
	string answer = solution("hello", 3);
	cout << answer << endl;
}