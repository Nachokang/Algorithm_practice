//
// 프로그래머스 0단계 - 배열 자르기 (120833)
// 2023.01.14
// 강다운
//


#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers, int num1, int num2) {
	vector<int> sliced_vec(numbers.begin() + num1, numbers.begin() + num2 + 1);
	return sliced_vec;
}

int main() {
	vector<int> answer = solution({ 1,2,3,4,5 }, 1, 3);
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << " ";
	}
}