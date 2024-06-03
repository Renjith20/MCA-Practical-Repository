#!/bin/bash
function area()
{
	echo Entered Radius: $1
	PI=3.14159
	a=$(echo "$PI*($1^2)"|bc)
        echo Area= $a
}

echo "Enter the radius"
read r
area $r

