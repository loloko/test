package com.example.transactionlist

const val MOCK_TRANSACTION_LIST = """
    {
  "data": {
    "transactionList": {
      "items": [
        {
          "transactionId": "1180241b-2967-4f46-be4d-efa82cd2ac6c",
          "transactionTime": 1604314213762,
          "clearingTime": 1604314213762,
          "currentStatus": "AUTHORIZED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": -245,
            "totalAmountMinor": -245,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "JarTransactionParticipant",
            "participantId": "2d2c1e48-d08a-4003-9332-9a05024f364b",
            "name": "Wallet",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "GenericTransactionParticipant",
            "name": "British Gas",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 245,
              "totalAmountMinor": 245,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_OUT",
          "transactionClassification": {
            "type": "SPEND",
            "name": "STORE_REDEMPTION"
          },
          "category": {
            "name": "Bills",
            "id": "552984e9-5fa6-4338-ae61-7f148619aa2f",
            "avatarUri": {
              "avatarUriPng": "https://cdn.hyperjar.com/app/categories/552984e9-5fa6-4338-ae61-7f148619aa2f/Bills.png"
            }
          },
          "paymentReference": null
        },
        {
          "transactionId": "91882e4a-11fa-4694-a244-b8dd97d045ca",
          "transactionTime": 1604314177133,
          "clearingTime": 1604314177133,
          "currentStatus": "AUTHORIZED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": -2045,
            "totalAmountMinor": -2045,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "JarTransactionParticipant",
            "participantId": "2d2c1e48-d08a-4003-9332-9a05024f364b",
            "name": "Wallet",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "GenericTransactionParticipant",
            "name": "Deliveroo",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 2045,
              "totalAmountMinor": 2045,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_OUT",
          "transactionClassification": {
            "type": "SPEND",
            "name": "STORE_REDEMPTION"
          },
          "category": null,
          "paymentReference": null
        },
        {
          "transactionId": "4e165e1b-d907-429e-921a-25d5d0c032f5",
          "transactionTime": 1604314153702,
          "clearingTime": 1604314153702,
          "currentStatus": "AUTHORIZED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": -3656,
            "totalAmountMinor": -3656,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "JarTransactionParticipant",
            "participantId": "2d2c1e48-d08a-4003-9332-9a05024f364b",
            "name": "Wallet",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "GenericTransactionParticipant",
            "name": "The Lighthouse Battersea",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 3656,
              "totalAmountMinor": 3656,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_OUT",
          "transactionClassification": {
            "type": "SPEND",
            "name": "STORE_REDEMPTION"
          },
          "category": null,
          "paymentReference": null
        },
        {
          "transactionId": "7088b2cc-d28c-4d5f-b99e-185cc1eaf541",
          "transactionTime": 1604314057572,
          "clearingTime": 1604314057572,
          "currentStatus": "AUTHORIZED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": -501,
            "totalAmountMinor": -501,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "JarTransactionParticipant",
            "participantId": "2d2c1e48-d08a-4003-9332-9a05024f364b",
            "name": "Wallet",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "GenericTransactionParticipant",
            "name": "Tfl",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 501,
              "totalAmountMinor": 501,
              "rewardAmountMinor": 0
            },
            "clearingRate": 1,
            "clearingAmount": {
              "currency": "GBP",
              "baseAmountMinor": 501,
              "totalAmountMinor": 501,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_OUT",
          "transactionClassification": {
            "type": "SPEND",
            "name": "STORE_REDEMPTION"
          },
          "category": {
            "name": "Transport",
            "id": "d775c354-e586-40f7-ae80-e5d88da3f745",
            "avatarUri": {
              "avatarUriPng": "https://cdn.hyperjar.com/app/categories/d775c354-e586-40f7-ae80-e5d88da3f745/Transport.png"
            }
          }
        },
        {
          "transactionId": "5bafe33e-707d-44ec-9ed3-840dafe5d605",
          "transactionTime": 1604313979908,
          "clearingTime": 1604313980621,
          "currentStatus": "COMPLETED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": 20069,
            "totalAmountMinor": 20069,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "GenericTransactionParticipant",
            "name": "Billy Ballo",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "JarTransactionParticipant",
            "participantId": "2d2c1e48-d08a-4003-9332-9a05024f364b",
            "name": "Wallet",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 20069,
              "totalAmountMinor": 20069,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_IN",
          "category": null,
          "paymentReference": null
        },
        {
          "transactionId": "2885df39-8dfe-40ab-abfd-cd5c572f4cc8",
          "transactionTime": 1604313358524,
          "clearingTime": 1604313358524,
          "currentStatus": "AUTHORIZED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": -501,
            "totalAmountMinor": -501,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "JarTransactionParticipant",
            "participantId": "2d2c1e48-d08a-4003-9332-9a05024f364b",
            "name": "Wallet",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "GenericTransactionParticipant",
            "name": "Tfl",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 501,
              "totalAmountMinor": 501,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_OUT",
          "transactionClassification": {
            "type": "SPEND",
            "name": "STORE_REDEMPTION"
          },
          "category": {
            "name": "Transport",
            "id": "d775c354-e586-40f7-ae80-e5d88da3f745",
            "avatarUri": {
              "avatarUriPng": "https://cdn.hyperjar.com/app/categories/d775c354-e586-40f7-ae80-e5d88da3f745/Transport.png"
            }
          },
          "paymentReference": null
        },
        {
          "transactionId": "5bc9cc65-0559-48c2-8d1a-037cbb409d84",
          "transactionTime": 1604313156394,
          "clearingTime": 1604313156394,
          "currentStatus": "REJECTED",
          "amount": {
            "currency": "GBP",
            "baseAmountMinor": 0,
            "totalAmountMinor": 0,
            "rewardAmountMinor": 0
          },
          "debitedFrom": {
            "participantType": "JarTransactionParticipant",
            "participantId": "9bb90b1b-0a61-4fda-842f-d0412a3bcac7",
            "name": "guddjsjsjs",
            "avatarUri": null
          },
          "creditedTo": {
            "participantType": "GenericTransactionParticipant",
            "name": "Amazon - UK",
            "avatarUri": null
          },
          "transactionAmount": {
            "amount": {
              "currency": "GBP",
              "baseAmountMinor": 501,
              "totalAmountMinor": 501,
              "rewardAmountMinor": 0
            }
          },
          "impact": "MONEY_OUT",
          "transactionClassification": {
            "type": "SPEND",
            "name": "STORE_REDEMPTION"
          },
          "category": null,
          "paymentReference": null
        }
      ]
    }
  }
}
"""