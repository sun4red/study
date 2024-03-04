class Calculator:
    def __init__(self):
        self.value = 0

    def add(self, val):
        self.value += val

class UpgradeCalculator(Calculator):
    def minus(self, val):
        self.value -= val

cal = UpgradeCalculator()

cal.add(10)
cal.minus(7)

print(cal.value)

class MaxLimitCalculator(Calculator):
    def add(self, val):
        self.value += val
        if self.value > 100:
            self.value = 100

cal = MaxLimitCalculator()
cal.add(50)
cal.add(60)
print(cal.value)

print("="*20)# 구분선

print(all([1,2,abs(-3)-3]))
print(chr(ord('a'))=='a')

print("="*20)# 구분선

q4 = filter(lambda x: x>0, [1,-2,3,-5,8,-3])
print(list(q4))

print("="*20)# 구분선

q6 = map(lambda x: x * 3, [1,2,3,4])
print(list(q6))