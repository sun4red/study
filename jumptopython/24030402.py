import urllib.request

def get_wikidocs(page):
    resource = 'http://wikidocs.net/{}'.format(page)
    with urllib.request.urlopen(resource) as s:
        with open('wikidocs_%s.html' % page, 'wb') as f:
            f.write(s.read())


get_wikidocs(12)