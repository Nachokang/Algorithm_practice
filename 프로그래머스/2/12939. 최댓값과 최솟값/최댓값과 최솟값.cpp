#include <string>
#include <vector>
#include <algorithm>
#include <sstream>
#include <iostream>

using namespace std;

string solution(string s) {
    string answer = "";
    vector<string> sv;
    vector<int> iv;
    
    istringstream ss(s);
    string sbf;
    iv.clear();
    
    while(getline(ss, sbf, ' ')) {
        sv.push_back(sbf);
    }
    
    for(auto i : sv) {
        int n = stoi(i);
        iv.push_back(n);
    }
    
    int max = *max_element(iv.begin(), iv.end());
    int min = *min_element(iv.begin(), iv.end());
    
    answer += to_string(min) + " " + to_string(max);
    
    return answer;
}