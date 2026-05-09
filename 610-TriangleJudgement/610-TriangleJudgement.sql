-- Last updated: 5/9/2026, 11:31:09 AM
# Write your MySQL query statement below
select * ,if(x+y>z and y+z>x and x+z>y,"Yes","No") as triangle from triangle