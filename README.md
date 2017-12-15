# ServletLicPro


Créer un projet avec Gradle :
	
	télécharger le projet
	
	décompresser le projet
	
	ouvrir une fenêtre de commande dans le dossier du projet
	
	compiler le projet avec Gradle :
	
		- sous Linux : ./gradlew build  	(faire éventuellement un chmod 777 gradlew si gradlew n'est pas exécutable)
		- sous Windows : gradlew build
		
	convertir le projet en un projet Eclipse : 

		- sous Linux : ./gradlew eclipse
		- sous Windows : gradlew eclipse

    	importer le projet sous Eclipse : File -> Import -> General -> Existing project into Eclipse...
	
	lancer le projet (en utilsant le serveur web Jetty) :
	
		- sous Linux : ./gradlew appRun
		- sous Windows : gradlew appRun
		
Au démarrage du projet, une page d'accueil s'affiche. Le menu accède à :

    Une Servlet qui récupère les données du formulaire et les affiche dans le console.
    
	Une Servlet qui récupère les données du formulaire et les affiche dans une JSP.
    
	Une Servlet qui récupère les données du formulaire et les affiche dans une JSP via un bean.
    
	Une Servlet qui récupère les données du formulaire et les affiche dans une JSP via une liste de bean.
    
	Une qui créée un formulaire dynamique (par programmation), l'envoit dans le navigateur, l'utilisateur le remplit, le poste et une JSP affiche une confirmation.
    
	Une Servlet qui envoit un cookie et une page html au navigateur.
    
