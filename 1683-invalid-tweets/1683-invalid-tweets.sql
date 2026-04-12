# Write your MySQL query statement below

SELECT tweet_id FROM Tweets AS T 
    WHERE
        CHAR_LENGTH(T.content) > 15