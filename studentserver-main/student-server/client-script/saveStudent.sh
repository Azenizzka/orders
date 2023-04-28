#!/bin/bash


curl -XPOST http://localhost:9797/students \
 -H "Content-Type: application/json" \
 -H "Accept: application/json" \
 -d  "@student.json" | jq

echo ""






