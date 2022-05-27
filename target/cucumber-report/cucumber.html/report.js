$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("finddealer.feature");
formatter.feature({
  "line": 2,
  "name": "Find the dealers and verify",
  "description": "",
  "id": "find-the-dealers-and-verify",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@findDealer"
    }
  ]
});
formatter.before({
  "duration": 12168717500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on “buy+sell” tab",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 255916200,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundSteps.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 2226992000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Find the dealers and verify the dealers are in list",
  "description": "",
  "id": "find-the-dealers-and-verify;find-the-dealers-and-verify-the-dealers-are-in-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I click Find a Dealer link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I navigate to the car dealers page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see the dealer names are display on page",
  "rows": [
    {
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 12
    },
    {
      "cells": [
        "4WD Specialist Group"
      ],
      "line": 13
    },
    {
      "cells": [
        "5 Star Auto Trade"
      ],
      "line": 14
    },
    {
      "cells": [
        "777 Pinoy Auto Sales"
      ],
      "line": 15
    },
    {
      "cells": [
        "A Cullen \u0026 Son"
      ],
      "line": 16
    },
    {
      "cells": [
        "ALL ABOUT CARS"
      ],
      "line": 17
    },
    {
      "cells": [
        "AVON VALLEY TOYOTA"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FindDealerSteps.iClickFindADealerLink()"
});
formatter.result({
  "duration": 291666300,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iNavigateToTheCarDealersPage()"
});
formatter.result({
  "duration": 540002200,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable)"
});
formatter.result({
  "duration": 32431592200,
  "status": "passed"
});
formatter.after({
  "duration": 1622135000,
  "status": "passed"
});
});