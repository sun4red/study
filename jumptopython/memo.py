import sys

option = sys.argv[1]
# 프로그램을 실행할 때 입력된 값을 읽어들일 수 있는 파이썬 라이브러리
# sys.argv[0]은 파이썬 프로그램 이름(memo.py)이므로 필요하지 않다.

if option == '-a':
    memo = sys.argv[2]
    f = open('memo.txt', 'a')
    f.write(memo)
    f.write('\n')
    f.close()




print(option)
print(memo)
