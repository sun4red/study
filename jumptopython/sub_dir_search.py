import os

def search(dirname):
    # print(dirname)
    try:
        filenames = os.listdir(dirname)
        for filename in filenames:
            full_filename = os.path.join(dirname, filename)
            if os.path.isdir(full_filename):
                search(full_filename)
            else:
                ext = os.path.splitext(filename)[-1]
                if ext == '.py':
                    print(full_filename)

    except PermissionError:
        pass


search("d:/")

