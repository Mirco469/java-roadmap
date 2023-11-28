#!/bin/bash
# start new learning session
echo "*** cleaning main folder ***"
cd src/main/java/net/ielpo/roadmap
DATA=`find . -name "*.java"`
for RESOURCE in $DATA
do
	rm $RESOURCE
done
echo "*** cleaning test folder ***"
# reset test folder
cd ../../../../../test/java/net/ielpo/roadmap
DATA_TEST=`find . -name "*.java"`
for RESOURCE in $DATA_TEST
do
	rm $RESOURCE
done