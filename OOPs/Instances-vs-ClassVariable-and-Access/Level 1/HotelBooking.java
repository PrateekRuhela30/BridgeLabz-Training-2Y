package com.icvm;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Prateek";
        this.roomType = "Luxury";
        this.nights = 2;
    }

    public HotelBooking(String guestName, String roomType,int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking s){
        this.guestName = s.guestName;
        this.roomType = s.roomType;
        this.nights = s.nights;
    }

}
