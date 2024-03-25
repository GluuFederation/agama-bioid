# Agama BioID 

This Agama Project allows biometric authentication by leveraging BioID. For more information you can also see 
* [BioID](https://www.bioid.com/)

## Requirements

* [agama-bioid](https://github.com/GluuFederation/agama-bioid)
* [A BioID account](https://bwsportal.bioid.com/register)

## Supported IDPs

| IDP                             | Description                                |
| :------------------------------ |:-------------------------------------------| 
| Jans Auth Server                |[Deployment instructions](./jans-deploy.md) | 
| Gluu Flex                       |[Deployment instructions](.)                | 

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

## Demo
_Optional_

Check out this video of the `org.gluu.agama.<name>` flow. 

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


