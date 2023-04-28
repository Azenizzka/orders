#!/bin/bash

curl -XGET http://localhost:9797/students \
 -H "Content-Type: application/json" | jq 
echo ""






