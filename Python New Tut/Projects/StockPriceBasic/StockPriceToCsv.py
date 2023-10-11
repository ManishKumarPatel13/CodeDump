# polygon.io API: yq_r9CTHSpNjebaKG5zg0P94gRkX8wuV

#Importing Imp FrameWorks
import numpy as np
import pandas as pd
import requests as rq
import csv

# This will be used to get the desired stock and timeframe of graph
api_key = "RDQTK0W92PE6Y8A2"
symbol = input("Enter the Symbol of Stock: \n")
interval = input("What Time Interval Data You Want: 1, 5, 10, 15, 30, 60 Minute: \n") + "min"
Count = int(input("How many interval data you want:  \n"))

# Api Calling
# url = f"https://www.alphavantage.co//query?function=TIME_SERIES_INTRADAY&symbol={symbol}&interval={interval}&apikey={api_key}&datatype=csv&outputsize={Count}"
url = f"https://www.alphavantage.co//query?function=GLOBAL_QUOTE&symbol={symbol}&interval={interval}&apikey={api_key}&datatype=csv"

# Sending the Get Request
response = rq.get(url)

if response.status_code == 200:
    # FileName
    csv_fileName = f'{symbol}_Data.csv'
    
    # Parsing the CSV Data from Response
    csv_data = response.text
    # Create A file and Save the CSV Data in it
    with open(csv_fileName, 'w', newline='') as csvfile:
        csvfile.write(csv_data)
        
    print(f"Data Saved To {csv_fileName}")
else:
    print('Error Fetching data from Alpha Vantage')
    