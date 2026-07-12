# Last updated: 7/12/2026, 8:45:33 AM
1class Solution:
2    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
3        def to_seconds(time):
4            h,m,s=map(int,time.split(":"))
5            return h*3600+m*60+s
6        return to_seconds(endTime)-to_seconds(startTime)