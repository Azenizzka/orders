#!/bin/bash
curl -XGET -G http://localhost:9797/student-groups/add-student \
 -H "Accept: application/json" \
 -H "Content-Type: application/json" \
 -d studentId=$1 \
 -d studentGroupId=$2 \
 | jq 
 echo ""
