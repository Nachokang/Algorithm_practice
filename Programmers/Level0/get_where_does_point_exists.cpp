//
// 2023.01.16
// 프로그래머스 0단계 - 점의 위치 구하기 (120841)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(vector<int> dot) {
	int quadrant = 0;
	if (dot[0] > 0) {
		if (dot[1] > 0)
			quadrant = 1;
		else
			quadrant = 4;
	}
	
	if (dot[0] < 0) {
		if (dot[1] > 0)
			quadrant = 2;
		else
			quadrant = 3;
	}

	return quadrant;
}

int main() {
	int answer = solution({ 2,4 });
	cout << answer;
}