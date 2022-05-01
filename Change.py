# Python3 program for the above approach

# function to count inversion 
# count of the string 
def inversionCount(s): 
	
	# for storing frequnecy 
	freq = [0 for _ in range(26)] 
	inv = 0
	for i in range(len(s)): 
		
		# we'll add all the characters 
		# which are less than the ith 
		# character before i. 
		temp = 0
		for j in range(ord(s[i]) - ord('a')): 
			
			# adding the count to 
			# inversion count 
			temp += freq[j] 
			
		inv += (i - temp) 
		
		# updating the character in 
		# the frequency array 
		freq[ord(s[i]) - ord('a')] += 1
	return inv 

# function to check whether 
# any of the string have a 
# repeated character 
def haveRepeated(S1, S2): 
	freq = [0 for _ in range(26)] 
	for i in range(len(S1)): 
		if freq[ord(S1[i]) - ord('a')] > 0: 
			return 1
		freq[ord(S1[i]) - ord('a')] += 1

	for i in range(26): 
		freq[i] = 0

	for i in range(len(S2)): 
		if freq[ord(S2[i]) - ord('a')] > 0: 
			return 1
		freq[ord(S2[i]) - ord('a')] += 1

	return 0

# function to check whether 
# the string S1 and S2 can 
# be made equal by reversing 
# sub strings ofsame size in 
# both strings 
def checkToMakeEqual(S1, S2): 

	# frequency array to check 
	# whether both string have 
	# same character or not 
	freq = [0 for _ in range(26)] 

	for i in range(len(S1)): 
		
		# adding the frequency; 
		freq[ord(S1[i]) - ord('a')] += 1

	flag = 0
	for i in range(len(S2)): 
		if freq[ord(S2[i]) - ord('a')] == 0: 
			
			# if the character is not in S1 
			flag = 1
			break
			
		# decrementing the frequency 
		freq[ord(S2[i]) - ord('a')] -= 1
	
	if flag == 1: 
		
		# If both string does not 
		# have same characters or not 
		print("No") 
		return

	# finding inversion count of 
	# both strings 
	invCount1 = inversionCount(S1) 
	invCount2 = inversionCount(S2) 

	if ((invCount1 == invCount2) or
	((invCount1 % 2) == (invCount2 % 2)) or
		haveRepeated(S1, S2) == 1): 
			
		# If inversion count is same, 
		# or have same parity 
		# or if any of the string 
		# have a repeated character 
		# then the answer is Yes else No 
		print("Yes") 
	else: 
		print("No") 

# Driver Code 
S1 = "110001"
S2 = "001101"

checkToMakeEqual(S1, S2) 

