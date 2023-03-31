//
// 2023.01.04
// 프로그래머스 입문 - 배열 두 배 만들기
// 강다운
//

#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    for (int i = 0; i < numbers.size(); i++) {
        numbers[i] *= 2;
        answer.push_back(numbers[i]);
        // numbers 벡터의 원소를 두배한 값들을 answer 벡터에 넣어줌
    }
    return answer;
}

int main() {
    vector<int> answer = solution({1, 2, 3, 4, 5});
    for (int i = 0; i < answer.size(); i++)
        cout << answer[i] << endl;
}
