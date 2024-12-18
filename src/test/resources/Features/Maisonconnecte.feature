#Author: Montassar
Feature: maison connecte

  Scenario: effectue le tri et clique sur le produit
    Given utilisateur est sur la page du maison connecte
    When utilisateur effectue le tri "Tri par popularité" et clique sur le produit "Mi Camera 2K Magnetic Mount"
    Then utilisateur est dirige vers la page du produit "Mi Camera 2K Magnetic Mount"
