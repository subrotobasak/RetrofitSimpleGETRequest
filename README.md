# RetrofitSimpleGETRequest
Retrofit allows easy communication with a web service by abstracting the HTTP.



In "Retrofit Simple GET" Request part we will set up Retrofit in a new Android Studio project by adding the necessary Gradle dependencies, and then already do our first GET request. 
We create an interface with one method that we annotate with @GET and the relative URL to the API endpoint of the REST API we want to query. We then create a Retrofit instance, define the baseUrl, add GSON as the converter by passing GsonConverterFactory to the addConverterFactory method, and let Retrofit create the implementation of our API interface at compile time.
The Call object that our GET method returns encapsulates a single request + response. With enqueue we can execute this request asynchcronously on a background thread and get our result back in the onResponse callback. OnFailure will be called if something in the process of communicating with the server or processing the response went wrong.
