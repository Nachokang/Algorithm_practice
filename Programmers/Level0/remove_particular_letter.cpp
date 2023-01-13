//
// 2023.01.13
// 프로그래머스 0단계 - 특정 문자 제거
// 강다운
//


#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

string solution(string my_string, string letter) {
	my_string.erase(remove(my_string.begin(), my_string.end(), letter[0]), my_string.end());
// 처음에 remove 함수의 마지막 인수로 letter를 사용했었는데 오류가 떴다.
// letter는 char형이 아닌 string형으로 선언되었고, 문제에서 letter는 길이가 1인 영문자라고
// 주어졌기 때문에 letter[0]을 사용해야 하더라~
	return my_string;
}

int main() {
	string answer = solution("BCBdbe", "B");
	cout << answer << endl;
}