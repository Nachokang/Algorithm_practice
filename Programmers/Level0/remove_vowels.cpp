//
// 2023.02.17
// 프로그래머스 0단계 - 모음 제거 (120849)
// code by 강다운
//

#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

string solution(string my_string) {
	vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};

	for (int i = 0; i < 5; i++) {
		my_string.erase(remove(my_string.begin(), my_string.end(), vowels[i]), my_string.end());
	}

	return my_string;
}

int main() {
	string answer = solution("nice to meet you");
	cout << answer << endl;
}