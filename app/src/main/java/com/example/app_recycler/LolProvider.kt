package com.example.app_recycler

class LolProvider {

    companion object{
        val CharacterList = listOf<Lol>(
            Lol(
                "Nasus",
                "Fighter",
                "Toplaner",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Nasus_25.jpg"
            ),

            Lol(
                "Lucian",
                "Shotter",
                "Botlane",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lucian_0.jpg"
            ),
            Lol(
                "Victor",
                "Wizard",
                "Midlane",
                "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Viktor_0.jpg"
            )
        )
    }
}