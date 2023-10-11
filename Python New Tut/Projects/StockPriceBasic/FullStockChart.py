import yfinance as yf
import matplotlib.pyplot as plt
import mplfinance as mpf
import plotly.graph_objs as pbj


symbol = input("Enter the Symbol of the stock:\n")
intraOrNot = input("Do you want intraday chart (y/n):\n")
if intraOrNot.lower() == "y" or intraOrNot.lower() == "yes":
    interval = input("Enter time interval:\n")
    data = yf.download(symbol, period="1d", interval=interval)
    
else:
    s_time = input("Enter the starting date for the chart in Format: YYYY-MM-DD\n")
    e_time = input("Enter the end date of the chart in format: YYYY-MM-DD\n")


    # Fetch Data For Stocks
    data = yf.download(symbol, start=s_time, end=e_time) # It is a pandas.Dataframe

# Extracting Open, Close, High and Low Values
ohlc = data.loc[: , ['Open', 'High', 'Low', 'Close']]


fig = pbj.Figure()

fig.add_trace(pbj.Candlestick(x=data.index, 
                              open=data["Open"],
                              high=data["High"],
                              low=data["Low"],
                              close=data["Close"],
                              name="Market Data"))


fig.show()


# Creating new figure and subplot
# fig, ax = plt.subplots()

# Plotting the ohlc data
# ohlc.plot(ax=ax)

# Setting the Title and Labels
# ax.set_xlabel('Date')
# ax.set_ylabel('price')

# mpf.plot(ohlc, type='candle', style='yahoo')

# Show the plot
# plt.show()