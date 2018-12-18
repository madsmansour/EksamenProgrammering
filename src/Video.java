public class Video extends Media {

    private String fileType;
    private String videoLength;
    private String resolution;
    private String photographer;

    @Override
    public void logToConsol(){
        System.out.println(this.getName() + this.fileType);

    }

}