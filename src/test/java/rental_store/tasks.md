#1
Given nothing
When make a statement
Then return "Rental Record for Jerry\nAmount owed is0.0\nYou earned0 frequent renter points"
#2
Given a regular movie name "Sherlock Holmes",rental one day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t2.0\nAmount owed is2.0\nYou earned1 frequent renter points"
#3
Given a regular movie name "Sherlock Holmes",rental three day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t3.5\nAmount owed is3.5\nYou earned1 frequent renter points"
#4
Given a release movie name "Sherlock Holmes",rental one day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t3.0\nAmount owed is3.0\nYou earned1 frequent renter points"
#5
Given a release movie name "Sherlock Holmes",rental two day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t6.0\nAmount owed is6.0\nYou earned2 frequent renter points"
#6
Given a child movie name "Sherlock Holmes",rental one day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t1.5\nAmount owed is1.5\nYou earned1 frequent renter points".
#7
Given a child movie name "Sherlock Holmes",rental four day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t3.0\nAmount owed is3.0\nYou earned1 frequent renter points".
#8
Given a literary movie name "Sherlock Holmes",rental one day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t6.0\nAmount owed is6.0\nYou earned1.5 frequent renter points".
#9
Given a literary movie name "Sherlock Holmes",rental two day
When make a statement
Then return "Rental Record for Jerry\n\tSherlock Holmes\t12.0\nAmount owed is12.0\nYou earned1.5 frequent renter points".
#10
Given a movie that's not a priceCode in class Movie
Then throw new IllegalArgumentException("illegal price code");