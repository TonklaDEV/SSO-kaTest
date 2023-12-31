# ระบบงาน SSO TEST

SSO API Project เป็นโปรเจกต์ที่พัฒนาขึ้นเพื่อรองรับการสร้าง SSO User และทำการบันทึกข้อมูลลงฐานข้อมูล SSO Users และ ให้บริการ Generate Token


## วิธีการติดตั้ง

1.  ดาวน์โหลดโครงสร้างโปรเจกต์จาก GitHub Repository
```bash
    git clone https://github.com/TonklaDEV/SSO-kaTest.git
    cd SSO-kaTest 
 ```

2.  เปิดโปรเจกต์ใน IDE ที่คุณต้องการใช้งาน

## วิธีการใช้งาน
 1. Set up Database โดยใช้ PostgreSQL version 13
	 - Port: 5432
	 - Database: ssotest
	 - Table: sso_user_test 
	 - Username: ssodev
	 - Password: sso2022ok
	```
	create table sso_user_test
	(
	    request_date          timestamp not null
	        constraint pk_sso_user_test
	            primary key,
	    ssotype               varchar(50),
	    systemid              varchar(50),
	    systemname            varchar(250),
	    systemtransactions    varchar(250),
	    systemprivileges      varchar(250),
	    systemusergroup       varchar(50),
	    systemlocationgroup   varchar(50),
	    userid                varchar(200),
	    userfullname          varchar(500),
	    userrdofficecode      varchar(250),
	    userofficecode        varchar(250),
	    clientlocation        varchar(250),
	    locationmachinenumber varchar(500),
	    tokenid               varchar(1000)
	);
	```
	![enter image description here](https://lh3.googleusercontent.com/pw/AIL4fc-jG0RrIKwp55axPvaUyTBIMk-sNKThKKInozsjtzfq9KQlzaNlAKT1yZgAzCyCIaQVghgsFnI33J2hHc4-No9teI8M-ayglvWDGsYYxoN13DM0PEkfIJJftw4XQq6Dw9FTroF_1-YBZoy29RaqJ3l1jSFL4G4BhOWT7loTIH2WpMYY6Mm6wI02xk7Lqg6CxR2JZv_g9GOjlyTGdVBZEUDken7WVOVouKEh1xSvVAhRyZtOKAHbhvUk_FdlaT5VH7CIwo6bdHHCY212z2JCsaeGAiETjUdiT8HPHfcaDv8eT0VCFmmrNOcJdqdDXSLG_f4QgMw3pHtBM035ebCrjM_0476jez7Q0-hy-R6Zsa_VHkOBr8rLZ6QojWNcETCoetUsn5qF980ON5X6q04rxzAy79k2ma19zKltkXaeZ4uJ_OgnI_DeQHWT-SkY_AOYTO6Ka5HHrQpl9MvpJrBQ6RlQV5SP6NcDZ-4N3E8hkcso8NNsR8nbpR4qLMVGFJonROqzHdju1Lf_-GLmqfSlLrcK0vA8rk2pfupMC_7AZWnaAh1YrsL1tKfASIR63Xn9sHo8N4_4QurM4RXgqeX4uZ-bqR8mDDPDUu0IIPi5xqyUe73bzoCY4zQvXUqssgi2YNw0vqgpW4Y9jDIvI-hnmaFCOwV2uCyciTDYv8-4X8wYeF4eORcVupFT8bDUqK4spvV0TEtI_75PGUcawtmtbW65-FXbu_W5SzGXRj1GloEhRlfPGdNdnTh4ydsM7HQK-aCSV6uvRebr5vgde5h0cgtBDvGewkvhVWZYni4bCWHZyLU0xGYho9cWgEpGNnlu-4cSyvnpKQ23Luzo1nbsWL2xtvpIDRGme0IrMX7Mo7r1PdROod7wisAdCBYy9b5vJElo3xqB2YZykxJCEz53GEwsoRYNw-KHsoo4xHnJ2zmYbfvrXENBLf4OfxfZgZX9XVb334Z7sULjqHhA2RECiFV0W49ZK0PHVZw=w415-h629-s-no?authuser=0)

 
 3. รันแอปพลิเคชันบน IDE ของคุณ
![enter image description here](https://lh3.googleusercontent.com/pw/AIL4fc-Zo8wJ_cjNxMMRrGe2gOoNrPr32MC0Wd4-8KLi5Z7OPh8q5-b737K8umPE0h1j3ep0K3Onx3YiYxP2i6-09ATLBl1goSXtpPiXdXHKTz2orgNimJL3V0FNCRRpzUMmCifrKBvmirVuaa3iD1d6LWrAWV8snUxBk_sk_LJTNJX1uTzbl5pNsQf1qGuw59WeoFCvPU34jXlXPQKhC3h6PXljkgcpXx6-BA-Rweya1ifyqUFaj4eTRo4Ove13dXRtGzba4LcOfJJIM2r4jrca7C53DxsI7FbisIotGsoABCOazRBjTp5gJlwvQVeKXNbpRdBpeM-DL4dLVYlSDR00ij8PqTU6Qcm2A5EyPcCAO_zf3KLsKurHYSHJi1BDCDCEjDQ4J6LKJf2J--YvrEPfLEIfo_0cPDMTBfUS95hXkhV1CsSP-Y4NFvMK1vZKJWR8ytRMTs-Y5OhkvnLR5kvoCzKjDfQKPi4kL2wPjPnTGt4mMS5SdKFN8e1_FSBx0vfqg6Zs_ZFMD9A4IM4G3g_ZBcuNXO1QIu9PrR9X3fUuV2BmvpVWRaOUW325BBIC0w2fD2CeBJcY_rAD8228Mw-WImZRZtRJaUL-Vqsh8nYsZySSjR-pBNK_jRvycjOYLdLozPOXHtz-sj4onz1Izl6s67jY9nwY6MMt8S8cJFnbE510B3Xi4qAt3RUWTy0_bYkXlNSPh1q4MdIunILYcVucpuu2kuEONmp8JIztwcGsghZop9JblQs941Knu1jtKGJGjTcv4iZm6a2OKs4fbFxBM8y0em81b5xvY8r39h84yhlc68vJJNj1JLoH2TJcvR2sBE9q7GG919uEfqOf1jio1w97yerWUD_mvQZIeFFPdjrg3mFbXOio-uunHwx5aNt1LsY1D5tL2sglCVDZGnooVkYEhtK0iep-C1o8NGYdFptbE2Aov7-baNpnVYG5XR9dgD8DrMdhsDP9fbSDXqczIYXTLVE8F2DOtjU=w1119-h629-s-no?authuser=0)
 4. ทดสอบ API โดยใช้ Swagger [http://localhost:8080/swagger-ui.html#](http://localhost:8080/swagger-ui.html#)
![enter image description here](https://lh3.googleusercontent.com/pw/AIL4fc8HoWn2D4SsmJWg13z5JYrySmgGB4KkRXCwT5eG3WOYs39DT4AkQw03s4XcqFgHf-scf7GzPQDdhJGFvgAC89GRU6oWOkMLN3t0-hfF9MngVHdotSog2Su2MJI2hhj6XhNgsD2DDuZYMrKwJcpPaLoxj1PftFi3u6tnsqSiklZwzg1rM-x39XF0n2UUeS6EPu7VpGpXRn8ml_OojDusY6OlGlg5jIaDGuVsKQxuf1lTRYpzUkjWyZwFqmKPwJ3nGraxk7fCZN9I35gxJFimfFtyuRuv2duDCoIhTidUj4LSzqbaM_5sr1rKWf30qwXupVWlX2IWvtaquzAbZu6F3RQfDI8GkHv4xwizPTz72AgPokAhL7qBwNJLn3cGanQR-4C8JKcsU3nbAWcbrgidy6VktRdhCmgRteuO0dKj9Df_pB8aCqIIPzvCBTWF4eGm7XgL6aX22OPPxGuG1BydQ21BpzWbESfB4nzaA_jQ9XFhJoXLx2bUX3SXf9hLzuLXeoi5hXlwvPqJj-81rXBY38SznSMW2uSWKMKBa93N8I551LR5kUBjebe0u2xjvnlmmyRkC34OA5JM7FmEeeURO_1aXAziXOmLbNAJb90n25El6kk_mlgNR4Ip1EqNKR-YDdvcQ_SKKlBgXz6SnCpjcp0LRLQ0CAe_43qkyMhELCaKJWU9uskwlKxS7KfrlKheMlA94GTp09VTLN4fk1nFald3RHs_cQfL7cDijjMERJSgf4TrmHmmU2_hirufGeQBw9tniQZnXDlzf16NYroCKW9H18McV2CVxboTYCMWgA_F8aQEAYz39zSTniiIHSIh0NeKWXzc-gnP8KOP5CUdV74bMP1dY_7qMo6QvwPyr-zJOPn4RQzkxTABZ5YoD5ApfL4Z49aO5NnkT9X0RdPR3awdSMaZeLMAZMmRoAPWfWTKj8gY0vx5xWJey0SVEmF4fiRCGC_TXwObF-uLorMK_rPfZuYNyjNEo7U=w1119-h629-s-no?authuser=0)
#### ตัวอย่าง JSON Request
```bash
{
  "ssoType": "SSOData",
  "systemId": "VATDEDEV",
  "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
  "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
  "systemPrivileges": "0|0|0|0",
  "systemUserGroup": "GRP-010,GRP-020,GRP-040",
  "systemLocationGroup": "CliC001",
  "userId": "WS233999",
  "userFullName": "ประสาท จันทร์อังคาร",
  "userRdOfficeCode": "01000999",
  "userOfficeCode": "01001139",
  "clientLocation": "01001139",
  "locationMachineNumber": "CLI00000718-9999",
  "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
}
```
## API Endpoints

### Create SSO User

**URL:** `/apitest/gentoken` **Method:** POST **Request Body:** JSON
#### Request
```bash
{
  "ssoType": "SSOData",
  "systemId": "VATDEDEV",
  "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
  "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
  "systemPrivileges": "0|0|0|0",
  "systemUserGroup": "GRP-010,GRP-020,GRP-040",
  "systemLocationGroup": "CliC001",
  "userId": "WS233999",
  "userFullName": "ประสาท จันทร์อังคาร",
  "userRdOfficeCode": "01000999",
  "userOfficeCode": "01001139",
  "clientLocation": "01001139",
  "locationMachineNumber": "CLI00000718-9999",
  "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
}
```
#### Response (Success)
```bash
{
  "responseCode": "I07000",
  "responseMessage": "ทำรายการเรียบร้อย",
  "responseData": {
    "userId": "WS233999",
    "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
  }
}
```
#### Response (Error)
```bash
{
  "responseCode": "E000001",
  "responseMessage": "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
  "responseData": {
    "userId": "WS233999",
    "tokenId": " "
  }
}
```

## ของบังคับ (Dependencies)
- Swagger2 และ Swagger-ui
```
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.9.2</version>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>2.9.2</version>
</dependency>
```
- PostgreSQL
```
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
```
