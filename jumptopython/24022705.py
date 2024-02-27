class MyError(Exception):
    pass

def say_nick(nick):
    if nick == '바보':
        raise MyError()
    print(nick)


try:

    say_nick("천사")
    say_nick("바보")

except MyError:
    print("허용되지 않는 별명")



def say_nick2(nick):
    if nick == '바보':
        raise MyError2()
    print(nick)

class MyError2(Exception):
    def __str__(self):
        return "금지된 별명"

try:
    say_nick2("천재")
    say_nick2("바보")
except MyError2 as e:
    print(e)