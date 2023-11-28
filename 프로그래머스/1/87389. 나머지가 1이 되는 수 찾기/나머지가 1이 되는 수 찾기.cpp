#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int temp = 0;
    
    for (int i = 1; i < n; i++) {
        if(n%i==1) {
            answer = i;
            temp = i;
            if(temp <= answer) {
                answer = temp;
                break;
            }
        }
    }
    
    return answer;
}