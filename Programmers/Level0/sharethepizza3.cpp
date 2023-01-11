//
// 2023.01.11
// 프로그래머스 0단계 - 피자 나눠 먹기 (3)
// 강다운
//

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int solution(int slice, int n) {
	if (slice < 2 || slice>10) {
		cout << "ERROR : Slices should be 2 to 10" << endl;
		return 0;
	}
	int pizza = 0;
	if (n % slice == 0)
		pizza = n / slice;
	else if (n % slice < slice)
		pizza = n / slice + 1;
	return pizza;
}

int main() {
	int answer = solution(7, 10);
	cout << answer << endl;
}