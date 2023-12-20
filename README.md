# [BetterBiomes-Forge](https://modrinth.com/mod/better-biomes)

This is a mod that adds different biomes to the game!

*Please note that this mod is in beta, and more features will be added along the way.

## Installation

To install this mod on the client, place the `.jar` file in your `mods` folder.

For servers, place the file in the `mods` folder on the server. *Please note that the mod is both server and client side.*

### Current Features include:
Maple trees and the Maple forest biome

## Compatibility

This mod is currently only compatible with the fabric ecosystem, so the requrements are as followed:
- Minecraft 1.20.1
- Forge 47.1.3 or higher

## Contributing

We need language files! To make a lang file, create a fork with the file, then pull request it into the master branch.

## Developing Guide
Better Biomes uses the normal Gradle project structure, and can be compiled by running the gradle task `build`.

## Implementation in your mod
To implement this mod, follow the steps below.

### Maven
Add the maven for either Curse Maven or Modrinth's Maven.
```gradle
repositories {
    maven { url = "https://cursemaven.com" }
    exclusiveContent {
        forRepository {
            maven {
                name = "Modrinth"
                url = "https://api.modrinth.com/maven"
            }
        }
        forRepositories(fg.repository)
        filter {
            includeGroup "maven.modrinth"
      }
    }
}
}
```

### Implementation for ForgeGradle
For ForgeGradle, include the following for either Curse Maven or Modrinth's Maven. You only need one. For Fabric Loom, check out the BetterBiomes repo.
```gradle
implementation fg.deobf("curse.maven:better-biomes-938715:<fileVersion>") //The Version number, ex. for Forge 0.1.2.1, it is curseforge.com/minecraft/mc-mods/better-biomes/files/4886971, so the file ID is 4886971
implementation fg.deobf("maven.modrinth:better-biomes:forge-0.1.2.1") //For Forge's 0.1.2.1 version of Better Biomes
```

#### Requirements

- OpenJDK 17 or higher.
  We recommend using the JDK from [Eclipse Termurin](https://adoptium.net/temurin/releases/?version=17), as it works without issues.

- Gradle 8.3 or higher (optional)
  Gradle is already provided in this repository, so you do not need to download it seperatley

  ## License
  This mod is licensed under MIT License, which is free and open source. For more info, refer to the [license file](LICENSE)

  [Looking for Fabric? Find it here](https://github.com/CrypticVerse/BetterBiomes)
