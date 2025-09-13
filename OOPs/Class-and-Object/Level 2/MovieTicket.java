package com.gla;

public class MovieTicket {
        String movieName;
        String seatNumber;
        double price;

        public MovieTicket(String movieName) {
            this.movieName = movieName;
            this.seatNumber = "";
            this.price = 0.0;
        }

        public void bookTicket(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        }

        public void displayTicketDetails() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: " + price);
        }
}
