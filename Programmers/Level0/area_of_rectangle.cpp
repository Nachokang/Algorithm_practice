//
// 프로그래머스 0단계 - 직사각형 넓이 구하기 (120860)
// 2023.03.07
// code by 강다운
//

#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <climits>

using namespace std;

int solution(vector<vector<int>> dots) {
	int area = 0;
	int xmax=INT_MIN, xmin=INT_MAX, ymax=INT_MIN, ymin =INT_MAX;
	for (int i = 0; i < dots.size(); i++) {
		if (dots[i][0] > xmax) {
			xmax = dots[i][0];
		}
		
		if (dots[i][0] < xmin) {
			xmin = dots[i][0];
		}
	}

	for (int i = 0; i < dots.size()-1; i++) {
		if (dots[i][1] > ymax) {
			ymax = dots[i][1];
		}

		if (dots[i][1] < ymin) {
			ymin = dots[i][1];
		}
	}

	area = (xmax - xmin) * (ymax - ymin);
	return area;
}

int main() {
	int answer = 0;
	vector<vector<int>> dots(4, vector<int>(2, 0));
	dots[0][0] = 1;
	dots[0][1] = 1;
	dots[1][0] = 2;
	dots[1][1] = 1;
	dots[2][0] = 2;
	dots[2][1] = 2;
	dots[3][0] = 1;
	dots[3][1] = 2;
	answer = solution(dots);
	cout << answer;
}