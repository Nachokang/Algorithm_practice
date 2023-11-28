#include <string>
#include <vector>

using namespace std;

string solution(int num) {
    string answer = "";
    
    if(num%2==0) {
        answer = "Even";
        return answer;
    }
    
    answer = "Odd";
    return answer;
}