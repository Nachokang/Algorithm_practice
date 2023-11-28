#include <string>
#include <vector>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    int temp = 0;
    
    while(n) {
        answer.push_back(n%10);
        n /= 10;
    }
    
    return answer;
}