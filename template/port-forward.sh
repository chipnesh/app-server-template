#!/bin/bash
export POD_NAME=$(kubectl get pods --namespace default -l "app.kubernetes.io/name=${{values.component_id | dump}},app.kubernetes.io/instance=${{values.component_id | dump}}" -o jsonpath="{.items[0].metadata.name}")
export CONTAINER_PORT=$(kubectl get pod --namespace default $POD_NAME -o jsonpath="{.spec.containers[0].ports[0].containerPort}")
echo "App ${{values.component_id | dump}} is available at http://127.0.0.1:8080"
kubectl --namespace default port-forward $POD_NAME 8080:$CONTAINER_PORT
