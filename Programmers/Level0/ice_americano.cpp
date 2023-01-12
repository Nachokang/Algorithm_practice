//
// 2023.01.12
// 프로그래머스 0단계 - 아이스 아메리카노
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

vector<int> solution(int money) {
	vector<int> answer;
	int americano = money / 5500;
	int leftover = money - 5500 * americano;
	answer.push_back(americano);
	answer.push_back(leftover);
	return answer;
}

int main() {
	vector<int> answer = solution(5500);
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << endl;
	}
}