#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> sides) {
	int check = 2;
	int max = 0;
	int othersum = 0;

	sort(sides.begin(), sides.end());
	max = sides[2];
	othersum = sides[0] + sides[1];

	if (max < othersum) {
		check = 1;
		return check;
	}
	else
	{
		return check;
	}
}