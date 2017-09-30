FROM java:8
EXPOSE 8081:8081
ADD /target/EasyRentals.war EasyRentals.war
ENTRYPOINT ["java","-war","EasyRentals.war"]