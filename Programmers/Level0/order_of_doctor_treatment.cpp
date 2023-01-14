//
// 2023.01.14
// 프로그래머스 0단계 - 진료 순서 정하기 (120835)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<int> solution(vector<int> emergency) {
	vector<int> answer(emergency);
	for (int i = 0; i < emergency.size(); i++) {
		answer[i] = 1;
		for (int j = 0; j < emergency.size(); j++) {
			if (emergency[i] < emergency[j]) {
				answer[i]++;
			}
		}
	}
	// i와 i+1을 비교하려고 할 때는 이중반복문 사용하자!
	return answer;
}

int main() {
	vector<int> answer = solution({ 3, 76, 24 });
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << ' ';
	}
}