# 📦 Projet Météo (Java WebService + Java Client + PHP Proxy)

Bienvenue dans mon projet météo ! ☀️☁️

## 📂 Structure

- **WebServiceProjet/** : Service Web Java SOAP (NetBeans)
- **ClientProjet/** : Application Client Java Swing (NetBeans)
- **php/meteo_proxy.php** : Fichier PHP servant de passerelle entre Client et OpenWeatherMap API

## ⚡ Instructions

1. Déployer `WebServiceProjet` sur votre serveur (GlassFish).
2. Copier `php/meteo_proxy.php` dans `C:\xampp\htdocs\` (Apache XAMPP).
3. Lancer `ClientProjet` depuis NetBeans.
4. Utiliser l'application pour récupérer la météo.

## 🌐 URLs importantes

- **WSDL** : `http://localhost:11714/WebServiceProjet/WebServicemeteo?wsdl`
- **Proxy PHP** : `http://localhost/meteo_proxy.php?city=Alger`

---

