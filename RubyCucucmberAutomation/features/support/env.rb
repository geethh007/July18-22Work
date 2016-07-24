require 'selenium-webdriver'
Before do
  Selenium::WebDriver::Chrome::Service.executable_path="C:/chromedriver.exe"
  $driver = Selenium::WebDriver.for:chrome
  $driver.get "http://shop.thetestingworld.com/"
end

After do
  $driver.quit
end