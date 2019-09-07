# spring-cloud

If you do not have public ip address or public domain name set up yet, you can publish (simulate) the webhook event for the Config Server by calling the /monitor endpoint with given request body. Then the Config Server will consider it as a webhook event published by the related repository service provider and continue with rest of the operations.

curl -v -X POST "http://localhost:<<ConfigServerPort>>/monitor" \
-H "Content-Type: application/json" \
-H "X-Event-Key: repo:push" \
-H "X-Hook-UUID: webhook-uuid" \
-d '{"push": {"changes": []} }'
