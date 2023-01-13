//
// 2023.01.13
// 프로그래머스 0단계 - 배열 뒤집기
// 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<int> solution(vector<int> num_list) {
	vector<int> flipped_list;
	reverse(num_list.begin(), num_list.end());
	for (int i = 0; i < num_list.size(); i++) {
		flipped_list.push_back(num_list[i]);
	}
	return flipped_list;
}

int main() {
	vector<int> answer = solution({ 1, 2, 3, 4, 5 });
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << endl;
	}
}