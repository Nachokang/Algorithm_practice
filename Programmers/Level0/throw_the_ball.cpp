//
// 2023.01.17
// 프로그래머스 0단계 - 공 던지기 (120843)
// code by 강다운
// special thanks to 이진희
//

#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers, int k) {
    vector<int> odd_sized_numbers;
    vector<int> even_sized_numbers;
    if (numbers.size() % 2 == 0) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers[i] % 2 != 0) {
                even_sized_numbers.push_back(numbers[i]);
            }
        }
        int idx = (k - 1) % even_sized_numbers.size();
        return even_sized_numbers[idx];
    }

    else
    {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers[i] % 2 != 0) {
                odd_sized_numbers.push_back(numbers[i]);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers[i] % 2 ==0)
                odd_sized_numbers.push_back(numbers[i]);
        }
        int idx = (k - 1) % odd_sized_numbers.size();
        return odd_sized_numbers[idx];
    }
}

int main() {
    int answer = solution({ 1,2,3,4,5 }, 17);
    cout << answer;
}