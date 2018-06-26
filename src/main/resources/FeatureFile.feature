Feature: Navigating to Pages

    Scenario: Navigate to the Home Page
       Given I have navigated to the "HomePage" url
        Then the Home Page will be displayed

    Scenario: Navigate to the What We Do Page
        Given I have navigated to the "HomePage" url
        When I click on the What We Do Page link
        Then the What We Do Page is displayed

    Scenario: Navigate to the Our Work Page
        Given I have navigated to the "HomePage" url
        When I click on the Our Work Page link
        Then the Our Work Page is displayed

    Scenario: Navigate to the Who We Are Page
        Given I have navigated to the "HomePage" url
        When I click on the Who We Are Page link
        Then the Who We Are Page is displayed

    Scenario: Navigate to the Careers Page
        Given I have navigated to the "HomePage" url
        When I click on the Careers Page link
        Then the Careers Page is displayed

    Scenario: Navigate to the Contact Us Page
        Given I have navigated to the "HomePage" url
        When I click on the Contact Us Page link
        Then the Contact Us Page is displayed
