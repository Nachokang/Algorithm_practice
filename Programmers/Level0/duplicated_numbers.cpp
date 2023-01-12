//
// 2023.01.12
// 프로그래머스 0단계 - 중복된 숫자 개수
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(vector<int> array, int n) {
	int cnt = 0;
	sort(array.begin(), array.end());
	for (int i = 0; i < array.size(); i++) {
		if (array[i] == n)
			cnt++;
	}
	return cnt;
}

int main() {
	int answer = solution({ 1,1,2,3,4,5 }, 1);
	cout << answer << endl;
}