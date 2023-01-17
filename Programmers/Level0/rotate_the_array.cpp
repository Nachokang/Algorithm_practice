//
// 2023.01.17
// 프로그래머스 0단계 - 배열 회전시키기 (120844)
// code by 강다운
//


#include <iostream>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers, string direction) {
    vector<int> shifted_arr;
    string r = "right";
    string l = "left";
    int temp = 0;
    if (direction.compare(r) == 0) {
        temp = numbers[numbers.size() - 1];
        for (int i = numbers.size() - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = temp;
    }
    else if (direction.compare(l) == 0) {
        temp = numbers[0];
        for (int i = 0; i < numbers.size() - 1; i++) {
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.size() - 1] = temp;
    }
    return numbers;
}

int main() {
    vector<int> answer = solution({ 4,455,6,4,-1,45,6 }, "left");
    for (int i = 0; i < answer.size(); i++) {
        cout << answer[i] << " ";
    }
}