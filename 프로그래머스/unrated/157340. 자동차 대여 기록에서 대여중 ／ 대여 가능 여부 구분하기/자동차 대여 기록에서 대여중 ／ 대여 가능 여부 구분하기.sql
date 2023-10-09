-- 코드를 입력하세요
SELECT CAR_ID, 
CASE WHEN CAR_ID NOT IN  (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE '2022-10-16' BETWEEN TO_CHAR(START_DATE,'YYYY-MM-DD') AND TO_CHAR(END_DATE,'YYYY-MM-DD')) 
THEN '대여 가능'
ELSE '대여중'
END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;