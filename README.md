"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper", and is [explained in this blog](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

|[**_a jammazwan?_**](https://betterologist.net/2016/06/jammazwan-for-hire/)|also a jammazwan|
| --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|

---

### SeedDbFromManyCsvFiles

Description: **_Uses JPA and biny to seed a database from many different csv files_**

Welcome to SeedDbFromManyCsvFiles

The prefix xab is used for maintaining sort order in a directory, providing packaging, and is otherwise meaningless

This project is a code demo project - designed to isolate functionality and make it easy replicate-able. link here to blog on same.


### Dependencies, First:

__Relax!__ This project runs __almost__ all by itself! No huge web of parent poms to obfuscate dependencies and make learning hard to replicate.

But it does have *one* common dependency which it shares with other jammazwan code examples. 
This design tries to move some of the clutter out of the project, 
so you can focus only on what is required to demo the **SeedDbFromManyCsvFiles** feature.

So you always have to git clone jammazwan.shared into the same folder first, 
then run mvn install on that first, before messing with this project.