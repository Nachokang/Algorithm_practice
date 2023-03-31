#include <string>
#include <vector>
#include <iostream>

using namespace std;

int GCD(int num1, int num2) { // 최대공약수 (유클리드 호제법)
    int gcd;
    while (num2 != 0) {
        gcd = num1 % num2;
        num1 = num2;
        num2 = gcd;
    }
    return num1;
}

int LCD(int num1, int num2) { // GCD를 이용해서 최소공배수
    return num1 * num2 / GCD(num1, num2);
}

vector<int> solution(int denum1, int num1, int denum2, int num2) {
    vector<int> answer;
    int lcd = LCD(num1, num2); // 분자 두개의 최소공배수를 구한다 (통분하기 위해)
    denum1 *= lcd / num1; 
    denum2 *= lcd / num2;
    // 분자 두개에 각각 분모의 최소공배수를 분모로 나눠준 수를 곱한다 (통분) 
    int d = GCD((denum1+denum2), lcd);
    // 기약분수로 만들어주기 위한 변수 d (통분된 분자 분모의 최대공약수를 구할수 있다면 구함)
    answer.push_back((denum1+denum2) / d);
    answer.push_back(lcd / d);
    return answer;
}