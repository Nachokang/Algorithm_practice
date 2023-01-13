//
// 2023.01.13
// 프로그래머스 0단계 - 문자열 뒤집기
// 강다운
//

#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

string solution(string my_string) {
    string answer;
    reverse(my_string.begin(), my_string.end());
    for (int i = 0; i < my_string.size(); i++) {
        answer.push_back(my_string[i]);
    }
    return answer;
}

int main() {
    string answer = solution("jaron");
    cout << answer << endl;
}