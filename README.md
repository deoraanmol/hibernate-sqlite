# Hibernate-Sqlite Integration

Since it's trivial to integrate sqlite with any modern-day ORM, creating this project as a sample reference for kickstarting the project.

## SQLite Driver
I've used - `org.xerial.sqlite-jdbc.3.15.1`

(Refer for more info - https://github.com/xerial/sqlite-jdbc)

## SQLite Dialect
Since hibernate needs to know a dialect, and it does not currently have any native dialect for Sqlite, we've to use some 3rd party dialect, which varies for
Hibernate versions. For v4.x:

I've used - `com.enigmabridge.hibernate4-sqlite-dialect.0.1.2`

(Refer for more info - https://github.com/EnigmaBridge/hibernate4-sqlite-dialect)


## SQLite Tool
For OSX, you can use TablePlus.

(Download from - https://tableplus.com/)
