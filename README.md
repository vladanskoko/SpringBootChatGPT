# SpringBootChatGPT application

This is example of using ChatGPT API with SpringBoot application. The application uses ChatGPT API through REST API.

# Usage

1. Run Postman tool
2. Add new POST request
3. For URL type "http://localhost:8080/api/searchChatGPT"
4. In Body section set raw/JSON and type for example:
   {
     "query": "What is AI?"
   }
5. Click Send button

Expected result: 

In Postman tool you should get 200 OK response with something like this:

AI (Artificial Intelligence) is a type of computer system that is able to perform tasks that would usually require some form of natural intelligence or human input in order to be completed. AI is a rapidly evolving field of research which involves both computer science and engineering. AI can be used for various purposes such as data analysis, pattern recognition, and decision making. It can be used to increase efficiency and accuracy of existing processes and can also be used to automate complex tasks.

# Note
Before using application log in Open AI and generate your secret key. After that copy that key and add it to project's application.properties file like this:

OPEN_AI_KEY=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
