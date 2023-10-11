# API KEY:  RDQTK0W92PE6Y8A2

#Importing Imp FrameWorks
import numpy as np
import pandas as pd
import requests as rq

# This will be used to get the desired stock and timeframe of graph
api_key = "RDQTK0W92PE6Y8A2"
symbol = input("Enter the Symbol of Stock: \n")
interval = input("What Time Interval Data You Want: 1, 5, 10, 15, 30, 60 Minute: \n") + "min"
Count = int(input("How many times you want the data: \n"))

# Api Calling
url = f"https://www.alphavantage.co//query?function=TIME_SERIES_INTRADAY&symbol={symbol}&interval={interval}&apikey={api_key}"

# Sending the Get Request
response = rq.get(url)

# Parsing the JSON Response
data = response.json()

stock_data = data[f"Time Series ({interval})"]

# Printing Few Data's
for timestamp, info in stock_data.items():
    if(Count > 0):
        print(f"TimeStamp: {timestamp}, open: {info['1. open']}, High: {info['2. high']}, Low: {info['3. low']}, Close: {info['4. close']}, Volume: {info['5. volume']}") 
        Count -= 1
    else:
        break;


# print(stock_data.keys( ))

    


