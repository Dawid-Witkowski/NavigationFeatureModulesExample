# NavigationFeatureModulesExample
This project is inspired by [this article](https://proandroiddev.com/structural-and-navigation-anti-patterns-in-modularized-android-applications-a7d667e35cd6) by Gabor Varadi,
and shows how to handle navigation between feature modules, which are not aware of each other

in this case:

featureModuleOne and featureModuleTwo both contain one fragment (and as I said previously, do not know of each other), but if we want to navigate between those 2 nav_graphs, we should use interfaces exposed by the feature modules
(This app could also be rewritten with deepLinks, but I like this approach more)

![image](https://user-images.githubusercontent.com/98784426/209720246-75f71905-bcb1-4443-be20-98775b6035af.png)
