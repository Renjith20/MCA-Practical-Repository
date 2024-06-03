#!/bin/bash
echo "Enter your age:"
read a
if [ $a -lt 18 ]
then
	echo  "Not Eligible for voting"
else
        echo  "Eligible for voting"
fi

