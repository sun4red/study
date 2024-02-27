class Bird:
    def fly(self):
        raise NotImplementedError
#     주로 꼭 작성해야할 내용이 미구현됬을 때 일부러 발생시키는 에러라고 함


class Eagle(Bird):
    # pass
    def fly(self):
        print("fast")
# 메소드 오버라이딩하여 구현시켜주면 에러가 발생하지 않는다.


eagle = Eagle()
eagle.fly()

