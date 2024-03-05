# 7.
list7 = [-8,2,7,5,-3,5,0,1]

m1 = min(list7)
m2 = max(list7)

print(m1, m2, end= " ")
print(m1 + m2)


# 8.
q8 = 17/3

q8 = round(q8, 4)
print(q8)

# 9.

import os
dir = os.chdir("D:/")
result = os.popen("dir")
print(result.read())
# ? os.popen은 어떻게 작동하는가
# os 모듈에 디렉토리 변경 정보가 들어간다
# os1 = os() 얘 자체가 객체라서 새로 생성자를 못쓴다고 한다.
# os1.chdir

# class MyOs(os):
#     pass
#
# myOs1 = MyOs()
# myOs2 = MyOs()
#
# print(myOs1, myOs2)

# 10.
import glob
pys = glob.glob("d:/dev/study/jumptopython/*.py")
print(pys)

# 11.
import time
t1 = time.time()
t2 = time.ctime()
# print(t2)
t3 = time.localtime()
print(t3)
ts = str(t3.tm_year) + "/" + str(t3.tm_mon) + "/" + str(t3.tm_mday) + " " + str(t3.tm_hour) + ":" + str(t3.tm_hour) + ":" + str(t3.tm_sec)
print(ts)
# zzz

t4 = time.strftime("%Y/%m/%d %H:%M:%S")
print(t4)

# 12.
import random
# ran = int(random.random() * 45 + 1)
# print(ran)
lot = set()
while len(lot) < 6:
    ran = int(random.random() * 45 + 1)
    lot.add(ran)
print(lot)

# 13.
import datetime

birth1 = datetime.date(1995,11,20)
birth2 = datetime.date(1998,10,6)

gap = birth2-birth1
print(gap)

# 14
data = [('윤서현', 15.25),
        ('김예지', 13.31),
        ('박예원', 15.34),
        ('송순자', 15.57),
        ('김시우', 15.48),
        ('배숙자', 17.9),
        ('전정웅', 13.39),
        ('김혜진', 16.63),
        ('최보람', 17.14),
        ('한지영', 14.83),
        ('이성호', 17.7),
        ('김옥순', 16.71),
        ('황민지', 17.65),
        ('김영철', 16.7),
        ('주병철', 15.67),
        ('박상현', 14.16),
        ('김영순', 14.81),
        ('오지아', 15.13),
        ('윤지은', 16.93),
        ('문재호', 16.39)]
import operator
sd = sorted(data, key=operator.itemgetter(1))
print(sd)

# 15.

cleaner = ['나지혜', '성성민', '윤지현', '김정숙']
import itertools
combi = itertools.combinations(cleaner, 2)
print(list(combi))

# 16.

s = "abcd"

result = itertools.permutations(s,4)
# permutations => 순열
for r in result:
    print(''.join(r))
    # 리턴되는 순열은 튜플이다.

# 17.

member = ['김승현', '김진호', '강춘자', '이예준', '김현주']
todo = ['청소', '빨래', '설거지']
program  = itertools.zip_longest(member, todo, fillvalue="휴식")
print(list(program))
# 무작위로 섞어서
member = random.sample(member, len(member))
program = itertools.zip_longest(member, todo, fillvalue= "휴식")
print(list(program))

# 18.

# 가로 200, 세로 80ㅡ 되도록 큰 정사각형
import math
width = 200
depth = 80

length = math.gcd(width,depth)
wcount = width/length
dcount = depth/length
scount = wcount*dcount
print(scount)