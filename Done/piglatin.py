import sys

cons = "bcdfghjklmnpqrstvwxz"


for line in sys.stdin:

    out = ""
    words = line.split()
    for word in words:
        if word[0] in cons:
            for i, c in enumerate(word):
                if c not in cons:
                    out += word[i:] + word[:i] + "ay "
                    break
        else: 
            out += word +"yay "

    print(out)
import sys

cons = "bcdfghjklmnpqrstvwxz"


for line in sys.stdin:

    out = ""
    words = line.split()
    for word in words:
        if word[0] in cons:
            for i, c in enumerate(word):
                if c not in cons:
                    out += word[i:] + word[:i] + "ay "
                    break
        else: 
            out += word +"yay "

    print(out)