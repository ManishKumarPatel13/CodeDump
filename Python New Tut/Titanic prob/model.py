import numpy as np
import pandas as pd
from sklearn.ensemble import RandomForestClassifier 

Train = pd.read_csv("D:\CodeDump\Python New Tut\Titanic prob\\train.csv")
Test = pd.read_csv("D:\CodeDump\Python New Tut\Titanic prob\model.py")
features = ["Sex", "Age","Parch", "Sibsp"]
X = pd.get_dummies(Train[features])
X_test = pd.get_dummies(Test[features])
Y = Train["Survived"]
model = RandomForestClassifier(n_estimators=100, max_depth=5, random_state=1)
model.fit(X, Y)
predict = model.predict(X_test)
print(predict)