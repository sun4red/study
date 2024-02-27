try:
    4/0
except ZeroDivisionError as e:
    print(e)


try:
    f = open("test.txt", "r")
    print(f.read())
finally:
    f.close()



try:
    a = [1.2]
    print(a[3])
    4/0
except ZeroDivisionError:
    print("0으로 나눌 수 없습니다.")
except IndexError:
    print("인덱싱할 수 없습니다.")
# 먼저 오류가 발생한 것으로 예외처리