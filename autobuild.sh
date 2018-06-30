#!/bin/bash
MON=$1
COMMAND="du -sh -b $MON"
val1=`$COMMAND`
while(true);do
    echo "val1 " $val1
    val2=`$COMMAND`
    echo "val2 " $val2
    sleep 1
    if [ "$val1" != "$val2" ];then
	    mvn install -T100 -DskipTests=true
	    val1=$val2
        notify-send "Project rebuilded"
    fi
done