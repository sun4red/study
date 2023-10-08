a = 100
result = 0
for i in range(1, 3):
    result = a >> i
    # 시프트 연산자, a에 저장된 값을 오른쪽으로 i비트 이동시킨다음 result에 저장
    # 정수는 4byte, 2진수로 변환..
    result = result + 1
print(result)
