//
// 2023.01.11
// 프로그래머스 0단계 - 배열의 평균값
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

double solution(vector<int> numbers) {
	double mean = 0;
	double total = 0;
	sort(numbers.begin(), numbers.end());
	for (int i = 0; i < numbers.size(); i++) {
		total += numbers[i];
	}
	mean = total / numbers.size();
	return mean;
}

int main() {
	double answer = solution({ 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
	cout << answer << endl;
}
