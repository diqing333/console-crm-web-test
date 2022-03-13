#!/bin/sh
# wangdiqing / WDQdiqing@**123DD

name=$1
id=`openssl rand -base64 23`
echo "+-------------+----------------------------------+"
echo "|   Property  |              Value               |"
echo "+-------------+----------------------------------+"
echo "| description |                                  |"
echo "|   enabled   |               True               |"
echo "|      id     | $id |"
echo "|     name    |             $name              |"
echo "|     type    |             $name              |"
echo "+-------------+----------------------------------+"
