#!/bin/bash


curl -XPOST http://localhost:9797/student-groups \
 -H "Content-Type: application/json" \
 -H "Accept: application/json" \
 -d  "@Group.json" | jq

echo ""
