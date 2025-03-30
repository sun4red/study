class Parent:
    def __init__(self):
        print("parent 생성자")
    def __del__(self):
        print("parent 소멸자")
    def show(self):
        print("sunny")

class Child(Parent):
    def show(self):
        print("snow")


a = Child()
a.show()
del a