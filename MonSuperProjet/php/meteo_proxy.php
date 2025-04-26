<?php
if (!isset($_GET['city'])) {
    echo json_encode(["error" => "City is required"]);
    exit;
}

$city = urlencode($_GET['city']);
$apiKey = "b48a04d7d50b27f9e2847010cc9bd220"; // clé API OpenWeatherMap
$url = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey&units=metric";

$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, $url);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

$response = curl_exec($ch);
curl_close($ch);

header("Content-Type: application/json");
echo $response;
