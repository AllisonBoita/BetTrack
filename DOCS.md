Table user {
id integer [pk, increment]
username varchar
document varchar [unique]
email varchar [unique]
}

Table bets {
id integer [pk, increment]
user_id integer [ref: > user.id]
home varchar
away varchar
bet varchar
stake decimal
odd decimal
result enum [note: "GREEN, RED, CASHOUT, REEMBOLSO"]
data datetime
}