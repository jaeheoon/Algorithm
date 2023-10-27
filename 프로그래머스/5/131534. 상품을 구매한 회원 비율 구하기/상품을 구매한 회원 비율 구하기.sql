-- 코드를 입력하세요
SELECT TO_CHAR(SALES_DATE, 'YYYY') YEAR,
       TO_NUMBER(TO_CHAR(SALES_DATE, 'MM')) MONTH,
       COUNT(DISTINCT(I.USER_ID)) PUCHASED_USERS,
       ROUND(COUNT(DISTINCT(I.USER_ID)) / 
             (SELECT COUNT(DISTINCT(USER_ID)) 
              FROM USER_INFO
              WHERE TO_CHAR(JOINED, 'YYYY') = '2021')
             ,1) PUCHASED_RATIO       
FROM USER_INFO I RIGHT JOIN ONLINE_SALE S ON I.USER_ID = S.USER_ID
WHERE TO_CHAR(JOINED, 'YYYY') = '2021'
GROUP BY TO_CHAR(SALES_DATE, 'YYYY'), TO_CHAR(SALES_DATE, 'MM')
ORDER BY 1, 2