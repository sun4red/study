x = input('입력 : ')
# x값 입력
a = [ 'abc123' , 'def456', 'ghi789']
# 문자열 생성
a.append(x)
# 배열에 x값 삽입 a[3] (4번째 자리)
a.remove('def456')
# 제거
print(a[1][-3:], a[2][:-3], sep = ',')
# 1번자리 (제거 후 'ghi789')의 뒤부터 3자리 추출 = 789
# 2번자리 (xyz321 입력) 의 앞부터 3자리 추출
# 각 내용 , 로 구분
for i in range (3,6):
    print(i,end = ' ')
# 3 <= i < 6 반복, 반복문 끝에 공백 또한 반복

