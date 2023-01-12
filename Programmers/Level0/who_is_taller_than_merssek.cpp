//
// 2023.01.12
// 프로그래머스 0단계 - 머쓱이보다 키 큰 사람
// 강다운
//

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> array, int height) {
	int cnt = 0;
	int answer = 0;
	array.push_back(height);
	sort(array.begin(), array.end());
	for (int i = 0; i < array.size(); i++) {
		if (array[i] > height) {
			answer = array.size() - i;
			break;
		}
	}
	return answer;
}

int main() {
	int answer = solution({ 149, 180, 192, 170 }, 167);
	cout << answer << endl;
}