# 튜플
t1 = ()
print(t1)
t2 = (2)
# 요소 한 개일 때 ',' 표기 안하면 튜플로 인식 하지 않음
t3 = (2,)
print(t2)
print(t3)
t4 = (3,4,5)
print(t4)
t5 = 1,35,3,1
print(t5)
# 튜플 요솟값 변경 불가
print(t5[2:])
t6 = (t5[0],) + t4[:2]
print(t6)
t7 = t3 + t4
print(t7)

d1 = {"키" : "값", "인덱스도" : "마찬가지"}
print(d1)
print(d1.get("키"))
del d1['키']
print(d1)

d2 = {'키1' : '값1', '키2' : '값2', 'key3' : 'value3'}
print(d2)
d2k = d2.keys()
print(d2k)
# 리스트로 변환
l1 = list(d2.keys())
print(l1)
print(d2.values())
print(d2.items())

b1 = '키2' in d2
print(b1)

s1 = set([1,2,3])
print(s1)
s2 = {"hello"}
print(s2)
s3 = set("rain")
print(s3)

s11 = {1,2,3,4,5,6}
s12 = {4,5,6,7,8,9}
s13 = s11 & s12
print(s13)
s14=s11.intersection(s12)
print(s14)
s15 = s11 | s12
print(s15)
s16 = s11.union(s12)
print(s16)