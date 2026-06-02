# Last updated: 6/2/2026, 10:22:10 AM
1class Solution:
2    def earliestFinishTime(self, landStartTime, landDuration,
3                           waterStartTime, waterDuration):
4
5        ans = float('inf')
6
7        # Try every land-water ride pair
8        for i in range(len(landStartTime)):
9            for j in range(len(waterStartTime)):
10
11                # Case 1: Land -> Water
12                land_finish = landStartTime[i] + landDuration[i]
13                finish1 = max(land_finish, waterStartTime[j]) + waterDuration[j]
14
15                # Case 2: Water -> Land
16                water_finish = waterStartTime[j] + waterDuration[j]
17                finish2 = max(water_finish, landStartTime[i]) + landDuration[i]
18
19                # Update answer
20                ans = min(ans, finish1, finish2)
21
22        return ans