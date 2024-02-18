l1 = [1,2,3]
print(l1)
l2 = [4,l1,6]
print(l2)
print(l2[0])
print(l2[1][2])
v1 = l1[1] + l2[0]
print(v1)

print(l2[0:2])


l3 = ['a', 1, 'b', 2, 'c', 'eta', 111]
print(l3)
print(l1 + l3)
print(l3*2)

print(str(3)+'abc')

del l3[1]
print(l3)

del l3[3:5]
print(l3)

l4 = [3, 5, 10, 2, 8, 5, 23]
print(l4)
l4.sort()
print(l4)

l4.append(2345)
print(l4)

# index(값) -> 값의 위치 출력
print(l4.index(2))

l4.insert(3,34352636)
print(l4)