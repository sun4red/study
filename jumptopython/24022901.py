import datetime


day1 = datetime.date(2022,4,5)
day2 = datetime.date(2024,2,29)

diff = day2 - day1
print(diff)
print(diff.days)

print(day2.weekday())
# 0부터 월요일

print(day2.isoweekday())
# 1부터 7

import time
print(time.time())

print(time.localtime(time.time()))
# ? 이건 왜 설명이 부족하지

teatime = time.localtime(time.time())
y = teatime.tm_year
m = teatime.tm_mon
d = teatime.tm_mday
print(y,m,d)

# time.localtime 으로 부터 리턴된 튜플 형태의 값을 인수로 받아서 보기 쉬운 형태로 리턴
print(time.asctime(time.localtime(time.time())))

print(time.ctime())
# 현재 시간만

print(time.strftime('%c', time.localtime(time.time())))
print(time.strftime('%y' + '%m' + '%d', time.localtime(time.time())))
