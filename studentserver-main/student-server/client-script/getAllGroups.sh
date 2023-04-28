#!/bin/bash

curl -XGET http://localhost:9797/student-groups \
 -H "Content-Type: application/json" | jq 
echo ""

