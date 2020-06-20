package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Chespin", R.drawable.chespin, "Grass"));
        pokemons.add(new Pokemon(2, "Quilladin", R.drawable.quilladin, "Grass"));
        pokemons.add(new Pokemon(3, "Chesnaught", R.drawable.chesnaught, "Grass/Fighting"));
        pokemons.add(new Pokemon(4, "Fennekin", R.drawable.fennekin, "Fire"));
        pokemons.add(new Pokemon(5, "Braixen", R.drawable.braixen, "Fire"));
        pokemons.add(new Pokemon(6, "Delphox", R.drawable.delphox, "Fire/Psychic"));
        pokemons.add(new Pokemon(7, "Froakie", R.drawable.froakie, "Water"));
        pokemons.add(new Pokemon(8, "Frogadier", R.drawable.frogadier, "Water"));
        pokemons.add(new Pokemon(9, "Greninja", R.drawable.greninja, "Water/Dark"));
        pokemons.add(new Pokemon(10, "Bunnelby", R.drawable.bunnelby, "Normal"));
        pokemons.add(new Pokemon(11, "Diggersby", R.drawable.diggersby, "Normal/Ground"));
        pokemons.add(new Pokemon(12, "Fletchling", R.drawable.fletchling, "Normal/Flying"));
        pokemons.add(new Pokemon(13, "Fletchinder", R.drawable.fletchinder, "Fire/Flying"));
        pokemons.add(new Pokemon(14, "Talonflame", R.drawable.talonflame, "Fire/Flying"));
        pokemons.add(new Pokemon(15, "Scatterbug", R.drawable.scatterbug, "Bug"));
        pokemons.add(new Pokemon(16, "Spewpa", R.drawable.spewpa, "Bug"));
        pokemons.add(new Pokemon(17, "Vivillion", R.drawable.vivillon, "Bug/Flying"));
        pokemons.add(new Pokemon(18, "Litleo", R.drawable.litleo, "Fire/Normal"));
        pokemons.add(new Pokemon(19, "Pyroar", R.drawable.pyroar, "Fire/Normal"));
        pokemons.add(new Pokemon(20, "Flabébé", R.drawable.flabebe, "Fairy"));
        pokemons.add(new Pokemon(21, "Floette", R.drawable.floette, "Fairy"));
        pokemons.add(new Pokemon(22, "Florges", R.drawable.florges, "Fairy"));
        pokemons.add(new Pokemon(23, "Skiddo", R.drawable.skiddo, "Grass"));
        pokemons.add(new Pokemon(24, "Gogoat", R.drawable.gogoat, "Grass"));
        pokemons.add(new Pokemon(25, "Pancham", R.drawable.pancham, "Fighting"));
        pokemons.add(new Pokemon(26, "Pangoro", R.drawable.pangoro, "Fighting/Dark"));
        pokemons.add(new Pokemon(27, "Furfrou", R.drawable.furfrou, "Normal"));
        pokemons.add(new Pokemon(28, "Espurr", R.drawable.espurr, "Psychic"));
        pokemons.add(new Pokemon(29, "Meowstic", R.drawable.meowstic, "Psychic"));
        pokemons.add(new Pokemon(30, "Honedge", R.drawable.honedge, "Steel/Ghost"));
        pokemons.add(new Pokemon(31, "Doublade", R.drawable.doublade, "Steel/Ghost"));
        pokemons.add(new Pokemon(32, "Aegislash", R.drawable.aegislash, "Steel/Ghost"));
        pokemons.add(new Pokemon(33, "Spritzee", R.drawable.spritzee, "Fairy"));
        pokemons.add(new Pokemon(34, "Aromatisse", R.drawable.aromatisse, "Fairy"));
        pokemons.add(new Pokemon(35, "Swirlix", R.drawable.swirlix, "Fairy"));
        pokemons.add(new Pokemon(36, "Slurpuff", R.drawable.slurpuff, "Fairy"));
        pokemons.add(new Pokemon(37, "Inkay", R.drawable.inkay, "Dark/Psychic"));
        pokemons.add(new Pokemon(38, "Malamar", R.drawable.malamar, "Dark/Psychic"));
        pokemons.add(new Pokemon(39, "Binacle", R.drawable.binacle, "Rock/Water"));
        pokemons.add(new Pokemon(40, "Barbacle", R.drawable.barbaracle, "Rock/Water"));
        pokemons.add(new Pokemon(41, "Sklerp", R.drawable.skrelp, "Poison/Water"));
        pokemons.add(new Pokemon(42, "Dragalge", R.drawable.dragalge, "Poison/Dragon"));
        pokemons.add(new Pokemon(43, "Clauncher", R.drawable.clauncher, "Water"));
        pokemons.add(new Pokemon(44, "Clawitzer", R.drawable.clawitzer, "Water"));
        pokemons.add(new Pokemon(45, "Helioptile", R.drawable.helioptile, "Electric/Normal"));
        pokemons.add(new Pokemon(46, "Heliolisk", R.drawable.heliolisk, "Electric/Normal"));
        pokemons.add(new Pokemon(47, "Tyrunt", R.drawable.tyrunt, "Rock/Dragon"));
        pokemons.add(new Pokemon(48, "Tyrantrum", R.drawable.tyrantrum, "Rock/Dragon"));
        pokemons.add(new Pokemon(49, "Amaura", R.drawable.amaura, "Rock/Ice"));
        pokemons.add(new Pokemon(50, "Aurorus", R.drawable.aurorus, "Rock/Ice"));
        pokemons.add(new Pokemon(51, "Sylveon", R.drawable.sylveon, "Fairy"));
        pokemons.add(new Pokemon(52, "Hawlucha", R.drawable.hawlucha, "Fighting/Flying"));
        pokemons.add(new Pokemon(53, "Dedenne", R.drawable.dedenne, "Electric/Fairy"));
        pokemons.add(new Pokemon(54, "Carbink", R.drawable.carbink, "Rock/Fairy"));
        pokemons.add(new Pokemon(55, "Goomy", R.drawable.goomy, "Dragon"));
        pokemons.add(new Pokemon(56, "Sliggoo", R.drawable.sliggoo, "Dragon"));
        pokemons.add(new Pokemon(57, "Goodra", R.drawable.goodra, "Dragon"));
        pokemons.add(new Pokemon(58, "Klefki", R.drawable.klefki, "Steel/Fairy"));
        pokemons.add(new Pokemon(59, "Phantump", R.drawable.phantump, "Ghost/Grass"));
        pokemons.add(new Pokemon(60, "Trevenant", R.drawable.trevenant, "Ghost/Grass"));
        pokemons.add(new Pokemon(61, "Pumpkaboo", R.drawable.pumpkaboo, "Ghost/Grass"));
        pokemons.add(new Pokemon(62, "Gourgeist", R.drawable.gourgeist, "Ghost/Grass"));
        pokemons.add(new Pokemon(63, "Bergmite", R.drawable.bergmite, "Ice"));
        pokemons.add(new Pokemon(64, "Avalugg", R.drawable.avalugg, "Ice"));
        pokemons.add(new Pokemon(65, "Noibat", R.drawable.noibat, "Flying/Dragon"));
        pokemons.add(new Pokemon(66, "Noivern", R.drawable.noivern, "Flying/Dragon"));
        pokemons.add(new Pokemon(67, "Xerneas", R.drawable.xerneas, "Fairy"));
        pokemons.add(new Pokemon(68, "Yveltal", R.drawable.yveltal, "Dark/Flying"));
        pokemons.add(new Pokemon(69, "Zygarde", R.drawable.zygarde, "Dragon/Ground"));
        pokemons.add(new Pokemon(70, "Diancie", R.drawable.diancie, "Rock/Fairy"));
        pokemons.add(new Pokemon(71, "Hoopa", R.drawable.hoopa, "Psychic/Ghost"));
        pokemons.add(new Pokemon(72, "Volcanion", R.drawable.volcanion, "Fire/Water"));
        return pokemons;
    }
}
