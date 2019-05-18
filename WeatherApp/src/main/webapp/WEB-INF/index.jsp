<%@ page import="models.weather.Weather" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    Weather weather = (Weather) request.getAttribute("Weather");
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <title>Aplikacja pogodowa</title>
    <style>
    </style>
</head>
<body>
<div class="container text-center">
    <div class="starter-template">
        <div class="row justify-content-center align-items-center">
            <div class="col-md-6">
                <form method="post">
                    <br>
                    <h2>
                        Wybierz miasto i sprawdź aktualny stan pogody
                    </h2>
                    <br>
                    <br>
                    <div class="form-group">
                        <label for="cityChoice">Wybór miasta:</label>
                        <select class="form-control" id="cityChoice" name="cityId">
                            <option value="6695624">
                                Warszawa
                            </option>
                            <option value="7531890">
                                Gdańsk
                            </option>
                            <option value="3094802">
                                Kraków
                            </option>
                            <option value="3081368">
                                Wrocław
                            </option>
                            <option value="7530858">
                                Poznań
                            </option>
                            <option value="3093133">
                                Łódź
                            </option>
                            <option value="3096472">
                                Katowice
                            </option>
                        </select>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-success" name="action" value="online">Potwierdź
                        </button>
                    </div>
                </form>
            </div>

            <% if (weather != null) { %>
            <div class="container text-center">
                <br>
                <div class="col-xs-6">
                    <h4>Miasto: <% out.println(weather.getCity().getName()); %></h4>
                </div>
                <div class="col-xs-6">
                    <h4>Temperatura: <% out.println(weather.getTemp()); %> stopni Celcjusza</h4>
                </div>
                <div class="col-xs-6">
                    <h4>Prędkość wiatru: <% out.println(weather.getWindSpeed()); %> m/s</h4>
                </div>
                <div class="col-xs-6">
                    <h4>Ciśnienie: <% out.println(weather.getPressure()); %> hPa</h4>
                </div>
                <div class="col-xs-6">
                    <h4>Zachmurzenie: <% out.println(weather.getClouds()); %> %</h4>
                </div>
            </div>
            <% } %>
        </div>
    </div>
</div>
</div>
</body>
</html>
