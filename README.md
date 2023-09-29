# SpringBootChatGPT application

This is example of using SpringBoot application with chatGPT API. It uses chatGPT API through REST API.

# Usage

1. Run Postman tool
2. Add new POST request
3. For URL type "http://localhost:8080/api/searchChatGPT"
4. In Body section set raw/JSON and type for example:
   {
     "query": "What is the best route to Belgrade?"
   }
5. Click Send button

Expected result: 

You will get 200 OK response with something like this:

The best route to Belgrade from most locations is to fly into Belgrade Nikola Tesla Airport. From there, you can take a taxi, train, or bus into the city depending on your destination.
