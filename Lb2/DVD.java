package Lb2;

class DVD {
    private String title;
    private int duration;
    private boolean isBorrowed;

    public DVD(int duration, String title) {
        this. title = title;
        this.duration = duration;
        this.isBorrowed = false;
    }

    public boolean isCheckedOut() {
        return isBorrowed;
    }

    public void checkOut() {
        isBorrowed = true;
    }

    public void checkIn() {
        isBorrowed = false;
    }
}
