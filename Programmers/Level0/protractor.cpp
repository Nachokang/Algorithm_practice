//
// 2023.01.13
// 프로그래머스 0단계 - 각도기
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(int angle) {
	if (angle > 0 && angle < 90)
		return 1;
	else if (angle == 90)
		return 2;
	else if (angle > 90 && angle < 180)
		return 3;
	else if (angle == 180)
		return 4;
}

int main() {
	int answer = solution(91);
	cout << answer;
}
