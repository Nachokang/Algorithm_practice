//
// 2023.01.18
// 프로그래머스 0단계 - 주사위의 개수 (120845)
// code by 강다운
//


#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(vector<int> box, int n) {
	int dice = 1;
	for (int i = 0; i < box.size(); i++) {
		box[i] /= n;
		dice *= box[i];
	}
	return dice;
}

int main() {
	int answer = solution({ 10,8,6 }, 3);
	cout << answer;
}