package vn.edu.hust.listapp;

public class ContactModel {

    private String username;
    private String message;
    private int avatar;
    private String time;
    private boolean selected;

    public ContactModel(String username, String message, int avatar , String time ) {
        this.username = username;
        this.message = message;
        this.time=time;
        this.avatar = avatar;

        this.selected = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstChar(){
        return String.valueOf(username.charAt(0));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String email) {
        this.message = message;
    }

    public String getTime(){ return time;}

    public void setTime(String time) { this.time = time ;}

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }



    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
