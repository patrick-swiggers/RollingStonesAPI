package com.rsapi.rsapi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private final SongRepository repository;

    @Autowired
    public DemoLoader(SongRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Song("	Come On", "1963"));
        this.repository.save(new Song("	I Wanna Be Your Man", "1963"));
        this.repository.save(new Song("	It's All Over Now", "1964"));
        this.repository.save(new Song("	Tell Me (You're Coming Back)", "1964"));
        this.repository.save(new Song("	Empty Heart / Around and around	", "1964"));
        this.repository.save(new Song("	Time Is on My Side", "1964"));
        this.repository.save(new Song("	Tell Me (You're Coming Back)", "1964"));
        this.repository.save(new Song("	Time Is on My Side", "1964"));
        this.repository.save(new Song("	Little Red Rooster", "1965"));
        this.repository.save(new Song("	The Last Time", "1965"));
        this.repository.save(new Song("	Heart of Stone", "1965"));
        this.repository.save(new Song("	Got Live If You Want It!", "1965"));
        this.repository.save(new Song("	(I Can't Get No) Satisfaction", "1965"));
        this.repository.save(new Song("	Get Off of My Cloud", "1965"));
        this.repository.save(new Song("	Rolling Stones", "1965"));
        this.repository.save(new Song("	19th Nervous Breakdown / As Tears Go By", "1966"));
        this.repository.save(new Song("	Paint It, Black", "1966"));
        this.repository.save(new Song("	Lady Jane", "1966"));
        this.repository.save(new Song("	Mother's Little Helper", "1966"));
        this.repository.save(new Song("	Have You Seen Your Mother Baby, Standing in the Shado	", "1966"));
        this.repository.save(new Song("	Let's Spend the Night Together / Ruby Tuesday", "1967"));
        this.repository.save(new Song("	We Love You / Dandelion", "1967"));
        this.repository.save(new Song("	She's a Rainbow / 2000 Light Years from Home", "1967"));
        this.repository.save(new Song("	Jumpin' Jack Flash", "1968"));
        this.repository.save(new Song("	Street Fighting Man", "1968"));
        this.repository.save(new Song("	Honky Tonk Women", "1969"));
        this.repository.save(new Song("	(I Can't Get No) Satisfaction", "1970"));
        this.repository.save(new Song("	Little Queenie", "1971"));
        this.repository.save(new Song("	Brown Sugar", "1971"));
        this.repository.save(new Song("	Street Fighting Man", "1971"));
        this.repository.save(new Song("	Tumbling Dice", "1972"));
        this.repository.save(new Song("	Sad Day", "1973"));
        this.repository.save(new Song("	Angie", "1973"));
        this.repository.save(new Song("	Sympathy for the Devil", "1973"));
        this.repository.save(new Song("	Star Star", "1974"));
        this.repository.save(new Song("	It's Only Rock and Roll (But I Like It)", "1974"));
        this.repository.save(new Song("	Ain't Too Proud To Beg", "1975"));
        this.repository.save(new Song("	(I Can't Get No) Satisfaction", "1975"));
        this.repository.save(new Song("	Fool to Cry", "1976"));
        this.repository.save(new Song("	Miss You", "1978"));
        this.repository.save(new Song("	Respectable", "1978"));
        this.repository.save(new Song("	Emotional Rescue", "1980"));
        this.repository.save(new Song("	She's So Cold", "1980"));
        this.repository.save(new Song("	Start Me Up", "1981"));
        this.repository.save(new Song("	Waiting on a Friend", "1981"));
        this.repository.save(new Song("	Going to a Go-Go (Live)", "1982"));
        this.repository.save(new Song("	Undercover of the Night", "1983"));
        this.repository.save(new Song("	She Was Hot", "1984"));
        this.repository.save(new Song("	Harlem Shuffle", "1986"));
        this.repository.save(new Song("	One Hit (To the Body)", "1986"));
        this.repository.save(new Song("	Mixed Emotions", "1989"));
        this.repository.save(new Song("	Rock and a Hard Place", "1989"));
        this.repository.save(new Song("	Terrifying", "1990"));
        this.repository.save(new Song("	Paint It, Black", "1990"));
        this.repository.save(new Song("	Almost Hear You Sigh", "1990"));
        this.repository.save(new Song("	Angie", "1990"));
        this.repository.save(new Song("	She's a Rainbow", "1990"));
        this.repository.save(new Song("	Sad Sad Sad", "1990"));
        this.repository.save(new Song("	(I Can't Get No) Satisfaction", "1990"));
        this.repository.save(new Song("	Highwire", "1991"));
        this.repository.save(new Song("	Ruby Tuesday (Live)", "1991"));
        this.repository.save(new Song("	Sex Drive", "1991"));
        this.repository.save(new Song("	Jumpin' Jack Flash (Live)", "1992"));
        this.repository.save(new Song("	Love Is Strong", "1994"));
        this.repository.save(new Song("	You Got Me Rocking", "1994"));
        this.repository.save(new Song("	Out of Tears", "1994"));
        this.repository.save(new Song("	I Go Wild", "1995"));
        this.repository.save(new Song("	Like a Rolling Stone", "1995"));
        this.repository.save(new Song("	Wild Horses", "1996"));
        this.repository.save(new Song("	Anybody Seen My Baby?", "1997"));
        this.repository.save(new Song("	Saint of Me", "1998"));
        this.repository.save(new Song("	Don't Stop", "2002"));
        this.repository.save(new Song("	Sympathy for the Devil (remix)", "2003"));
        this.repository.save(new Song("	Streets of Love", "2005"));
        this.repository.save(new Song("	Rain Fall Down", "2005"));
        this.repository.save(new Song("	Biggest Mistake", "2006"));
        this.repository.save(new Song("	Plundered My Soul", "2010"));
        this.repository.save(new Song("	Doom and Gloom", "2012"));
        this.repository.save(new Song("	Living in a Ghost Town", "2020"));
    }
}
