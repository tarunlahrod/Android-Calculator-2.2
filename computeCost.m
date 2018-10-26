function J = computeCost(X, y, theta)
%COMPUTECOST Compute cost for linear regression
m = length(y); 
%   J = COMPUTECOST(X, y, theta) computes the cost of using theta as the
%   parameter for linear regression to fit the data points in X and y
J=0;
% Initialize some useful value
 % number of training examples
prediction=X*theta;
sq=(prediction-y).^2;
J=1/(2*m)*sum(sq);



% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta
%               You should set J to the cost.




% =========================================================================

end
