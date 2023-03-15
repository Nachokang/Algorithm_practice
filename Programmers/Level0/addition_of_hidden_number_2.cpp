//
// 2023.03.15
// 프로그래머스 0단계 - 숨어있는 숫자의 덧셈 (2) (120864)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(string my_string) {
	int sum=0, tmp = 0;
	my_string += "A"; // 끝에 자연수가 껴있는 경우를 처리하기 위해 문자열에 A를 추가해줌

	for (int i = 0; i < my_string.size(); i++) {
		if (isdigit(my_string[i])) {
			tmp = tmp * 10 + my_string[i] - '0';
		}
		else
		{
			sum += tmp;
			tmp = 0;
		}
	}
	
	return sum;
}

int main() {
	int answer = solution("aAb1B2cC34oOp");
	cout << answer;
}