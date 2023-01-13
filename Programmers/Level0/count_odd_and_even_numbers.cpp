//
// 2023.01.13
// 프로그래머스 0단계 - 짝수 홀수 개수
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> num_list) {
	int oddcnt = 0;
	int evencnt = 0;
	vector<int> answer;
	for (int i = 0; i < num_list.size(); i++) {
		if (num_list[i] % 2 == 0)
			evencnt++;
		else
			oddcnt++;
	}
	answer.push_back(evencnt);
	answer.push_back(oddcnt);
	return answer;
}

int main() {
	vector<int> answer = solution({ 1, 2, 3, 4, 5 });
	for (int i = 0; i < answer.size(); i++) {
		cout << answer[i] << endl;
	}
}