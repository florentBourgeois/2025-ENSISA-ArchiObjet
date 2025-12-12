# Mini UNO 

Implémentation d'une chaine de responsabilité.

## Contexte

Le UNO est un jeu de carte dont les règles varient fortement en fonction des joueurs. 

Les bases sont : 
- est ce que je suis le joueur après celui qui vient de jouer 
- est ce que la carte que je joue a la même couleur ou valeur que la précédente

Mais il y a des cartes spéciales (changement de sens, +2, +4, interdit de jouer) : 
- dans ces cas, l'ordre du joueur est différent
- les couleurs peuvent être changées

Les regles peuvent changer. Certaines personnes jouent avec des règles "maison"
- je peux jouer si c'est la même couleur ET valeur que la carte précédente
- je peux jouer +2 sur un +2
- etc.

## Problématique 

Comment permettre à des joueurs avec des règles différentes de jouer ensemble sans avoir à modifier le code ? 

Comment ajouter de nouvelles regles sans avoir à modifier le code existant ?

## Solution : Chaine de responsabilité

<a href="https://refactoring.guru/fr/design-patterns/chain-of-responsibility">La chaine de responsabilité</a> est un pattern destiné à éviter le couplage entre un émetteur et un récepteur en donnant à plusieurs objets la possibilité de traiter une requête. La requête est passée le long d'une chaîne d'objets jusqu'à ce qu'un objet la traite.

