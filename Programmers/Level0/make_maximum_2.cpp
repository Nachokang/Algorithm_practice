//
// 2023.03.13
// 프로그래머스 0단계 - 최댓값 만들기 (2) (120862)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int solution(vector<int> numbers) {
	int negativemax = 0;
	int positivemax = 0;
	sort(numbers.begin(), numbers.end());
	negativemax = numbers[0] * numbers[1];
	positivemax = numbers[numbers.size()-1] * numbers[numbers.size() - 2];

	if (negativemax > positivemax)
		return negativemax;
	else
		return positivemax;

}

int main() {
	int answer = solution({ 1, 2, -3, 4, -5 });
	cout << answer;
}