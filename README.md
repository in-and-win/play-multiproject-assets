# play-multiproject-assets

Project to understand the issue #4603 of Play! (https://github.com/playframework/playframework/pull/4603)

The app as two image assets : 
* [http://localhost:9000/assets/images/iaw1.png](http://localhost:9000/assets/images/iaw1.png)
* [http://localhost:9000/sub1/assets/images/iaw2.png](http://localhost:9000/sub1/assets/images/iaw2.png)

The first URL will correctly serve the asset, but not the second.

In order to demo, go to: http://localhost:9000/ 