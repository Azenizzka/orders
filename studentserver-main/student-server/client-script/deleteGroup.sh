#!/bin/bash


curl -XDELETE http://localhost:9797/groups/$1 \
 -H "Content-Type: application/json" \
 -H "Accept: application/json" \
 -d  "@deletedGroup.json" | jq

echo ""



