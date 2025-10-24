# Write your MySQL query statement below

SELECT
    S.student_id,
    S.student_name,
    Sub.subject_name,
    COUNT(E.student_id) as attended_exams -- E 테이블의 컬럼을 세면, NULL은 0으로 처리됩니다.
FROM
    Students S
CROSS JOIN
    Subjects Sub
LEFT JOIN
    Examinations E on S.student_id = E.student_id and Sub.subject_name = E.subject_name
GROUP BY
    S.student_id,
    Sub.subject_name
ORDER BY
    S.student_id,
    Sub.subject_name;