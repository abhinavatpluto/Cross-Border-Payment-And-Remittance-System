# Create root project directory
mkdir cross-border-payment-platform
cd cross-border-payment-platform

# Create all module directories
$dirs = "common", "gateway", "config-server", "discovery", "transaction-service", "validation-service", "kyc-service", "exchange-service", "bank-credit-service", "notification-service", "audit-service"
foreach ($dir in $dirs) {
mkdir $dir
}

# Create Maven directory structure for each service
$services = "common", "gateway", "config-server", "discovery", "transaction-service", "validation-service", "kyc-service", "exchange-service", "bank-credit-service", "notification-service", "audit-service"
foreach ($service in $services) {
mkdir "$service/src/main/java/com/crossborder/payment/$service" -Force
mkdir "$service/src/main/resources" -Force
mkdir "$service/src/test/java/com/crossborder/payment/$service" -Force
}

