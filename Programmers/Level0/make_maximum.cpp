//
// 2023.01.19
// 프로그래머스 0단계 - 최댓값 만들기(1) (120847)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(vector<int> numbers) {
	int maxnum = 0;
	int nextmax = 0;
	sort(numbers.begin(), numbers.end());
	for (int i = 0; i < numbers.size(); i++) {
		maxnum = numbers[numbers.size() - 1];
		nextmax = numbers[numbers.size() - 2];
	}
	return maxnum * nextmax;
}

int main() {
	int answer = solution({ 0,31,24,10,1,9});
	cout << answer;
}