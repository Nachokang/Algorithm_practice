//
// 2023.01.10
// 프로그래머스 레벨 0 - 피자 나눠 먹기 (2)
// 강다운
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int GCD(int a, int b) { // 최대공약수 구하기 (유클리드 호제법)
    int gcd;
    while (b != 0) {
        gcd = a % b;
        a = b;
        b = gcd;
    }
    return a;
}

int LCD(int a, int b) { // GCD를 이용해서 최소공배수 구하기
    return a * b / GCD(a, b);
}

int solution(int n) {
    int leastpizza = LCD(n, 6) / 6;
    return leastpizza;
}

int main() {
	int answer = solution(10);
	cout << answer << endl;
}