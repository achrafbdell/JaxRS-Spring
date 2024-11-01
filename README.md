# JAXRS Application 👾

📖 Description

Ce projet est une API RESTful développée avec JAX-RS, qui permet de gérer les comptes bancaires 💳. L'API prend en charge les formats de données JSON 📄 et XML 📄 pour l'échange d'informations.

🏗️ Structure du Projet

Le projet comprend un contrôleur CompteJaxRSAPI qui expose les opérations suivantes :

GET /banque/compte : Récupère la liste de tous les comptes.
POST /banque/comptes : Crée un nouveau compte.
PUT /banque/compte/{id} : Met à jour un compte existant.
DELETE /banque/comptes/{id} : Supprime un compte.

<img width="1440" alt="Capture d’écran 2024-11-01 à 21 13 51" src="https://github.com/user-attachments/assets/837782ad-adfb-4dcf-9cc9-27bfe55f2b4c">
<img width="1440" alt="Capture d’écran 2024-11-01 à 21 13 57" src="https://github.com/user-attachments/assets/1679c472-ea1e-430f-96d4-dcb2e47dc595">
<img width="1440" alt="Capture d’écran 2024-11-01 à 21 14 02" src="https://github.com/user-attachments/assets/e518b936-d5e4-40cb-a357-ba4840812e29">
<img width="690" alt="Capture d’écran 2024-11-01 à 21 14 23" src="https://github.com/user-attachments/assets/fde32c6e-c229-40fc-aa74-4f59c8bec48c">


📌 Détails des Endpoints

1. Récupérer tous les comptes
Méthode : GET
Endpoint : /banque/compte
Produits : application/json, application/xml
Description : Renvoie la liste de tous les comptes sous forme de JSON ou XML.

2. Ajouter un nouveau compte
Méthode : POST
Endpoint : /banque/compte
Consomme : application/json, application/xml
Produits : application/json, application/xml
Description : Accepte les données d'un compte en JSON ou XML et crée un nouveau compte dans la base de données 🆕.

3. Mettre à jour un compte existant
Méthode : PUT
Endpoint : /banque/compte/{id}
Consomme : application/json, application/xml
Produits : application/json, application/xml
Description : Met à jour les détails d'un compte existant 🔄. Les données doivent être fournies en JSON ou XML.

4. Supprimer un compte
Méthode : DELETE
Endpoint : /banque/compte/{id}
Produits : application/json, application/xml
Description : Supprime un compte de la base de données en fonction de l'ID fourni.

