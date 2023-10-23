-- 코드를 입력하세요
(SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') SALES_DATE, PRODUCT_ID, NULL USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE 
WHERE TO_CHAR(SALES_DATE, 'MM') = '03')
UNION ALL
(SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE
WHERE TO_CHAR(SALES_DATE, 'MM') = '03')
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID