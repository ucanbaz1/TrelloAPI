@createBoard
Feature: feature tests api on trello

  @board
  Scenario: Create Board, Get Board ID and List ID
    Given CREATE BOARD
    When GET BOARD ID
    Then GET LIST ID
  @card
  Scenario: Create and Update Card
    When CREATE CARD
    When CREATE CARD2
    Then UPDATE CARD1
  @deleting
  Scenario: Delete Cards and Board
    When DELETE CARD2
    When DELETE CARD1
    Then DELETE BOARD

