#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
	vector<int> divisible;
	int undivisible = -1;
	for (auto i : arr) {
		if (i % divisor == 0) {
			divisible.push_back(i);
		}
	}
	if (divisible.empty()) {
		divisible.push_back(undivisible);
	}
	sort(divisible.begin(), divisible.end());
	return divisible;
}