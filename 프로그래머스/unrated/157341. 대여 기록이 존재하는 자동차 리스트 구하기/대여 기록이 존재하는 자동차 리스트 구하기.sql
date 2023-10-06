-- 코드를 입력하세요
SELECT H.CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H 
LEFT JOIN CAR_RENTAL_COMPANY_CAR C
ON C.CAR_ID = H.CAR_ID
WHERE TO_CHAR(H.START_DATE, 'MM') = '10' AND C.CAR_TYPE LIKE '세단'
GROUP BY H.CAR_ID
ORDER BY H.CAR_ID DESC