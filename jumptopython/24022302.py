def add_many(*args):
    result = 0
    for i in args:
        result = result + i
    return result

r1 = add_many(1,2,3,4,5,6,7)
print(r1)

r2 = add_many(2,3,4,5,6,3,8,10,30)
print(r2)


def add_mul(choice, *args):
    if choice == "add":
        result = 0
        for i in args:
            result = result + i
    elif choice == "mul":
        result = 1
        for i in args:
            result = result * i
    return result

r3 = add_mul("add", 1,2,3,4)
print(r3)

l1 = [1,5,6,7]
r4 = add_mul("mul",l1)
print(r4)
r5 = add_mul("mul", 1,6,7,8)
print(r5)