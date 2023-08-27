a = {'apple', 'lemon', 'banana'}
a.update({'kiwi','banana'})
# 배열에 추가를 하는데, banana는 있으니까 추가 하지않음
a.remove('lemon')
# lemon 제거
a.add('apple')
# 사과 추가
for i in a :
    print("과일명 : %s" % i)
    # a 안에 있는거 출력