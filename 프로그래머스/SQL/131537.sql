SELECT
    DATE_FORMAT(C.SALES_DATE, '%Y-%m-%d') SALES_DATE
     , C.PRODUCT_ID
     , C.USER_ID
     , C.SALES_AMOUNT
FROM (SELECT
          A.SALES_DATE
           , A.PRODUCT_ID
           , A.USER_ID
           , A.SALES_AMOUNT
      FROM ONLINE_SALE A
      UNION
      SELECT
          B.SALES_DATE
           , B.PRODUCT_ID
           , NULL USER_ID
           , B.SALES_AMOUNT
      FROM OFFLINE_SALE B ) C
WHERE C.SALES_DATE LIKE '2022-03-%'
ORDER BY C.SALES_DATE, C.PRODUCT_ID, C.USER_ID;
