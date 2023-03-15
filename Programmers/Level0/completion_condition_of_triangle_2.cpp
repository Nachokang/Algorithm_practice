//
// 2023.03.15
// 프로그래머스 0단계 - 삼각형의 완성조건 (2) (120868)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(vector<int> sides) {
	int l_side = 0; int s_side = 0;
	int num = 0;

	if (sides[0] > sides[1]) {
		l_side = sides[0];
		s_side = sides[1];
	}
	else
	{
		l_side = sides[1];
		s_side = sides[0];
	}

	num = (l_side + s_side) - (l_side - s_side) - 1;
	return num;
}

int main() {
	int answer = solution({ 1, 2 });
	cout << answer;
}