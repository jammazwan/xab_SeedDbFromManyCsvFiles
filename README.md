"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper", and is [explained in this blog](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

|[**_a jammazwan?_**](https://betterologist.net/2016/06/jammazwan-for-hire/)|also a jammazwan|
| --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|

---

### SeedDbFromManyCsvFiles

**_Uses JPA and biny to seed a database from many different csv files_**

From your workspace directory, git clone both this and it's sibling, then mvn install it's sibling. 

_from your bash shell:_

```bash
cd yourworkspacedirectory
git clone https://github.com/jammazwan/jammazwan.shared.git
git clone https://github.com/jammazwan/xab_SeedDbFromManyCsvFiles.git
cd jammazwan.shared
mvn install 
```
Now you may import this (or both) into your IDE via it's or as an eclipse project.

This project is a code demo project - designed to isolate functionality and make it easy replicate-able. See [**_this blog_**](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/) for more insights on why this was created.

### Other notes:

This page is generated. Custom notes specific to this project, if any, may be found [at NOTES.md](NOTES.md)

Other example Camel projects like this one are indexed at [**_jammazwan.x_index_**](https://github.com/jammazwan/jammazwan.x_index)

### Why the jammazwan.shared dependency project:

This design tries to move some of the clutter out of the project, 
so you can focus only on what is required to demo the **SeedDbFromManyCsvFiles** feature.

So you always have to git clone jammazwan.shared as a sibling first, 
then run mvn install, before installing with this project.

If you want to replicate the functionality of this project into your own stand-alone project, you will need to pull some dependencies and code from each.

### Special Instructions:

If there are any special instructions for this project:

No Special Instructions yet

### other notes

The prefix xab is used for maintaining sort order in a directory, providing packaging, and is otherwise meaningless