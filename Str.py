start = '11000011'
end = '11110000'

dp = [{} for _ in range(31)]
dp[1][start] = '' # Originally only start string is reachable

for i in range(2, len(start) + 1):
  for s in dp[i - 1].keys():
    # Try all possible reversals for each string in dp[i - 1]
    for j in range(len(start) - i + 1):
      newstr = s
      newstr = newstr[:j] + newstr[j:j+i][::-1] + newstr[j+i:]
      dp[i][newstr] = s
  if end in dp[i]:
    ans = []
    cur = end
    for j in range(i, 0, -1):
      ans.append(cur)
      cur = dp[j][cur]
    print(ans[::-1])
    exit(0)
