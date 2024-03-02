import functools

data = [1,2,3,4,5]
result = functools.reduce(lambda x, y: x + y, data)
print(result)


# functools.reduce(function, iterable)
# 반복 가능한 객체(iterable)의 요소에 차례대로(왼쪽부터 오른쪽으로) 누적 적용하여
# 이 객체를 하나의 값으로 줄이는 함수

from operator import itemgetter

student = [
    ("jane", 22, 'A'),
    ("dave", 32, 'B'),
    ("sally", 17, 'B')
]

result = sorted(student, key=itemgetter(1))
print(result)
# 튜플의 1번 요소를 기준으로 정렬

students = [
    {"name":"jane", "age":22, "grade":'A'},
    {"name":"dave", "age":32, "grade":'B'},
    {"name":"sally", "age":17, "grade":'B'}
]

result = sorted(students, key=itemgetter('age'))
print(result)

# 클래스는 attrgetter 사용

import shutil
shutil.copy("D:/dev/study/jumptopython/새파일.txt","D:/dev/study/jumptopython/새파일.txt.bak")