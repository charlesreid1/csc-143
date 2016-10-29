# Worksheet 4: Seattle Public Schools Data

This worksheet 4 code provides a solution for Worksheet 4.

## Code Written For This Assignment

Driver - This utilizes the classes below to manipulate school data 
in order to answer worksheet 4 questions.

SeattleSchoolsData - This class interfaces with the public schools data file,
and parses it to pull out the information needed to create new public schools.
This class owns the parsing process.

School - This class stores data related to a particular school. This enables
the SeattleSchoolsData class to simply store School objects, without having
to worry about the details of what information School objects need,
or how they store that information.

MapOperations - This is a static class that defines two methods for reversing maps:
one for reversing a phone book or address book map (key String, value String),
and the other for reversing a distance map (key String, value Double).

## Code Cribbed From The Book

ZipLookup - This class was provided by the book for the Chapter 6 
case study, Zip Code Lookup. This class defines a static method to 
compute the distance between two points given their longitude and latitude
values. 

The source of this code is Reges & Stepp, "Building Java Programs" (3rd Edition), Chapter 6.

