#!/bin/bash


curl -XDELETE http://localhost:9797/students \
 -H "Content-Type: application/json" \
 -H "Accept: application/json" \
 -d  "@delstudent.json" | jq

echo ""






