/*

https://leetcode.com/problems/rising-temperature/

Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
For example, return the following Ids for the above Weather table:

+----+
| Id |
+----+
|  2 |
|  4 |
+----+

*/


-- MySQL query for this question
-- 1) since we need to compare previous date present in same table, we need self join
-- 2) we need to join where the date difference is 1
 
select a.id from Weather a
inner join Weather b on datediff(a.RecordDate,b.RecordDate)=1
and a.Temperature>b.Temperature;
