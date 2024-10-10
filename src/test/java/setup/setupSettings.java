package setup;

public class setupSettings {
    public static String apiURL(){
        return "https://fakestoreapi.com";
    }

    public static String headerContentType(){
        return "Content-Type";
    }

    public static String headerApplication(){
        return "application/json";
    }

    public static String addPlace(){
        return "{\r\n" +
                "  \"location\": {\r\n" +
                "    \"lat\": -38.383494,\r\n" +
                "    \"lng\": 33.427362\r\n" +
                "  },\r\n" +
                "  \"accuracy\": 50,\r\n" +
                "  \"name\": \"Rahul Shetty Academy\",\r\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\r\n" +
                "  \"address\": \"29, side layout, cohen 09\",\r\n" +
                "  \"types\": [\r\n" +
                "    \"shoe park\",\r\n" +
                "    \"shop\"\r\n" +
                "  ],\r\n" +
                "  \"website\": \"http://rahulshettyacademy.com\",\r\n" +
                "  \"language\": \"French-IN\"\r\n" +
                "}\r\n" +
                "";
    }

    public static String userRegister(){
        return "{\n" +
                "            \"email\":\"thiagoalan@mailinator.com\",\n" +
                "                \"username\":\"talan\",\n" +
                "                \"password\":\"m38rm#F\",\n" +
                "                \"name\":{\n" +
                "            \"firstname\":\"Thiago\",\n" +
                "                    \"lastname\":\"Alan\"\n" +
                "        },\n" +
                "            \"address\":{\n" +
                "            \"city\":\"kilcoole\",\n" +
                "                    \"street\":\"7866 new road\",\n" +
                "                    \"number\":3,\n" +
                "                    \"zipcode\":\"98926-3874\",\n" +
                "                    \"geolocation\":{\n" +
                "                \"lat\":\"-37.3159\",\n" +
                "                        \"long\": \"89.1496\"\n" +
                "            }\n" +
                "        },\n" +
                "            \"phone\":\"1-990-236-7233\"\n" +
                "        }";
    }

    public static String updateUser(){
        return "{\n" +
                "            \"email\":\"andrezzafronza0@mailinator.com\",\n" +
                "                \"username\":\"afronza\",\n" +
                "                \"password\":\"senha123QWE\",\n" +
                "                \"name\":{\n" +
                "            \"firstname\":\"Andrezza\",\n" +
                "                    \"lastname\":\"Fronza\"\n" +
                "        }\n" +
                "}\n" ;
    }
}
