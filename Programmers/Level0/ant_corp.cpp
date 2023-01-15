//
// 2023.01.15
// 프로그래머스 0단계 - 개미 군단 (120837)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(int hp) {
	int worker_ant = 1;
	int soldier_ant = 3;
	int general_ant = 5;
	int total_ant = 0;
	while (hp) {
		if (hp >= 5) {
			hp -= general_ant;
			total_ant += 1;
		}
		else if (hp >= 3 && hp < 5) {
			hp -= soldier_ant;
			total_ant += 1;
		}
		else if (hp >= 1 && hp < 3) {
			hp -= worker_ant;
			total_ant += 1;
		}
	}
	return total_ant;
}

int main() {
	int answer = solution(24);
	cout << answer;
}