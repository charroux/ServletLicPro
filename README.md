# ServletLicPro

Créer projet :
    
    Eclipse JEE developper : File -> new -> other -> web -> Dynamic Web Project ->
        Apache Tomcat 7 (target runtime) -> next ... -> finish

Créer un projet avec Gradle (recommandée):

    installation de Gradle : http://gradle.org/

    utilisation de gradle :

    1°/ télécharger le projet à partir de ce site

    2°/ construire le projet avec la commande "gradle build"

    3°/ Tester le projet via Jetty avec la commande "gradle jettyRunWar" et utiliser un navigateur

    4°/ optionnel : convertir le projet en un projet Eclipse avec la commande "gradle eclipse" puis importer le projet dans Eclipse (File -> import -> existing project into Eclipse -> browse ...)
    
    5°/ Pour une utilisation sous Eclipse : télécharger et décompresser apache/tomcat 7 version binaire, sous Eclipse File : Window -> preferences -> server -> runtime environment -> add (aller chercher apache/tomcat), pour lancer le serveur : clic droit sur le projet -> Run as ->  Run on server -> next ...
    
Au démarrage du projet, une page d'accueil s'affiche. Le menu accède à :

    Une Servlet qui récupère les données du formulaire et les affiche dans le console.
    
	Une Servlet qui récupère les données du formulaire et les affiche dans une JSP.
    
	Une Servlet qui récupère les données du formulaire et les affiche dans une JSP via un bean.
    
	Une Servlet qui récupère les données du formulaire et les affiche dans une JSP via une liste de bean.
    
	Une qui créée un formulaire dynamique (par programmation), l'envoit dans le navigateur, l'utilisateur le remplit, le poste et une JSP affiche une confirmation.
    
	Une Servlet qui envoit un cookie et une page html au navigateur.
    
