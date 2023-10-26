-- 코드를 입력하세요
SELECT HISTORY_ID, 
       (DAILY_FEE*(B.END_DATE-B.START_DATE+1))*NVL(1-DISCOUNT_RATE/100, 1) FEE 
FROM CAR_RENTAL_COMPANY_CAR A JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B 
ON A.CAR_ID = B.CAR_ID
LEFT OUTER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN C
ON A.CAR_TYPE = C.CAR_TYPE
AND C.DURATION_TYPE = (CASE WHEN (B.END_DATE-B.START_DATE+1)>='90' THEN '90일 이상'
                            WHEN (B.END_DATE-B.START_DATE+1)>='30' THEN '30일 이상'
                            WHEN (B.END_DATE-B.START_DATE+1)>='7' THEN '7일 이상'
                          ELSE NULL END)
WHERE 1=1
AND A.CAR_TYPE = '트럭'
ORDER BY FEE DESC, B.HISTORY_ID DESC