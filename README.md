# java_spi_demo

SPI的全名为Service Provider Interface.普通开发人员可能不熟悉，因为这个是针对厂商或者插件的。在java.util.ServiceLoader的文档里有比较详细的介绍。究其思想，其实是和"Callback"差不多。“Callback”的思想是在我们调用API的时候，我们可以自己写一段逻辑代码，传入到API里面，API内部在合适的时候会调用它，从而实现某种程度的“定制”。
典型的是Collections.sort（List<T> list,Comparator<? super T> c）这个方法，它的第二个参数是一个实现Comparator接口的实例。我们可以根据自己的排序规则写一个类，实现此接口，传入此方法，那么这个方法就会根据我们的规则对list进行排序。
把这个思想扩展开来，我们用SPI来重新实现上面的例子。客户把自己的排序规则写成一个类，并且打包成Jar文件，这个Jar文件里面必须有META-INF目录，其下又有services目录，其下有一个文本文件，文件名即为接口的全名：java.util.Comparator。
--META-INF
--services
--java.util.Comparator


