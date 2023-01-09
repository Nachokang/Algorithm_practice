//
// 2023.01.09
// 프로그래머스 0단계 - 짝수는 싫어요
// 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(int n) {
	vector<int> onlyoddanswer;
	for (int i = 0; i <= n; i++) {
		if (i % 2 != 0) {
			onlyoddanswer.push_back(i);
			sort(onlyoddanswer.begin(), onlyoddanswer.end());
		}
	}
	return onlyoddanswer;
	// n 이하의 홀 수가 오름차순으로 담긴 배열을 return하는 함수
}

int main() {
	vector<int> answer = solution(15);
	for (int i=0; i<answer.size(); i++)
		cout << answer[i] << endl;
}