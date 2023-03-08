//
// 2023.03.08
// 프로그래머스 0단계 - 캐릭터의 좌표 (120861)
// Code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<int> solution(vector<string> keyinput, vector<int> board) {
	vector<int> char_coord = { 0, 0 };
	for (int i = 0; i < keyinput.size(); i++) {
		if (keyinput[i].compare("left") == 0) {
			char_coord[0] -= 1;
		}

		if (keyinput[i].compare("right") == 0) {
			char_coord[0] += 1;
		}

		if (keyinput[i].compare("down") == 0) {
			char_coord[1] -= 1;
		}

		if (keyinput[i].compare("up") == 0) {
			char_coord[1] += 1;
		}

		if (char_coord[0] < 0 || char_coord[1] < 0) {
			if (char_coord[0] < -board[0] / 2) {
				char_coord[0] += 1;
			}
			if (char_coord[1] < -board[1] / 2) {
				char_coord[1] += 1;
			}
		}

		else
		{
			if (char_coord[0] > board[0] / 2) {
				char_coord[0] -= 1;
			}
			if (char_coord[1] > board[1] / 2) {
				char_coord[1] -= 1;
			}
		}
	}
	return char_coord;
}

int main() {
	vector<int> answer = solution({ "left", "right", "up", "right", "right" }, { 11, 11 });
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << ' ';
	}
}