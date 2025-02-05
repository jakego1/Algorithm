WITH RankedColonies AS (
SELECT 
       ID
     , 
       NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS size_quartile 
 FROM ECOLI_DATA
)
SELECT 
       ID
     ,
  CASE size_quartile
  WHEN 1 THEN 'CRITICAL'
  WHEN 2 THEN 'HIGH'
  WHEN 3 THEN 'MEDIUM'
  WHEN 4 THEN 'LOW'
   END AS COLONY_NAME
  FROM RankedColonies
 ORDER BY ID;
