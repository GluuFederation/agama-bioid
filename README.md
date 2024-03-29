# Agama BioID 

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache License][license-shield]][license-url]

This Agama Project allows biometric authentication by using the facial recognitioni modality leveraging the BioID API. For more information you can also see 
* [BioID](https://www.bioid.com/)

## Requirements

* [agama-bioid](https://github.com/GluuFederation/agama-bioid)
* [A BioID account](https://bwsportal.bioid.com/register)

## Supported IDPs

| IDP                             | Description                                |
| :------------------------------ |:-------------------------------------------| 
| Jans Auth Server                |[Deployment instructions](./jans-deploy.md) | 
| Gluu Flex                       |[Deployment instructions](./jans-deploy.md) | 

## Flows

| Qualified Name                      | Description                            |
| ----------------------------------- |:---------------------------------------| 
| `org.gluu.agama.bioid`              | Biometric enrollment and verification  | 
| `org.gluu.agama.bioid.authenticate` | Password authentication                | 


## Configuration

| Flow                   | Property      | Value Description       |
| ---------------------- |:-------------:|:----------------------- |
| `org.gluu.agama.bioid` | host          | Callback URI            |
| `org.gluu.agama.bioid` | endpoint      | BWS API endpoint        |
| `org.gluu.agama.bioid` | appIdentifier | App ID from BioID       |
| `org.gluu.agama.bioid` | appSecret     | App secret from BioID   |
| `org.gluu.agama.bioid` | storage       | BioID account storage   |
| `org.gluu.agama.bioid` | partition     | BioID account partition |

Sample JSON:

``` json
{
  "org.gluu.agama.bioid": {
    "host": "https://<hostname>/jans-auth/fl/callback",
    "endpoint": "https://bws.bioid.com/extension/",
    "appIdentifier": "",
    "appSecret": "",
    "storage": "",
    "partition": ""
  }
}
```
## Sequence Diagrams

`org.gluu.agama.bioid`

![image](https://github.com/GluuFederation/agama-bioid/assets/6601566/1a80619a-8098-463e-b31c-6f063e01ba87)



[Source](https://sequencediagram.org/index.html#initialData=C4S2BsFMAICEQPYEkAiAoARg4wEFsAHAQwCdQBjEYgO2AGdo0iBXXa5vDSExo83HgAVudBNTTEyISjWBwSCAO51uE0hSpFa0APKC1UmVrnxk6YSVHUAtAD5YC5dwBcdYOugAzcErQOlKiR2es4A9CzAABYIJCAAXpAA-HwkAPoAbkTgzJB0ALxEAOZEeEQAOtQAZEUlRKneSnkxhQB0hdnMLTWlLRiIIAAmaHp2-k4kzgQkuZDazIHUJTDEhZBoFlajjoHOs8Dc0PPci3hrY4HBgs7DgpfO0D4IANaHBNB85AjMtDejiKj3ciRSDkF6zBTgcCnH6mVB3aDghCQ6FyaZ0AhiFRMcByajYBHUCFQIYjezbFzQKYzbSI5F7SlFNYbMRbAIU2ngLx8M7koK2EK-ez-FD3DmC84uKkqbTEOh0RQxAYM1brEQsslsiYE-Y8WXyxV+Xl3QUhTLgQZEfYMuUKkgk24a8auZjkci5OhoWb21lOylo+npbggTzSS2IajKplqmyOnbQQOxTwATy5bsNmuNpNhIugQJBLwTwdDoDE2LkhZD5DDYi5IGJ4t59yl9L1tqVKyjlnVEq1ewOrYNPczDpC8ayFqtA7tnuo3tjFLoLrdcqAA)

# Contributors

<table>
<tr>
    <td align="center" style="word-wrap: break-word; width: 150.0; height: 150.0">
        <a href=https://github.com/SafinWasi>
            <img src=https://avatars.githubusercontent.com/u/6601566?v=4 width="100;"  style="border-radius:50%;align-items:center;justify-content:center;overflow:hidden;padding-top:10px" alt=Foo Bar/>
            <br />
            <sub style="font-size:14px"><b>SafinWasi</b></sub>
        </a>
    </td>
</tr>
</table>

# License

This project is licensed under the [Apache 2.0](./LICENSE)

<!-- This are stats url reference for this repository -->

[contributors-shield]: https://img.shields.io/github/contributors/GluuFederation/agama-bioid.svg?style=for-the-badge

[contributors-url]: https://github.com/GluuFederation/agama-bioid/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/GluuFederation/agama-bioid.svg?style=for-the-badge

[forks-url]: https://github.com/GluuFederation/agama-bioid/network/members

[stars-shield]: https://img.shields.io/github/stars/GluuFederation/agama-bioid?style=for-the-badge

[stars-url]: https://github.com/GluuFederation/agama-bioid/stargazers

[issues-shield]: https://img.shields.io/github/issues/GluuFederation/agama-bioid.svg?style=for-the-badge

[issues-url]: https://github.com/GluuFederation/agama-bioid/issues

[license-shield]: https://img.shields.io/github/license/GluuFederation/agama-bioid.svg?style=for-the-badge

[license-url]: https://github.com/GluuFederation/agama-bioid/blob/main/LICENSE
