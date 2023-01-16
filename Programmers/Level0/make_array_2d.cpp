//
// 2023.01.16
// 프로그래머스 0단계 - 2차원으로 만들기 (120842)
// code by 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<vector<int>> solution(vector<int> num_list, int n) {
	vector<vector<int>> answer;
	vector<int> temp;
	int row = num_list.size() / n;
	int column = n;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			temp.push_back(num_list[i*n+j]);
		}
		answer.push_back(temp);
		temp.clear();
	}
	return answer;
}

int main() {
	vector<vector<int>> answer = solution({ 1,2,3,4,5,6,7,8 }, 2);
	for (vector<int> v : answer) {
		for (int element : v) {
			cout << element << ' ';
		}
		cout << endl;
	}	
}