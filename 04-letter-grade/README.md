# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * if (g % 10 == 7 || g % 10 == 8 || g % 10  == 9){
       grade += "+";
    * else if (g % 10 == 0 || g % 10 == 1 || g % 10 == 2){
        grade += "-";

2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * **YOUR WRITING HERE**


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * I would utilize a else statement at the end of the program to assign any value which is less than 65, to be an automatic F. 
