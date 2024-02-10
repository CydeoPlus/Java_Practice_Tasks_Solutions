package day13_inheritance.state_task;

public class Texas extends State {

    public Texas( String politicalParty, String governor, String senator, int population) {
        super("TX", politicalParty, governor, senator, population);
    }

}