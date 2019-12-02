import sklearn

import pandas
data=pandas.read_csv("colors.data", header = None)
print(data)

import matplotlib.pyplot as plt
import seaborn as sns # visualization
sns.pairplot( data=data,vars=(0,1,2,3), hue=4 )
plt.show()

#1. Sort of, some variables show distinct separations whereas in others, you cannot tell
#2. The iris setosa is easily identifiable
#3. The versicolor and virginica are hard to tell apart because some other their attributes overlap

import numpy as np
data=np.array(data)

X=data[:,0:4] #This gets all the rows and only the first 4 columns.
y=data[:,4]
print(X.shape) #(150,4)
print(y.shape) #(150,)

from sklearn.utils import shuffle
X,y=shuffle(X,y,random_state=0)
print(X,y)

#4. I looked at the data set and checked if each set was radomized or not. Then I looked up the set in the file and checked to see if the flower type was identically randomized.
#5. Random_state is the "seed" used by the random number generator; it basically radomizes the data set, but there is a twist because if the "number" is not changed then the randomized set does not change.
#6. It could be useful in the sense you will have the same randomized order to check your results against. So it's more accurate.

trainX=X[:100]
trainy=y[:100]
testX=X[100:]
testy=y[100:]

from sklearn.neural_network import MLPClassifier
clf = MLPClassifier(hidden_layer_sizes=[2,3], max_iter=2000, random_state=0)
#print(dir(clf)))
clf.fit(trainX, trainy)
#print(clf.coefs_)
#print(clf.intercepts_)

prediction=clf.predict(testX)
print(clf.score(trainX,trainy))
print(clf.score(testX,testy))

from sklearn.model_selection import cross_validate
from sklearn.model_selection import GridSearchCV
parameters={'hidden_layer_sizes':([3],[10],[3,3],[3,3,3]),}
gs =GridSearchCV(clf,parameters)
gs.fit(X,y)
print(gs.best_estimator_)
#cv_results = cross_validate(clf, X, y, cv=4)
print(gs.cv_results)

#7. They probably mean how much of the actual test set was accuratly identified. 



