INSERT INTO Account (username, password) VALUES ('testuser', 'password')
INSERT INTO ShoppingList (account.username) VALUES ('testuser')
INSERT INTO Account (username, password) VALUES ('testuser2', 'password')
INSERT INTO Meal (date, mealTime, servings, username) VALUES (true, DINNER, 1, 'testuser2')
INSERT INTO Recipe (isPublic, recipeName, servings, username) VALUES (true, 'Testmeal', 1, 'testuser')
INSERT INTO Recipe (isPublic, recipeName, servings, username) VALUES (true, 'Testmeal2', 1, 'testuser2')
