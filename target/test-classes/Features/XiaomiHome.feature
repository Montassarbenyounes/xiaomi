#Author: Montassar
Feature: XiaomiHome

  Scenario: selectionner un menu de la page d accueil
    Given utilisateur est sur la page d accueil
    When utilisateur survole la souris sur le menu "Smart Home" et clique sur submenu "Maison connectée"
    Then utilisateur est dirige vers la page "Maison Connectée"
