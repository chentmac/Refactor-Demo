#1
Given nothing
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             <P>You owed<EM>0.0</EM><P>
             On this rental you earned<EM>0</EM> frequent renter points<P>"
#2
Given a regular movie name "Sherlock Holmes",rental one day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             	Sherlock Holmes	2.0<BR>
             <P>You owed<EM>2.0</EM><P>
             On this rental you earned<EM>1</EM> frequent renter points<P>"
#3
Given a regular movie name "Sherlock Holmes",rental three day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             	Sherlock Holmes	3.5<BR>
             <P>You owed<EM>3.5</EM><P>
             On this rental you earned<EM>1</EM> frequent renter points<P>"
#4
Given a release movie name "Sherlock Holmes",rental one day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             	Sherlock Holmes	3.0<BR>
             <P>You owed<EM>3.0</EM><P>
             On this rental you earned<EM>1</EM> frequent renter points<P>"
#5
Given a release movie name "Sherlock Holmes",rental two day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             	Sherlock Holmes	6.0<BR>
             <P>You owed<EM>6.0</EM><P>
             On this rental you earned<EM>2</EM> frequent renter points<P>"
#6
Given a child movie name "Sherlock Holmes",rental one day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             	Sherlock Holmes	1.5<BR>
             <P>You owed<EM>1.5</EM><P>
             On this rental you earned<EM>1</EM> frequent renter points<P>".
#7
Given a child movie name "Sherlock Holmes",rental four day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
             	Sherlock Holmes	3.0<BR>
             <P>You owed<EM>3.0</EM><P>
             On this rental you earned<EM>1</EM> frequent renter points<P>".

#8
Given a literary movie name "Sherlock Holmes",rental one day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
                 Sherlock Holmes 6.0<BR>
              <P>You owed<EM>6.0</EM><P>
              On this rental you earned<EM>1.5</EM> frequent renter points<P>"

#9
Given a literary movie name "Sherlock Holmes",rental two day
When make a htmlStatement
Then return "<H1>Rental for <EM>Jerry</EM></H1><P>
                 Sherlock Holmes 12.0<BR>
              <P>You owed<EM>12.0</EM><P>
              On this rental you earned<EM>1.5</EM> frequent renter points<P>"                          