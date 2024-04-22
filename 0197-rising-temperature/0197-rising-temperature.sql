select x.id from weather x, weather y 
where datediff(x.recordDate, y.recorddate)=1 and x.temperature > y.temperature;