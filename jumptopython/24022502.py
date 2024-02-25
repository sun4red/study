class Cal:
    def add(self, a, b):
        print("a+b = " + str(a+b))
        return a+b
    def multi(self, a, b):
        print(("a*b = " + str(a*b)))
        return a*b
    def div(self, a, b):
        print(("a/b = " + str(a/b)))
        return a/b

c1 = Cal()
r1 = c1.add(3,4)

r2 = c1.multi(5,6)

r3 = c1. div(7, 2)

c2 = Cal()

r4 = c2.add(4,5)
r5 = c1.add(8,9)
print(r1, r2, r3, r4, r5)

class I1:
    # 생성자
    def __init__(self, a, b):
        self.a = a
        self.b = b
    def p(self):
        print(self.a)
        print(self.b)

i1 = I1(3,4)
i1.p()

class ExCal(Cal):
    # 상속
    def pow(self, a, b):
        print("a^b = " + str(a**b))
        return a**b
    # 메소드 오버라이딩
    def div(self, a, b):
        if (b==0):
            print("0으로 나누는 것은 불능")
            return 0
        else:
            print("a/b = " + str(a/b))
            return a/b


ec1 = ExCal()
ec1.pow(3,4)
ec1.add(5,6)

# d0 = c1.div(4,0)
# 오류가 발생하면 프로그램 종료가 되네
d1 = ec1.div(6,0)