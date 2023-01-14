//
// 2023.01.14
// 프로그래머스 0단계 - 외계행성의 나이 (120834)
// 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

string solution(int age) {
	string converted_age = "";
	string converter = to_string(age);
	for (int i = 0; i < converter.size(); i++) {
		converted_age += converter[i] + 49;
		// 아스키 코드값을 이용하였다
		// 숫자 0~9의 아스키 코드 값 : 48~57
		// 영문 대문자 A~Z의 아스키 코드 값 : 65~90
		// 영문 소문자 a~z의 아스키 코드 값 : 97~122
		// 숫자 + 49 = 영문 소문자가 된다
	}
	return converted_age;
}

int main() {
	string answer = solution(23);
	cout << answer;
}