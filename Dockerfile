FROM mysql:8.0.27

ENV MYSQL_DATABASE=mary \
    MYSQL_USER=admin \
    MYSQL_PASSWORD=3502 \
    MYSQL_ROOT_PASSWORD=3502

COPY src/main/resources/db.sql /docker-entrypoint-initdb.d/

CMD ["mysqld"]

EXPOSE 3306
