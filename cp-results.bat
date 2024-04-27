mvn clean install
allure generate --clean
cp -r allure-report/history/ allure-results
allure open
