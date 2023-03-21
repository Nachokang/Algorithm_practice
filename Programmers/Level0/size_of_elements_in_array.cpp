//
// 프로그래머스 0단계 - 배열 원소의 길이 (120854)
// 20203.03.21
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<int> solution(vector<string> strlist) {
	vector<int> element_len;
	for (auto i : strlist) {
		element_len.push_back(i.size());
	}

	return element_len;
}

int main() {
	vector<int> answer = solution({ "We", "are", "the", "world!" });
	for (auto i : answer) {
		cout << i << " ";
	}
}