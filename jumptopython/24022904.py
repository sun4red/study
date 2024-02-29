import random
def random_pop(data):
    number = random.randint(0,len(data) - 1)
    return data.pop(number)

if __name__ == "__main__":
    data = [1,2,3,4,5]
    while data:
        print(random_pop(data))

import itertools

student = ['한민서', '황지민', '이영철', '이광수', '김승민']
snacks = ['사탕', '초콜릿', '젤리']

result = itertools.zip_longest(student, snacks)
print(result)
print(list(result))

result = itertools.zip_longest(student,snacks,fillvalue='새우깡')
print(list(result))


lip = list(itertools.permutations(['1','2','3'],2))
print(lip)
# 반복가능한 객체 중에서 r개를 선택한 순열을 이터레이터로 리턴
# 이터레이터?

it = itertools.combinations(range(1,46),6)
# for num in it:
    # print(num)
print(len(list(itertools.combinations(range(1,46),6))))