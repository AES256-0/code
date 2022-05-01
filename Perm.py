import itertools
t=input()
s=raw_input()
perm=itertools.permutations(s);
for patt in perm:
    print patt

