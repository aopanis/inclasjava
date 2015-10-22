x = int(raw_input("Columns... "))
y = int(raw_input("Rows... "))

print " ",
for i in range(1, x + 1):
	print i,
print ""
lineNumber = 1
def printLine(lineNumber):
	print lineNumber ,
	for l in range(1, x):
		print l * lineNumber,
	
	print ""
for n in range(1, y):
	printLine(n)
	 