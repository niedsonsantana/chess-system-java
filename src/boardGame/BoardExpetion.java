package boardGame;

public class BoardExpetion extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public BoardExpetion(String msg){
        super(msg);
    }
}
