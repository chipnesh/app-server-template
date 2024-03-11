#!/bin/bash
eval $(minikube docker-env)
./gradlew clean publishImageToLocalRegistry
helm uninstall ${{values.component_id | dump}}
helm install ${{values.component_id | dump}} deploy
