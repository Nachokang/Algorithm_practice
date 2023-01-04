
def solution(babbling):
    answer = 0
    speakable = ["aya", "ye", "woo", "ma"]
    for i in range(len(babbling)):
        for j in range(len(speakable)):
            if speakable[j] in babbling[i]:
                babbling[i] = babbling[i].replace(speakable[j], '1')
                if babbling[i].isdecimal():
                    answer += 1
    return answer

if __name__ == '__main__':
    test = ["aya", "yee", "u", "maa", "wyeoo"]
    print(solution(test))