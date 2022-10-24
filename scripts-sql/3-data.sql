SET search_path TO projet;


-- Supprime toutes les données
DELETE FROM mouvement;
DELETE FROM enchere;
DELETE FROM produit;
DELETE FROM role;
DELETE FROM compte;


-- Insère les données

-- Compte

INSERT INTO compte (idcompte, pseudo, motdepasse, email , Prenom, Nom , Credit) VALUES 
( 1, 'geek', 'geek', 'geek@jfox.fr' , 'franck','sikadi',400),
( 2, 'chef', 'chef', 'chef@jfox.fr' , 'yvan', 'oumbe',500 ),
( 3, 'job', 'job', 'job@jfox.fr' ,'roger','kamga',600);

ALTER TABLE compte ALTER COLUMN idcompte RESTART WITH 4;


-- Role

INSERT INTO role (idcompte, role) VALUES 
( 1, 'ADMINISTRATEUR' ),
( 1, 'UTILISATEUR' ),
( 2, 'UTILISATEUR' ),
( 3, 'UTILISATEUR' );
 
INSERT INTO produit (IdProduit, photo ,  Description , PrixMinimal , DateDebut , DateFin ,HeureDebut ,HeureFin ,Flag, IdCompte) VALUES
(1 ,'https://images.unsplash.com/photo-1581539250439-c96689b516dd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=465&q=80','chaise haute',100,'30/11/2022','31/11/2022','10:00','15:00',true ,2),
(2,'https://images.unsplash.com/photo-1618403088890-3d9ff6f4c8b1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1008&q=80','colier argent',1500,'28/11/2022','30/11/2022','12:00','17:00',true,3);

INSERT INTO enchere(IdEnchere , Prix, IdProduit, IdCompte) VALUES 
(1,'300',1,2),
(2,'2000',2,3);
INSERT INTO mouvement( IdMouvement , Somme , IdCompte) VALUES 
(1,20.00,2),
(2,30.00,3);
