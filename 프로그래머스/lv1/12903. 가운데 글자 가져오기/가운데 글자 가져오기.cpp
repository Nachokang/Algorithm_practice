#include <string>
#include <vector>

using namespace std;

string solution(string s) {
	int oddMedian = s.size() / 2;
	int evenMedian = s.size() / 2;
	string answer;
	if (s.size() % 2 != 0) {
		answer = s[oddMedian];
		return answer;
	}
	else {
		answer = s[evenMedian-1];
		answer += s[evenMedian];
		return answer;
	}
}